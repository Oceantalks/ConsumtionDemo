package se.drwp.URLProperties;

public class URLProperties {
	
	private static final String URL_ADD_USER = "http://localhost:8080/addUser";
			
	private static final String URL_AUTHENTICATION = "http://localhost:8080/authentication";

	private static final String BASIC_URL_GET_USER = "http://localhost:8080/user";
	
	
	public static String buildGetLogForId(String url, Long id) {
		return url + "/userLog/" + id;
	}
	
	public static String buildGetUserByUsername(String url,String name) {
		return url + "/" + name;
	}
	
	public static String buildGetUserByToken(String url, String stringToken) {
		return url + "/" + stringToken;
	}

	public static String getBasicUrlGetUser() {
		return BASIC_URL_GET_USER;
	}

	public static String getUrlAddUser() {
		return URL_ADD_USER;
	}

	public static String getUrlAuthentication() {
		return URL_AUTHENTICATION;
	}
	

}
