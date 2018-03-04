package mx.com.akkihazlo.user.admin.dto;

public class User {
	
	private Integer userId;
	private String email;
	private String userName;
	private String password;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [userId=").append(userId).append(", email=").append(email).append(", userName=")
				.append(userName).append(", password=").append(password).append("]");
		return builder.toString();
	}
	
	
	
	

}
