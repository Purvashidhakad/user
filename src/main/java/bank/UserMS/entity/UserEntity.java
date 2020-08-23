package bank.UserMS.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="login")
public class UserEntity {
	
	@Column(name = "PHONE_NUMBER" , nullable = false)
	@Id
	private Long phonenumber;
	@Column(name = "EMAIL" , nullable = false)
	private String email;
	@Column(name = "NAME" , nullable = false)
	private String name;
	@Column(name = "PASSWORD" , nullable = false)
	private String password;
	@Column(name = "ADDRESS" , nullable = false)
	private String address;
	@Column(name = "DOB" , nullable = false)
	private String dob;
	@Column(name = "DATE_OF_OPENING" , nullable = false)
	private String dop;
	@Column(name = "AADHAR_NO" , nullable = false)
	private Long aadharNo;
	@OneToOne
	@JoinColumn(name="CUSTOMER_ID")
	private AccountEntity accountEntity;
	
	
	public Long getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(Long aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getDop() {
		return dop;
	}
	public void setDop(String dop) {
		this.dop = dop;
	}
	

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(Long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public AccountEntity getAccount() {
		return accountEntity;
	}
	public void setAccount(AccountEntity accountEntity) {
		this.accountEntity = accountEntity;
	}
	
	
}
	
				
			