package bank;

public class BankAccount {

	//variables for individual bank account
	private int AccountNumber; 
	private int PINNumber; 
	private double savingsBalance;
	private double checkingsBalance; 
	private String accountHolderName; 
	private Boolean hasCheckingAccount;
	
	public Boolean hasACheckingAccount(){
		return hasCheckingAccount; 
	}
	
	public Boolean verifyPIN(int pinNumber){
		
		return pinNumber == PINNumber; 
		
	}
	
	public int getAccountNumber() {
		return AccountNumber;
	}
	public int getPINNumber() {
		return PINNumber;
	}
	public double getSavingsBalance() {
		return savingsBalance;
	}
	public double getCheckingsBalance() {
		//variable returns true for checking account 
		if (hasACheckingAccount()){
		return checkingsBalance;
		}
		else{
			throw new UnsupportedOperationException(); 
		}
		
	}
	
	public String getAccountHolderName() {
		return accountHolderName;
	}
	
	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}
	public void setPINNumber(int pINNumber) {
		PINNumber = pINNumber;
	}
	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	
	public void setCheckingsBalance(double checkingsBalance) {
		if (hasACheckingAccount()){
		this.checkingsBalance = checkingsBalance;
		}
		else{
			throw new UnsupportedOperationException(); 
		}
	}
	
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	
	public void printAccountDetails(){
		
		System.out.println(AccountNumber+","+PINNumber+","+savingsBalance+","+checkingsBalance+","+accountHolderName); 
		
	}
	
}
