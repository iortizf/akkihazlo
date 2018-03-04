package mx.com.akkihazlo.account.registry.dto;

public class Phone {
	
	private Integer phoneId;
	private String phoneNumber;
	private String phoneType;
	private String extension;
	public Integer getPhoneId() {
		return phoneId;
	}
	public void setPhoneId(Integer phoneId) {
		this.phoneId = phoneId;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPhoneType() {
		return phoneType;
	}
	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Phone [phoneId=").append(phoneId).append(", phoneNumber=").append(phoneNumber)
				.append(", phoneType=").append(phoneType).append(", extension=").append(extension).append("]");
		return builder.toString();
	}	

}
