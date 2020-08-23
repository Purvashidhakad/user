package bank.UserMS.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userlogs")
public class UserAuthenticateEntity {
	@Column(name = "CUSTOMER_ID", nullable = false)
	private Integer customerId;
	@Column(name = "EMAIL", nullable = false)
	private String email;
	@Column(name = "LOGGED_DATE", nullable = false)
	private Timestamp loggedDate;
	@Column(name = "LOGGED_DATE_ACCOUNT", nullable = false)
	@Id
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
}
