package bank.UserMS.DTO;



public class UserDTO {
	

		
		private Integer customerId;
		private String email;
		private String name;
		private String password;
		private Long phonenumber;
		private AccountDTO account;
		private String address;
		private String dob;
		private String dop;
		private Long aadharNo;
		
		
		public Long getAadharNo() {
			return aadharNo;
		}
		public void setAadharNo(Long aadharNo) {
			this.aadharNo = aadharNo;
		}

		public Integer getCustomerId() {
			return customerId;
		}
		public void setCustomerId(Integer customerId) {
			this.customerId = customerId;
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
		public AccountDTO getAccount() {
			return account;
		}
		public void setAccount(AccountDTO account) {
			this.account = account;
		}
		@Override
		public String toString() {
			return "UserDTO [customerId=" + customerId + ", email=" + email + ", name=" + name + ", password="
					+ password + ", phonenumber=" + phonenumber + ", account=" + account + ", address=" + address
					+ ", dob=" + dob + ", dop=" + dop + ", aadharNo=" + aadharNo + "]";
		}
		
		

		
		
		

	}
