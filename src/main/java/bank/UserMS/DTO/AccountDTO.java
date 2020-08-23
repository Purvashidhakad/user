package bank.UserMS.DTO;

public class AccountDTO {

	private Integer customerId;
	private String ifscCode;
	private String branch;
	private String branchAddress;
	SavingsDTO savings;
	CurrentDTO current;
	CreditDTO credit;
	LoandetailsDTO loan;
	
	public LoandetailsDTO getLoan() {
		return loan;
	}
	public void setLoan(LoandetailsDTO loan) {
		this.loan = loan;
	}
	public SavingsDTO getSavings() {
		return savings;
	}
	public void setSavings(SavingsDTO savings) {
		this.savings = savings;
	}
	public CurrentDTO getCurrent() {
		return current;
	}
	public void setCurrent(CurrentDTO current) {
		this.current = current;
	}
	public CreditDTO getCredit() {
		return credit;
	}
	public void setCredit(CreditDTO credit) {
		this.credit = credit;
	}
	
	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getBranchAddress() {
		return branchAddress;
	}
	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	
	public static AccountDTO valueOf(AccountDTO ae) {
	AccountDTO adto=new AccountDTO();
	if(ae.getSavings().getAccountType().equals("Savings")) {
		adto.setSavings(ae.getSavings());
	}
	if(ae.getCredit().getAccountType().equals("credit")) {
		adto.setCredit(ae.getCredit());
	}
	if(ae.getCurrent().getAccountType().equals("current")) {
		adto.setCurrent(ae.getCurrent());
	}
	adto.setLoan(ae.getLoan());
	adto.setBranch("EDGE VERVE BANK");
	adto.setBranchAddress("502 SANCHAR NAGAR");
	adto.setCustomerId(ae.getCustomerId());
	adto.setIfscCode("BKID0000");
	return adto;
	}
	@Override
	public String toString() {
		return "AccountDTO [customerId=" + customerId + ", ifscCode=" + ifscCode + ", branch=" + branch
				+ ", branchAddress=" + branchAddress + ", savings=" + savings + ", current=" + current + ", credit="
				+ credit + ", loan=" + loan + "]";
	}
	
	
	
}
