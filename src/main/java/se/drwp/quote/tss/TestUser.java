package se.drwp.quote.tss;
public class TestUser {
	
	public static User createTestUser() {
		User user = new User();
		
		user.setUserName("hidfyRolig");
		user.setPassword("password");
		user.setFirstName("adonai");
		user.setLastName("tesfay");
		user.setPhoneNumber("0707673433");
		
		return user;
	}

}
