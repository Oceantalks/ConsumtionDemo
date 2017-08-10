package se.drwp.service;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import se.drwp.URLProperties.URLProperties;
import se.drwp.dto.UserDto;
import se.drwp.quote.tss.Credentials;
import se.drwp.quote.tss.Token;
import se.drwp.quote.tss.User;

@Service
public class UserService implements UserDto {
	private static final String TAG = "UserService.class";
	
	private final RestTemplate restTemplate;
	
	public UserService(RestTemplateBuilder restTemplateBuilder) {
		this.restTemplate = restTemplateBuilder.build();
	}
	
	@Override
	public User createUser(User user) throws Exception {
		System.out.println(TAG + ": Creating user STARTS");
			
		User newUser = this.restTemplate.postForObject(URLProperties.getUrlAddUser(), user, User.class);	
		
		System.out.println(TAG + ": Creating user DONE");
		System.out.println(newUser.toString());
		return newUser;
	}

	@Override
	public Token loginUser(Credentials credentials) throws Exception {
		System.out.println(TAG + ": Loging in user with username: " + credentials.getUserName() + " STARTS");
		
		Token token = this.restTemplate.postForObject(URLProperties.getUrlAuthentication(), credentials, Token.class);
		
		System.out.println(TAG + ": Loging in user DONE");
		System.out.println(token.toString());
		return token;
	}

	@Override
	public User getUserByUsername(String username) throws Exception {
		System.out.println(TAG + ": Fetching user by username STARTS");
		
		ResponseEntity<User> entity = this.restTemplate.getForEntity(URLProperties.buildGetUserByUsername(URLProperties.getBasicUrlGetUser(), username), User.class);
		
		User user = entity.getBody();
	
		System.out.println(TAG + ": Fetching user by username DONE");
		return user;
	}

	@Override
	public User getUserByToken(String stringToken) throws Exception {
		System.out.println(TAG + ": Fetching user by stringToken STARTS");
		
		ResponseEntity<User> entity = this.restTemplate.getForEntity(URLProperties.buildGetUserByToken(URLProperties.getBasicUrlGetUser(), stringToken), User.class);
		
		User user = entity.getBody();
	
		System.out.println(TAG + ": Fetching user by stringToken DONE");
		return user;
	}

}
