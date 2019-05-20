package microgram.impl.proxy.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.18.0)",
    comments = "Source: microgram.proto")
public final class MicrogramGrpc {

  private MicrogramGrpc() {}

  public static final String SERVICE_NAME = "Microgram";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<microgram.impl.proxy.grpc.MicrogramProfoBuf.ProfileRequest,
      microgram.impl.proxy.grpc.MicrogramProfoBuf.gProfile> getGetProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProfile",
      requestType = microgram.impl.proxy.grpc.MicrogramProfoBuf.ProfileRequest.class,
      responseType = microgram.impl.proxy.grpc.MicrogramProfoBuf.gProfile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<microgram.impl.proxy.grpc.MicrogramProfoBuf.ProfileRequest,
      microgram.impl.proxy.grpc.MicrogramProfoBuf.gProfile> getGetProfileMethod() {
    io.grpc.MethodDescriptor<microgram.impl.proxy.grpc.MicrogramProfoBuf.ProfileRequest, microgram.impl.proxy.grpc.MicrogramProfoBuf.gProfile> getGetProfileMethod;
    if ((getGetProfileMethod = MicrogramGrpc.getGetProfileMethod) == null) {
      synchronized (MicrogramGrpc.class) {
        if ((getGetProfileMethod = MicrogramGrpc.getGetProfileMethod) == null) {
          MicrogramGrpc.getGetProfileMethod = getGetProfileMethod = 
              io.grpc.MethodDescriptor.<microgram.impl.proxy.grpc.MicrogramProfoBuf.ProfileRequest, microgram.impl.proxy.grpc.MicrogramProfoBuf.gProfile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Microgram", "GetProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  microgram.impl.proxy.grpc.MicrogramProfoBuf.ProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  microgram.impl.proxy.grpc.MicrogramProfoBuf.gProfile.getDefaultInstance()))
                  .setSchemaDescriptor(new MicrogramMethodDescriptorSupplier("GetProfile"))
                  .build();
          }
        }
     }
     return getGetProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<microgram.impl.proxy.grpc.MicrogramProfoBuf.ProfileQuery,
      microgram.impl.proxy.grpc.MicrogramProfoBuf.gProfile> getSearchProfilesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchProfiles",
      requestType = microgram.impl.proxy.grpc.MicrogramProfoBuf.ProfileQuery.class,
      responseType = microgram.impl.proxy.grpc.MicrogramProfoBuf.gProfile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<microgram.impl.proxy.grpc.MicrogramProfoBuf.ProfileQuery,
      microgram.impl.proxy.grpc.MicrogramProfoBuf.gProfile> getSearchProfilesMethod() {
    io.grpc.MethodDescriptor<microgram.impl.proxy.grpc.MicrogramProfoBuf.ProfileQuery, microgram.impl.proxy.grpc.MicrogramProfoBuf.gProfile> getSearchProfilesMethod;
    if ((getSearchProfilesMethod = MicrogramGrpc.getSearchProfilesMethod) == null) {
      synchronized (MicrogramGrpc.class) {
        if ((getSearchProfilesMethod = MicrogramGrpc.getSearchProfilesMethod) == null) {
          MicrogramGrpc.getSearchProfilesMethod = getSearchProfilesMethod = 
              io.grpc.MethodDescriptor.<microgram.impl.proxy.grpc.MicrogramProfoBuf.ProfileQuery, microgram.impl.proxy.grpc.MicrogramProfoBuf.gProfile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "Microgram", "SearchProfiles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  microgram.impl.proxy.grpc.MicrogramProfoBuf.ProfileQuery.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  microgram.impl.proxy.grpc.MicrogramProfoBuf.gProfile.getDefaultInstance()))
                  .setSchemaDescriptor(new MicrogramMethodDescriptorSupplier("SearchProfiles"))
                  .build();
          }
        }
     }
     return getSearchProfilesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<microgram.impl.proxy.grpc.MicrogramProfoBuf.FollowRequest,
      microgram.impl.proxy.grpc.MicrogramProfoBuf.BoolResult> getFollowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Follow",
      requestType = microgram.impl.proxy.grpc.MicrogramProfoBuf.FollowRequest.class,
      responseType = microgram.impl.proxy.grpc.MicrogramProfoBuf.BoolResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<microgram.impl.proxy.grpc.MicrogramProfoBuf.FollowRequest,
      microgram.impl.proxy.grpc.MicrogramProfoBuf.BoolResult> getFollowMethod() {
    io.grpc.MethodDescriptor<microgram.impl.proxy.grpc.MicrogramProfoBuf.FollowRequest, microgram.impl.proxy.grpc.MicrogramProfoBuf.BoolResult> getFollowMethod;
    if ((getFollowMethod = MicrogramGrpc.getFollowMethod) == null) {
      synchronized (MicrogramGrpc.class) {
        if ((getFollowMethod = MicrogramGrpc.getFollowMethod) == null) {
          MicrogramGrpc.getFollowMethod = getFollowMethod = 
              io.grpc.MethodDescriptor.<microgram.impl.proxy.grpc.MicrogramProfoBuf.FollowRequest, microgram.impl.proxy.grpc.MicrogramProfoBuf.BoolResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Microgram", "Follow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  microgram.impl.proxy.grpc.MicrogramProfoBuf.FollowRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  microgram.impl.proxy.grpc.MicrogramProfoBuf.BoolResult.getDefaultInstance()))
                  .setSchemaDescriptor(new MicrogramMethodDescriptorSupplier("Follow"))
                  .build();
          }
        }
     }
     return getFollowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<microgram.impl.proxy.grpc.MicrogramProfoBuf.UserPair,
      microgram.impl.proxy.grpc.MicrogramProfoBuf.BoolResult> getIsFollowingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "isFollowing",
      requestType = microgram.impl.proxy.grpc.MicrogramProfoBuf.UserPair.class,
      responseType = microgram.impl.proxy.grpc.MicrogramProfoBuf.BoolResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<microgram.impl.proxy.grpc.MicrogramProfoBuf.UserPair,
      microgram.impl.proxy.grpc.MicrogramProfoBuf.BoolResult> getIsFollowingMethod() {
    io.grpc.MethodDescriptor<microgram.impl.proxy.grpc.MicrogramProfoBuf.UserPair, microgram.impl.proxy.grpc.MicrogramProfoBuf.BoolResult> getIsFollowingMethod;
    if ((getIsFollowingMethod = MicrogramGrpc.getIsFollowingMethod) == null) {
      synchronized (MicrogramGrpc.class) {
        if ((getIsFollowingMethod = MicrogramGrpc.getIsFollowingMethod) == null) {
          MicrogramGrpc.getIsFollowingMethod = getIsFollowingMethod = 
              io.grpc.MethodDescriptor.<microgram.impl.proxy.grpc.MicrogramProfoBuf.UserPair, microgram.impl.proxy.grpc.MicrogramProfoBuf.BoolResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Microgram", "isFollowing"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  microgram.impl.proxy.grpc.MicrogramProfoBuf.UserPair.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  microgram.impl.proxy.grpc.MicrogramProfoBuf.BoolResult.getDefaultInstance()))
                  .setSchemaDescriptor(new MicrogramMethodDescriptorSupplier("isFollowing"))
                  .build();
          }
        }
     }
     return getIsFollowingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<microgram.impl.proxy.grpc.MicrogramProfoBuf.PostId,
      microgram.impl.proxy.grpc.MicrogramProfoBuf.gPost> getGetPostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPost",
      requestType = microgram.impl.proxy.grpc.MicrogramProfoBuf.PostId.class,
      responseType = microgram.impl.proxy.grpc.MicrogramProfoBuf.gPost.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<microgram.impl.proxy.grpc.MicrogramProfoBuf.PostId,
      microgram.impl.proxy.grpc.MicrogramProfoBuf.gPost> getGetPostMethod() {
    io.grpc.MethodDescriptor<microgram.impl.proxy.grpc.MicrogramProfoBuf.PostId, microgram.impl.proxy.grpc.MicrogramProfoBuf.gPost> getGetPostMethod;
    if ((getGetPostMethod = MicrogramGrpc.getGetPostMethod) == null) {
      synchronized (MicrogramGrpc.class) {
        if ((getGetPostMethod = MicrogramGrpc.getGetPostMethod) == null) {
          MicrogramGrpc.getGetPostMethod = getGetPostMethod = 
              io.grpc.MethodDescriptor.<microgram.impl.proxy.grpc.MicrogramProfoBuf.PostId, microgram.impl.proxy.grpc.MicrogramProfoBuf.gPost>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "Microgram", "GetPost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  microgram.impl.proxy.grpc.MicrogramProfoBuf.PostId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  microgram.impl.proxy.grpc.MicrogramProfoBuf.gPost.getDefaultInstance()))
                  .setSchemaDescriptor(new MicrogramMethodDescriptorSupplier("GetPost"))
                  .build();
          }
        }
     }
     return getGetPostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<microgram.impl.proxy.grpc.MicrogramProfoBuf.PostData,
      microgram.impl.proxy.grpc.MicrogramProfoBuf.PostId> getCreatePostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePost",
      requestType = microgram.impl.proxy.grpc.MicrogramProfoBuf.PostData.class,
      responseType = microgram.impl.proxy.grpc.MicrogramProfoBuf.PostId.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<microgram.impl.proxy.grpc.MicrogramProfoBuf.PostData,
      microgram.impl.proxy.grpc.MicrogramProfoBuf.PostId> getCreatePostMethod() {
    io.grpc.MethodDescriptor<microgram.impl.proxy.grpc.MicrogramProfoBuf.PostData, microgram.impl.proxy.grpc.MicrogramProfoBuf.PostId> getCreatePostMethod;
    if ((getCreatePostMethod = MicrogramGrpc.getCreatePostMethod) == null) {
      synchronized (MicrogramGrpc.class) {
        if ((getCreatePostMethod = MicrogramGrpc.getCreatePostMethod) == null) {
          MicrogramGrpc.getCreatePostMethod = getCreatePostMethod = 
              io.grpc.MethodDescriptor.<microgram.impl.proxy.grpc.MicrogramProfoBuf.PostData, microgram.impl.proxy.grpc.MicrogramProfoBuf.PostId>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Microgram", "CreatePost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  microgram.impl.proxy.grpc.MicrogramProfoBuf.PostData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  microgram.impl.proxy.grpc.MicrogramProfoBuf.PostId.getDefaultInstance()))
                  .setSchemaDescriptor(new MicrogramMethodDescriptorSupplier("CreatePost"))
                  .build();
          }
        }
     }
     return getCreatePostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<microgram.impl.proxy.grpc.MicrogramProfoBuf.LikeRequest,
      microgram.impl.proxy.grpc.MicrogramProfoBuf.BoolResult> getLikeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Like",
      requestType = microgram.impl.proxy.grpc.MicrogramProfoBuf.LikeRequest.class,
      responseType = microgram.impl.proxy.grpc.MicrogramProfoBuf.BoolResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<microgram.impl.proxy.grpc.MicrogramProfoBuf.LikeRequest,
      microgram.impl.proxy.grpc.MicrogramProfoBuf.BoolResult> getLikeMethod() {
    io.grpc.MethodDescriptor<microgram.impl.proxy.grpc.MicrogramProfoBuf.LikeRequest, microgram.impl.proxy.grpc.MicrogramProfoBuf.BoolResult> getLikeMethod;
    if ((getLikeMethod = MicrogramGrpc.getLikeMethod) == null) {
      synchronized (MicrogramGrpc.class) {
        if ((getLikeMethod = MicrogramGrpc.getLikeMethod) == null) {
          MicrogramGrpc.getLikeMethod = getLikeMethod = 
              io.grpc.MethodDescriptor.<microgram.impl.proxy.grpc.MicrogramProfoBuf.LikeRequest, microgram.impl.proxy.grpc.MicrogramProfoBuf.BoolResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Microgram", "Like"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  microgram.impl.proxy.grpc.MicrogramProfoBuf.LikeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  microgram.impl.proxy.grpc.MicrogramProfoBuf.BoolResult.getDefaultInstance()))
                  .setSchemaDescriptor(new MicrogramMethodDescriptorSupplier("Like"))
                  .build();
          }
        }
     }
     return getLikeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<microgram.impl.proxy.grpc.MicrogramProfoBuf.PostIdUserId,
      microgram.impl.proxy.grpc.MicrogramProfoBuf.BoolResult> getIsLikedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsLiked",
      requestType = microgram.impl.proxy.grpc.MicrogramProfoBuf.PostIdUserId.class,
      responseType = microgram.impl.proxy.grpc.MicrogramProfoBuf.BoolResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<microgram.impl.proxy.grpc.MicrogramProfoBuf.PostIdUserId,
      microgram.impl.proxy.grpc.MicrogramProfoBuf.BoolResult> getIsLikedMethod() {
    io.grpc.MethodDescriptor<microgram.impl.proxy.grpc.MicrogramProfoBuf.PostIdUserId, microgram.impl.proxy.grpc.MicrogramProfoBuf.BoolResult> getIsLikedMethod;
    if ((getIsLikedMethod = MicrogramGrpc.getIsLikedMethod) == null) {
      synchronized (MicrogramGrpc.class) {
        if ((getIsLikedMethod = MicrogramGrpc.getIsLikedMethod) == null) {
          MicrogramGrpc.getIsLikedMethod = getIsLikedMethod = 
              io.grpc.MethodDescriptor.<microgram.impl.proxy.grpc.MicrogramProfoBuf.PostIdUserId, microgram.impl.proxy.grpc.MicrogramProfoBuf.BoolResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Microgram", "IsLiked"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  microgram.impl.proxy.grpc.MicrogramProfoBuf.PostIdUserId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  microgram.impl.proxy.grpc.MicrogramProfoBuf.BoolResult.getDefaultInstance()))
                  .setSchemaDescriptor(new MicrogramMethodDescriptorSupplier("IsLiked"))
                  .build();
          }
        }
     }
     return getIsLikedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<microgram.impl.proxy.grpc.MicrogramProfoBuf.UserId,
      microgram.impl.proxy.grpc.MicrogramProfoBuf.PostId> getGetUserPostsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserPosts",
      requestType = microgram.impl.proxy.grpc.MicrogramProfoBuf.UserId.class,
      responseType = microgram.impl.proxy.grpc.MicrogramProfoBuf.PostId.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<microgram.impl.proxy.grpc.MicrogramProfoBuf.UserId,
      microgram.impl.proxy.grpc.MicrogramProfoBuf.PostId> getGetUserPostsMethod() {
    io.grpc.MethodDescriptor<microgram.impl.proxy.grpc.MicrogramProfoBuf.UserId, microgram.impl.proxy.grpc.MicrogramProfoBuf.PostId> getGetUserPostsMethod;
    if ((getGetUserPostsMethod = MicrogramGrpc.getGetUserPostsMethod) == null) {
      synchronized (MicrogramGrpc.class) {
        if ((getGetUserPostsMethod = MicrogramGrpc.getGetUserPostsMethod) == null) {
          MicrogramGrpc.getGetUserPostsMethod = getGetUserPostsMethod = 
              io.grpc.MethodDescriptor.<microgram.impl.proxy.grpc.MicrogramProfoBuf.UserId, microgram.impl.proxy.grpc.MicrogramProfoBuf.PostId>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "Microgram", "GetUserPosts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  microgram.impl.proxy.grpc.MicrogramProfoBuf.UserId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  microgram.impl.proxy.grpc.MicrogramProfoBuf.PostId.getDefaultInstance()))
                  .setSchemaDescriptor(new MicrogramMethodDescriptorSupplier("GetUserPosts"))
                  .build();
          }
        }
     }
     return getGetUserPostsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<microgram.impl.proxy.grpc.MicrogramProfoBuf.UserId,
      microgram.impl.proxy.grpc.MicrogramProfoBuf.PostId> getGetFeedPostsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFeedPosts",
      requestType = microgram.impl.proxy.grpc.MicrogramProfoBuf.UserId.class,
      responseType = microgram.impl.proxy.grpc.MicrogramProfoBuf.PostId.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<microgram.impl.proxy.grpc.MicrogramProfoBuf.UserId,
      microgram.impl.proxy.grpc.MicrogramProfoBuf.PostId> getGetFeedPostsMethod() {
    io.grpc.MethodDescriptor<microgram.impl.proxy.grpc.MicrogramProfoBuf.UserId, microgram.impl.proxy.grpc.MicrogramProfoBuf.PostId> getGetFeedPostsMethod;
    if ((getGetFeedPostsMethod = MicrogramGrpc.getGetFeedPostsMethod) == null) {
      synchronized (MicrogramGrpc.class) {
        if ((getGetFeedPostsMethod = MicrogramGrpc.getGetFeedPostsMethod) == null) {
          MicrogramGrpc.getGetFeedPostsMethod = getGetFeedPostsMethod = 
              io.grpc.MethodDescriptor.<microgram.impl.proxy.grpc.MicrogramProfoBuf.UserId, microgram.impl.proxy.grpc.MicrogramProfoBuf.PostId>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "Microgram", "GetFeedPosts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  microgram.impl.proxy.grpc.MicrogramProfoBuf.UserId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  microgram.impl.proxy.grpc.MicrogramProfoBuf.PostId.getDefaultInstance()))
                  .setSchemaDescriptor(new MicrogramMethodDescriptorSupplier("GetFeedPosts"))
                  .build();
          }
        }
     }
     return getGetFeedPostsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MicrogramStub newStub(io.grpc.Channel channel) {
    return new MicrogramStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MicrogramBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MicrogramBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MicrogramFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MicrogramFutureStub(channel);
  }

  /**
   */
  public static abstract class MicrogramImplBase implements io.grpc.BindableService {

    /**
     */
    public void getProfile(microgram.impl.proxy.grpc.MicrogramProfoBuf.ProfileRequest request,
        io.grpc.stub.StreamObserver<microgram.impl.proxy.grpc.MicrogramProfoBuf.gProfile> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProfileMethod(), responseObserver);
    }

    /**
     */
    public void searchProfiles(microgram.impl.proxy.grpc.MicrogramProfoBuf.ProfileQuery request,
        io.grpc.stub.StreamObserver<microgram.impl.proxy.grpc.MicrogramProfoBuf.gProfile> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchProfilesMethod(), responseObserver);
    }

    /**
     */
    public void follow(microgram.impl.proxy.grpc.MicrogramProfoBuf.FollowRequest request,
        io.grpc.stub.StreamObserver<microgram.impl.proxy.grpc.MicrogramProfoBuf.BoolResult> responseObserver) {
      asyncUnimplementedUnaryCall(getFollowMethod(), responseObserver);
    }

    /**
     */
    public void isFollowing(microgram.impl.proxy.grpc.MicrogramProfoBuf.UserPair request,
        io.grpc.stub.StreamObserver<microgram.impl.proxy.grpc.MicrogramProfoBuf.BoolResult> responseObserver) {
      asyncUnimplementedUnaryCall(getIsFollowingMethod(), responseObserver);
    }

    /**
     */
    public void getPost(microgram.impl.proxy.grpc.MicrogramProfoBuf.PostId request,
        io.grpc.stub.StreamObserver<microgram.impl.proxy.grpc.MicrogramProfoBuf.gPost> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPostMethod(), responseObserver);
    }

    /**
     */
    public void createPost(microgram.impl.proxy.grpc.MicrogramProfoBuf.PostData request,
        io.grpc.stub.StreamObserver<microgram.impl.proxy.grpc.MicrogramProfoBuf.PostId> responseObserver) {
      asyncUnimplementedUnaryCall(getCreatePostMethod(), responseObserver);
    }

    /**
     */
    public void like(microgram.impl.proxy.grpc.MicrogramProfoBuf.LikeRequest request,
        io.grpc.stub.StreamObserver<microgram.impl.proxy.grpc.MicrogramProfoBuf.BoolResult> responseObserver) {
      asyncUnimplementedUnaryCall(getLikeMethod(), responseObserver);
    }

    /**
     */
    public void isLiked(microgram.impl.proxy.grpc.MicrogramProfoBuf.PostIdUserId request,
        io.grpc.stub.StreamObserver<microgram.impl.proxy.grpc.MicrogramProfoBuf.BoolResult> responseObserver) {
      asyncUnimplementedUnaryCall(getIsLikedMethod(), responseObserver);
    }

    /**
     */
    public void getUserPosts(microgram.impl.proxy.grpc.MicrogramProfoBuf.UserId request,
        io.grpc.stub.StreamObserver<microgram.impl.proxy.grpc.MicrogramProfoBuf.PostId> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserPostsMethod(), responseObserver);
    }

    /**
     */
    public void getFeedPosts(microgram.impl.proxy.grpc.MicrogramProfoBuf.UserId request,
        io.grpc.stub.StreamObserver<microgram.impl.proxy.grpc.MicrogramProfoBuf.PostId> responseObserver) {
      asyncUnimplementedUnaryCall(getGetFeedPostsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetProfileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                microgram.impl.proxy.grpc.MicrogramProfoBuf.ProfileRequest,
                microgram.impl.proxy.grpc.MicrogramProfoBuf.gProfile>(
                  this, METHODID_GET_PROFILE)))
          .addMethod(
            getSearchProfilesMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                microgram.impl.proxy.grpc.MicrogramProfoBuf.ProfileQuery,
                microgram.impl.proxy.grpc.MicrogramProfoBuf.gProfile>(
                  this, METHODID_SEARCH_PROFILES)))
          .addMethod(
            getFollowMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                microgram.impl.proxy.grpc.MicrogramProfoBuf.FollowRequest,
                microgram.impl.proxy.grpc.MicrogramProfoBuf.BoolResult>(
                  this, METHODID_FOLLOW)))
          .addMethod(
            getIsFollowingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                microgram.impl.proxy.grpc.MicrogramProfoBuf.UserPair,
                microgram.impl.proxy.grpc.MicrogramProfoBuf.BoolResult>(
                  this, METHODID_IS_FOLLOWING)))
          .addMethod(
            getGetPostMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                microgram.impl.proxy.grpc.MicrogramProfoBuf.PostId,
                microgram.impl.proxy.grpc.MicrogramProfoBuf.gPost>(
                  this, METHODID_GET_POST)))
          .addMethod(
            getCreatePostMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                microgram.impl.proxy.grpc.MicrogramProfoBuf.PostData,
                microgram.impl.proxy.grpc.MicrogramProfoBuf.PostId>(
                  this, METHODID_CREATE_POST)))
          .addMethod(
            getLikeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                microgram.impl.proxy.grpc.MicrogramProfoBuf.LikeRequest,
                microgram.impl.proxy.grpc.MicrogramProfoBuf.BoolResult>(
                  this, METHODID_LIKE)))
          .addMethod(
            getIsLikedMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                microgram.impl.proxy.grpc.MicrogramProfoBuf.PostIdUserId,
                microgram.impl.proxy.grpc.MicrogramProfoBuf.BoolResult>(
                  this, METHODID_IS_LIKED)))
          .addMethod(
            getGetUserPostsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                microgram.impl.proxy.grpc.MicrogramProfoBuf.UserId,
                microgram.impl.proxy.grpc.MicrogramProfoBuf.PostId>(
                  this, METHODID_GET_USER_POSTS)))
          .addMethod(
            getGetFeedPostsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                microgram.impl.proxy.grpc.MicrogramProfoBuf.UserId,
                microgram.impl.proxy.grpc.MicrogramProfoBuf.PostId>(
                  this, METHODID_GET_FEED_POSTS)))
          .build();
    }
  }

  /**
   */
  public static final class MicrogramStub extends io.grpc.stub.AbstractStub<MicrogramStub> {
    private MicrogramStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MicrogramStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MicrogramStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MicrogramStub(channel, callOptions);
    }

    /**
     */
    public void getProfile(microgram.impl.proxy.grpc.MicrogramProfoBuf.ProfileRequest request,
        io.grpc.stub.StreamObserver<microgram.impl.proxy.grpc.MicrogramProfoBuf.gProfile> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchProfiles(microgram.impl.proxy.grpc.MicrogramProfoBuf.ProfileQuery request,
        io.grpc.stub.StreamObserver<microgram.impl.proxy.grpc.MicrogramProfoBuf.gProfile> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSearchProfilesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void follow(microgram.impl.proxy.grpc.MicrogramProfoBuf.FollowRequest request,
        io.grpc.stub.StreamObserver<microgram.impl.proxy.grpc.MicrogramProfoBuf.BoolResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFollowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void isFollowing(microgram.impl.proxy.grpc.MicrogramProfoBuf.UserPair request,
        io.grpc.stub.StreamObserver<microgram.impl.proxy.grpc.MicrogramProfoBuf.BoolResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIsFollowingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPost(microgram.impl.proxy.grpc.MicrogramProfoBuf.PostId request,
        io.grpc.stub.StreamObserver<microgram.impl.proxy.grpc.MicrogramProfoBuf.gPost> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetPostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createPost(microgram.impl.proxy.grpc.MicrogramProfoBuf.PostData request,
        io.grpc.stub.StreamObserver<microgram.impl.proxy.grpc.MicrogramProfoBuf.PostId> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreatePostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void like(microgram.impl.proxy.grpc.MicrogramProfoBuf.LikeRequest request,
        io.grpc.stub.StreamObserver<microgram.impl.proxy.grpc.MicrogramProfoBuf.BoolResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLikeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void isLiked(microgram.impl.proxy.grpc.MicrogramProfoBuf.PostIdUserId request,
        io.grpc.stub.StreamObserver<microgram.impl.proxy.grpc.MicrogramProfoBuf.BoolResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIsLikedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserPosts(microgram.impl.proxy.grpc.MicrogramProfoBuf.UserId request,
        io.grpc.stub.StreamObserver<microgram.impl.proxy.grpc.MicrogramProfoBuf.PostId> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetUserPostsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getFeedPosts(microgram.impl.proxy.grpc.MicrogramProfoBuf.UserId request,
        io.grpc.stub.StreamObserver<microgram.impl.proxy.grpc.MicrogramProfoBuf.PostId> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetFeedPostsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MicrogramBlockingStub extends io.grpc.stub.AbstractStub<MicrogramBlockingStub> {
    private MicrogramBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MicrogramBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MicrogramBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MicrogramBlockingStub(channel, callOptions);
    }

    /**
     */
    public microgram.impl.proxy.grpc.MicrogramProfoBuf.gProfile getProfile(microgram.impl.proxy.grpc.MicrogramProfoBuf.ProfileRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetProfileMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<microgram.impl.proxy.grpc.MicrogramProfoBuf.gProfile> searchProfiles(
        microgram.impl.proxy.grpc.MicrogramProfoBuf.ProfileQuery request) {
      return blockingServerStreamingCall(
          getChannel(), getSearchProfilesMethod(), getCallOptions(), request);
    }

    /**
     */
    public microgram.impl.proxy.grpc.MicrogramProfoBuf.BoolResult follow(microgram.impl.proxy.grpc.MicrogramProfoBuf.FollowRequest request) {
      return blockingUnaryCall(
          getChannel(), getFollowMethod(), getCallOptions(), request);
    }

    /**
     */
    public microgram.impl.proxy.grpc.MicrogramProfoBuf.BoolResult isFollowing(microgram.impl.proxy.grpc.MicrogramProfoBuf.UserPair request) {
      return blockingUnaryCall(
          getChannel(), getIsFollowingMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<microgram.impl.proxy.grpc.MicrogramProfoBuf.gPost> getPost(
        microgram.impl.proxy.grpc.MicrogramProfoBuf.PostId request) {
      return blockingServerStreamingCall(
          getChannel(), getGetPostMethod(), getCallOptions(), request);
    }

    /**
     */
    public microgram.impl.proxy.grpc.MicrogramProfoBuf.PostId createPost(microgram.impl.proxy.grpc.MicrogramProfoBuf.PostData request) {
      return blockingUnaryCall(
          getChannel(), getCreatePostMethod(), getCallOptions(), request);
    }

    /**
     */
    public microgram.impl.proxy.grpc.MicrogramProfoBuf.BoolResult like(microgram.impl.proxy.grpc.MicrogramProfoBuf.LikeRequest request) {
      return blockingUnaryCall(
          getChannel(), getLikeMethod(), getCallOptions(), request);
    }

    /**
     */
    public microgram.impl.proxy.grpc.MicrogramProfoBuf.BoolResult isLiked(microgram.impl.proxy.grpc.MicrogramProfoBuf.PostIdUserId request) {
      return blockingUnaryCall(
          getChannel(), getIsLikedMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<microgram.impl.proxy.grpc.MicrogramProfoBuf.PostId> getUserPosts(
        microgram.impl.proxy.grpc.MicrogramProfoBuf.UserId request) {
      return blockingServerStreamingCall(
          getChannel(), getGetUserPostsMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<microgram.impl.proxy.grpc.MicrogramProfoBuf.PostId> getFeedPosts(
        microgram.impl.proxy.grpc.MicrogramProfoBuf.UserId request) {
      return blockingServerStreamingCall(
          getChannel(), getGetFeedPostsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MicrogramFutureStub extends io.grpc.stub.AbstractStub<MicrogramFutureStub> {
    private MicrogramFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MicrogramFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MicrogramFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MicrogramFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<microgram.impl.proxy.grpc.MicrogramProfoBuf.gProfile> getProfile(
        microgram.impl.proxy.grpc.MicrogramProfoBuf.ProfileRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProfileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<microgram.impl.proxy.grpc.MicrogramProfoBuf.BoolResult> follow(
        microgram.impl.proxy.grpc.MicrogramProfoBuf.FollowRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFollowMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<microgram.impl.proxy.grpc.MicrogramProfoBuf.BoolResult> isFollowing(
        microgram.impl.proxy.grpc.MicrogramProfoBuf.UserPair request) {
      return futureUnaryCall(
          getChannel().newCall(getIsFollowingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<microgram.impl.proxy.grpc.MicrogramProfoBuf.PostId> createPost(
        microgram.impl.proxy.grpc.MicrogramProfoBuf.PostData request) {
      return futureUnaryCall(
          getChannel().newCall(getCreatePostMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<microgram.impl.proxy.grpc.MicrogramProfoBuf.BoolResult> like(
        microgram.impl.proxy.grpc.MicrogramProfoBuf.LikeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLikeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<microgram.impl.proxy.grpc.MicrogramProfoBuf.BoolResult> isLiked(
        microgram.impl.proxy.grpc.MicrogramProfoBuf.PostIdUserId request) {
      return futureUnaryCall(
          getChannel().newCall(getIsLikedMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PROFILE = 0;
  private static final int METHODID_SEARCH_PROFILES = 1;
  private static final int METHODID_FOLLOW = 2;
  private static final int METHODID_IS_FOLLOWING = 3;
  private static final int METHODID_GET_POST = 4;
  private static final int METHODID_CREATE_POST = 5;
  private static final int METHODID_LIKE = 6;
  private static final int METHODID_IS_LIKED = 7;
  private static final int METHODID_GET_USER_POSTS = 8;
  private static final int METHODID_GET_FEED_POSTS = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MicrogramImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MicrogramImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PROFILE:
          serviceImpl.getProfile((microgram.impl.proxy.grpc.MicrogramProfoBuf.ProfileRequest) request,
              (io.grpc.stub.StreamObserver<microgram.impl.proxy.grpc.MicrogramProfoBuf.gProfile>) responseObserver);
          break;
        case METHODID_SEARCH_PROFILES:
          serviceImpl.searchProfiles((microgram.impl.proxy.grpc.MicrogramProfoBuf.ProfileQuery) request,
              (io.grpc.stub.StreamObserver<microgram.impl.proxy.grpc.MicrogramProfoBuf.gProfile>) responseObserver);
          break;
        case METHODID_FOLLOW:
          serviceImpl.follow((microgram.impl.proxy.grpc.MicrogramProfoBuf.FollowRequest) request,
              (io.grpc.stub.StreamObserver<microgram.impl.proxy.grpc.MicrogramProfoBuf.BoolResult>) responseObserver);
          break;
        case METHODID_IS_FOLLOWING:
          serviceImpl.isFollowing((microgram.impl.proxy.grpc.MicrogramProfoBuf.UserPair) request,
              (io.grpc.stub.StreamObserver<microgram.impl.proxy.grpc.MicrogramProfoBuf.BoolResult>) responseObserver);
          break;
        case METHODID_GET_POST:
          serviceImpl.getPost((microgram.impl.proxy.grpc.MicrogramProfoBuf.PostId) request,
              (io.grpc.stub.StreamObserver<microgram.impl.proxy.grpc.MicrogramProfoBuf.gPost>) responseObserver);
          break;
        case METHODID_CREATE_POST:
          serviceImpl.createPost((microgram.impl.proxy.grpc.MicrogramProfoBuf.PostData) request,
              (io.grpc.stub.StreamObserver<microgram.impl.proxy.grpc.MicrogramProfoBuf.PostId>) responseObserver);
          break;
        case METHODID_LIKE:
          serviceImpl.like((microgram.impl.proxy.grpc.MicrogramProfoBuf.LikeRequest) request,
              (io.grpc.stub.StreamObserver<microgram.impl.proxy.grpc.MicrogramProfoBuf.BoolResult>) responseObserver);
          break;
        case METHODID_IS_LIKED:
          serviceImpl.isLiked((microgram.impl.proxy.grpc.MicrogramProfoBuf.PostIdUserId) request,
              (io.grpc.stub.StreamObserver<microgram.impl.proxy.grpc.MicrogramProfoBuf.BoolResult>) responseObserver);
          break;
        case METHODID_GET_USER_POSTS:
          serviceImpl.getUserPosts((microgram.impl.proxy.grpc.MicrogramProfoBuf.UserId) request,
              (io.grpc.stub.StreamObserver<microgram.impl.proxy.grpc.MicrogramProfoBuf.PostId>) responseObserver);
          break;
        case METHODID_GET_FEED_POSTS:
          serviceImpl.getFeedPosts((microgram.impl.proxy.grpc.MicrogramProfoBuf.UserId) request,
              (io.grpc.stub.StreamObserver<microgram.impl.proxy.grpc.MicrogramProfoBuf.PostId>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MicrogramBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MicrogramBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return microgram.impl.proxy.grpc.MicrogramProfoBuf.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Microgram");
    }
  }

  private static final class MicrogramFileDescriptorSupplier
      extends MicrogramBaseDescriptorSupplier {
    MicrogramFileDescriptorSupplier() {}
  }

  private static final class MicrogramMethodDescriptorSupplier
      extends MicrogramBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MicrogramMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MicrogramGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MicrogramFileDescriptorSupplier())
              .addMethod(getGetProfileMethod())
              .addMethod(getSearchProfilesMethod())
              .addMethod(getFollowMethod())
              .addMethod(getIsFollowingMethod())
              .addMethod(getGetPostMethod())
              .addMethod(getCreatePostMethod())
              .addMethod(getLikeMethod())
              .addMethod(getIsLikedMethod())
              .addMethod(getGetUserPostsMethod())
              .addMethod(getGetFeedPostsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
