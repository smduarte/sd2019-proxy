package microgram.impl.proxy;

import java.io.IOException;
import java.net.URI;
import java.util.List;
import java.util.logging.Logger;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import microgram.api.Post;
import microgram.api.Profile;
import microgram.api.java.Media;
import microgram.api.java.Posts;
import microgram.api.java.Profiles;
import microgram.api.java.Result;
import microgram.impl.clt.Clients;
import microgram.impl.clt.rest.RestPostsClient;
import microgram.impl.clt.rest.RestProfilesClient;
import microgram.impl.clt.soap.SoapProfilesClient;
import microgram.impl.proxy.discovery.Discovery;
import microgram.impl.proxy.grpc.MicrogramGrpc;
import microgram.impl.proxy.grpc.MicrogramProfoBuf.BoolResult;
import microgram.impl.proxy.grpc.MicrogramProfoBuf.FollowRequest;
import microgram.impl.proxy.grpc.MicrogramProfoBuf.LikeRequest;
import microgram.impl.proxy.grpc.MicrogramProfoBuf.PostData;
import microgram.impl.proxy.grpc.MicrogramProfoBuf.PostId;
import microgram.impl.proxy.grpc.MicrogramProfoBuf.PostIdUserId;
import microgram.impl.proxy.grpc.MicrogramProfoBuf.ProfileQuery;
import microgram.impl.proxy.grpc.MicrogramProfoBuf.ProfileRequest;
import microgram.impl.proxy.grpc.MicrogramProfoBuf.UserId;
import microgram.impl.proxy.grpc.MicrogramProfoBuf.UserPair;
import microgram.impl.proxy.grpc.MicrogramProfoBuf.gPost;
import microgram.impl.proxy.grpc.MicrogramProfoBuf.gProfile;
import utils.IP;

public class MicrogramProxyServer {
	private static final Logger logger = Logger.getLogger(MicrogramProxyServer.class.getName());

	private static final int PORT = 8998;
	private static final String MICROGRAM_PROXY = "PROXY-MICROGRAM";

	private final int port;
	private final Server server;

	/**
	 * Create a RouteGuide server using serverBuilder as a base and features as
	 * data.
	 */
	public MicrogramProxyServer(int port) {
		this.port = port;
		server = ServerBuilder.forPort(port).addService(new MicrogramProxy()).build();
	}

	/** Start serving requests. */
	public void start() throws IOException {
		server.start();
		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				// Use stderr here since the logger may has been reset by its JVM shutdown hook.
				System.err.println("*** shutting down gRPC server since JVM is shutting down");
				MicrogramProxyServer.this.stop();
				System.err.println("*** server shut down");
			}
		});
	}



	/** Stop serving requests and shutdown resources. */
	public void stop() {
		if (server != null) {
			server.shutdown();
		}
	}

	/**
	 * Await termination on the main thread since the grpc library uses daemon
	 * threads.
	 */
	private void blockUntilShutdown() throws InterruptedException {
		if (server != null) {
			server.awaitTermination();
		}
	}

	/**
	 * Main method. This comment makes the linter happy.
	 */
	public static void main(String[] args) throws Exception {
		System.setProperty("java.net.preferIPv4Stack", "true");
		System.setProperty("java.util.logging.SimpleFormatter.format", "%4$s: %5$s\n");
		
		String proxyURI = String.format("grpc://%s:%d", IP.hostAddress(), PORT);
		Discovery.announce(MICROGRAM_PROXY, proxyURI);
		logger.info("gRPC Server started, listening on: " + proxyURI);

		MicrogramProxyServer server = new MicrogramProxyServer(PORT);
		server.start();
		server.blockUntilShutdown();
	}
}

