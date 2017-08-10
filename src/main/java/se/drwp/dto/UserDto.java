package se.drwp.dto;

import se.drwp.quote.tss.Credentials;
import se.drwp.quote.tss.User;
import se.drwp.quote.tss.Token;

public interface UserDto {

	User createUser(User user) throws Exception;
	
	Token loginUser(Credentials credentials) throws Exception;
	
	User getUserByUsername(String username) throws Exception;
	
	User getUserByToken(String stringToken) throws Exception;
	
}
