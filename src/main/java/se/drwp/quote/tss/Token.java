package se.drwp.quote.tss;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Token {

	private String accessToken;
	private String expirationTimeStamp;
	
	
	public Token() {
		
	}
	
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getExpirationTimeStamp() {
		return expirationTimeStamp;
	}
	public void setExpirationTimeStamp(String expirationTimeStamp) {
		this.expirationTimeStamp = expirationTimeStamp;
	}

	@Override
	public String toString() {
		return "Token [accessToken=" + accessToken + ", expirationTimeStamp=" + expirationTimeStamp + "]";
	}

	
	
}