class MicrogramProxy extends MicrogramGrpc.MicrogramImplBase {

	
	String jimmy = "https://wikimediafoundation.org/wp-content/uploads/2018/07/Jimmy_Wales-1-e1531761636394.jpg";
	String marcelo = "https://upload.wikimedia.org/wikipedia/commons/f/fb/Marcelo_Rebelo_de_Sousa%2C_Visita_de_Estado_ao_M%C3%A9xico_2017-07-17.png";
	String bliskov = "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6c/Barbara_liskov.jpg/400px-Barbara_liskov.jpg";
			
	final Media media;
	final Posts posts;
	final Profiles profiles;

	MicrogramProxy() {
		
		this.posts = Clients.getPosts();
		this.media = Clients.getMedia();
		this.profiles = Clients.getProfiles();
		
		this.profiles.createProfile(new Profile("jimmy", "Jimmy Wales", jimmy, 0, 0, 0));
		this.profiles.getProfile("jimmy");
		
		this.profiles.createProfile(new Profile("bliskov", "Barbara Liskov", bliskov, 0, 99, 1));
		this.profiles.getProfile("liskov");
		
		this.posts.createPost( new Post("xyz", "bliskov", bliskov, "@di.fct.unl Distinguished Lecture #1, Lisbon, Portugal", System.currentTimeMillis(), 0));
			
		this.posts.createPost( new Post("123", "jimmy", jimmy, "@Wikipedia", System.currentTimeMillis(), 0));
		this.profiles.createProfile(new Profile("marcelo", "Marcelo Rebelo de Sousa", marcelo, 0, 0, 0));
		Result<String> p1 = this.posts.createPost( new Post("321", "marcelo", marcelo, "@Portugal", System.currentTimeMillis(), 0));
		
		this.posts.like(p1.value(), "jimmy", true);
	}

	
	Profiles getProfilesClient( URI uri ) {
		if( uri.toString().endsWith("/soap"))
			return new SoapProfilesClient( uri );
		else
			return new RestProfilesClient(uri);
	}
	
	Posts getPostsClient( URI uri ) {
		if( uri.toString().endsWith("/soap"))
			return new RestPostsClient( uri );
		else
			return new RestPostsClient(uri);
	}

	
	@Override
	public void searchProfiles(ProfileQuery request, StreamObserver<gProfile> responseObserver) {
		System.err.printf("searchProfiles: %s\n", request.getValue() + "=>" + profiles.search(request.getValue()));

		if( request.getExact() ) {
			Result<Profile> result = profiles.getProfile( request.getValue() );
			if( result.isOK() )
				responseObserver.onNext( gProfileFrom( result.value() ) );
		}
		else {
			profiles.search(request.getValue()).value().forEach(v -> {
				responseObserver.onNext(gProfileFrom(v));
			});
		}
		responseObserver.onCompleted();
	}

	@Override
	public void getProfile(ProfileRequest request, StreamObserver<gProfile> responseObserver) {
		System.err.printf("getProfile: %s %s\n", request.getProfile().getUserId(), request.getAutocreate());

		Profile p = profileFrom( request.getProfile() );
		try {
			Result<Profile> result = profiles.getProfile( p.getUserId() );
			if( ! result.isOK() && request.getAutocreate() ) {
				if( profiles.createProfile(p).isOK() )
					responseObserver.onNext( request.getProfile() );				
			} else
				responseObserver.onNext( gProfileFrom( result.value() ));
		} catch (Exception x) {
			x.printStackTrace();
		}
		responseObserver.onCompleted();
	}

	@Override
	public void createPost(PostData request, StreamObserver<PostId> responseObserver) {
		System.err.printf("createPost: %s\n", request.getUserId());

		Result<String> mediaUrl = media.upload(request.getData().toByteArray());
		System.err.println( mediaUrl );
		if( mediaUrl.isOK() ) {
			Post post = new Post();
			post.setOwnerId(request.getUserId());
			post.setLocation(request.getLocation());
			post.setMediaUrl(mediaUrl.value());
			post.setTimestamp(System.currentTimeMillis());
			Result<String> postId = posts.createPost(post);
			System.err.println( postId );
			if( postId.isOK() )
				responseObserver.onNext(PostId.newBuilder().setValue(postId.value()).build());
		}
		responseObserver.onCompleted();
	}

