package se.drwp.quote.tss;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserLog {
	
	private Long userId;
	
	private String date;
	
	UserLog () {
	}
	
	public UserLog(Long id, String date) {
		this.userId = id;
		this.date = date;
	}
	
	public Long getUserId() {
		return userId;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}



	@Override
	public String toString() {
		return "UserLog [userId=" + userId + ", date=" + date + "]";
	}


}
