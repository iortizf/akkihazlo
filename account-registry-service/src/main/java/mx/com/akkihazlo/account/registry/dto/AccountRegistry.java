package mx.com.akkihazlo.account.registry.dto;

import java.util.List;

public class AccountRegistry {
	
	private String email;
	private String password;
	private List<Phone> phones;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Phone> getPhones() {
		return phones;
	}
	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AccountRegistry [email=").append(email).append(", password=").append(password)
				.append(", phones=").append(phones).append("]");
		return builder.toString();
	}	
	

}
