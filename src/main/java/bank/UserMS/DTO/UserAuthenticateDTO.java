package bank.UserMS.DTO;

import java.sql.Timestamp;

public class UserAuthenticateDTO {

	private Integer customerId;
	private String email;
	private Timestamp loggedDate;
    private String pkLoggedDate;
    
    
	public String getPkLoggedDate() {
		return pkLoggedDate;
	}
	public void setPkLoggedDate(String pkLoggedDate) {
		this.pkLoggedDate = pkLoggedDate;
	}

	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Timestamp getLoggedDate() {
		return loggedDate;
	}
	public void setLoggedDate(Timestamp loggedDate) {
		this.loggedDate = loggedDate;
	}
	@Override
	public String toString() {
		return "UserAuthenticateDTO [customerId=" + customerId + ", email=" + email + ", loggedDate=" + loggedDate
				+ ", pkLoggedDate=" + pkLoggedDate + "]";
	}
	
}
