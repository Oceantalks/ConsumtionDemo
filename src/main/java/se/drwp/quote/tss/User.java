package se.drwp.quote.tss;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
	
	private Long id;
	private String phoneNumber;
	private String userName;
	private String firstName;
	private String lastName;
	
	private String password;
	private String salt;
	private String stringToken;
	private String expirationTimeStamp;
	
	
	
	public User() {		
	}
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getStringToken() {
		return stringToken;
	}

	public void setStringToken(String stringToken) {
		this.stringToken = stringToken;
	}

	public String getExpirationTimeStamp() {
		return expirationTimeStamp;
	}

	public void setExpirationTimeStamp(String expirationTimeStamp) {
		this.expirationTimeStamp = expirationTimeStamp;
	}



	@Override
	public String toString() {
		return "User [id=" + id + ", phoneNumber=" + phoneNumber + ", userName=" + userName + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", password=" + password + ", salt=" + salt + ", stringToken="
				+ stringToken + ", expirationTimeStamp=" + expirationTimeStamp + "]";
	}

	
	
	

}
