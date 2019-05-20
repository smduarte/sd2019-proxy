package microgram.impl.clt;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import discovery.Discovery;
import microgram.api.java.Media;
import microgram.api.java.Posts;
import microgram.api.java.Profiles;
import microgram.impl.clt.rest.RestMediaClient;
import microgram.impl.clt.rest.RestPostsClient;
import microgram.impl.clt.rest.RestProfilesClient;
import microgram.impl.clt.soap.SoapPostsClient;
import microgram.impl.clt.soap.SoapProfilesClient;

/**
 * A factory to create service clients based on the contents of the discovery
 * URI.
 */
public class Clients {
	private static final String POSTS_SERVICE = "Microgram-Posts";
	private static final String PROFILES_SERVICE = "Microgram-Profiles";
	private static final String MEDIA_SERVICE = "Microgram-MediaStorage";

	private static final CharSequence REST = "/rest/";

	static Map<String, Media> media = new HashMap<>();
	static Map<String, Posts> posts = new HashMap<>();
	static Map<String, Profiles> profiles = new HashMap<>();

	synchronized public static Media getMedia() {
		Optional<Media> res = media.values().stream().findAny();
		if (res.isPresent())
			return res.get();

		URI[] uris;
		while ((uris = Discovery.findUrisOf(MEDIA_SERVICE, 1)).length == 0)
			;

		return new RestMediaClient( uris[0]);
	}
	
	synchronized public static Profiles getProfiles() {

		Optional<Profiles> res = profiles.values().stream().findAny();
		if (res.isPresent())
			return res.get();

		URI[] uris;
		while ((uris = Discovery.findUrisOf(PROFILES_SERVICE, 1)).length == 0)
			;

		return getProfiles(uris[0].toString());
	}

	synchronized public static Posts getPosts() {
		Optional<Posts> res = posts.values().stream().findAny();
		if (res.isPresent())
			return res.get();

		URI[] uris;
		while ((uris = Discovery.findUrisOf(POSTS_SERVICE, 1)).length == 0)
			;

		return getPosts(uris[0].toString());
	}

	synchronized static Profiles getProfiles(String server) {
		Profiles res = profiles.get(server);
		if (res == null) {
			if (server.contains(REST))
				res = new RestProfilesClient(URI.create(server));
			else
				res = new SoapProfilesClient(URI.create(server));
			profiles.put(server, res);
		}
		return res;
	}

	synchronized static Posts getPosts(String server) {
		Posts res = posts.get(server);
		if (res == null) {
			if (server.contains(REST))
				res = new RestPostsClient(URI.create(server));
			else
				res = new SoapPostsClient(URI.create(server));

			posts.put(server, res);
		}
		return res;
	}
}