	@Override
	public void getPost(PostId request, StreamObserver<gPost> responseObserver) {
		System.err.printf("getPost: %s\n", request.getValue());

		Result<Post> post = posts.getPost(request.getValue());
		if (post.isOK() )
			responseObserver.onNext( gPostFrom(post.value()));
		responseObserver.onCompleted();
	}

	@Override
	public void getUserPosts(UserId request, StreamObserver<PostId> responseObserver) {
		System.err.printf("getUserPosts: %s\n", request.getValue());

		Result<List<String>> userPosts = posts.getPosts( request.getValue() );
		
		System.err.println( userPosts );

		if( userPosts.isOK() )
		 userPosts.value().forEach( s -> {
			responseObserver.onNext( PostId.newBuilder().setValue( s).build() );
		});
		responseObserver.onCompleted();
	}

	@Override
	public void getFeedPosts(UserId request, StreamObserver<PostId> responseObserver) {
		System.err.printf("getFeedPosts: %s\n", request.getValue());
		
		Result<List<String>> feedPosts = posts.getFeed( request.getValue() );
		
		System.err.println( feedPosts );
		
		if( feedPosts.isOK() )
			feedPosts.value().forEach( s -> {
				responseObserver.onNext( PostId.newBuilder().setValue( s).build() );
			});
		responseObserver.onCompleted();
	}

	@Override
    public void isLiked(PostIdUserId request, StreamObserver<BoolResult> responseObserver) {
    	Result<Boolean> isLiked =posts.isLiked( request.getPostId(), request.getUserId() );
    	if( isLiked.isOK() )
    		responseObserver.onNext( BoolResult.newBuilder().setValue(isLiked.value()).build());
    	responseObserver.onCompleted();
    }
    
	@Override
    public void like(LikeRequest request, StreamObserver<BoolResult> responseObserver) {
		
		Result<Void> result = posts.like( request.getPostId(), request.getUserId(), request.getIsLiked() );
		if( result.isOK() )
			responseObserver.onNext( BoolResult.newBuilder().setValue(true).build());
    	responseObserver.onCompleted();
    }
	
	
	@Override
    public void isFollowing(UserPair request, StreamObserver<BoolResult> responseObserver) {
		Result<Boolean> isFollowing = profiles.isFollowing( request.getUserId1(), request.getUserId2() );
    	if( isFollowing.isOK() )
    		responseObserver.onNext( BoolResult.newBuilder().setValue(isFollowing.value()).build());
    	responseObserver.onCompleted();
    }
    
	@Override
    public void follow(FollowRequest request, StreamObserver<BoolResult> responseObserver) {
		
		Result<Void> result = profiles.follow( request.getUserId1(), request.getUserId2(), request.getIsFollowing());

		responseObserver.onNext( BoolResult.newBuilder().setValue( result.isOK() ).build());
    	responseObserver.onCompleted();
    }
	
	private gProfile gProfileFrom(Profile v) {
		return gProfile.newBuilder().setUserId(v.getUserId()).setFullName(v.getFullName()).setPhotoUrl(v.getPhotoUrl())
				.setFollowers(v.getFollowers()).setFollowing(v.getFollowing()).setPosts(v.getPosts()).build();
	}

	private gPost gPostFrom(Post v) {
		return gPost.newBuilder().setLikes(v.getLikes()).setMediaUrl(v.getMediaUrl()).setOwnerId(v.getOwnerId())
				.setLocation(v.getLocation()).setTimestamp( v.getTimestamp() ).build();
	}

	private Profile profileFrom( gProfile gp ) {
		Profile res = new Profile();
		res.setUserId( gp.getUserId() );
		res.setPhotoUrl( gp.getPhotoUrl() );
		res.setFullName( gp.getFullName() );
		return res;
	}
}
