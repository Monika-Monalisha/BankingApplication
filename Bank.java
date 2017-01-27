package bank;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
	BankAccount bankAccount; 
	
	 Scanner a = new Scanner(System.in); 

	
   private ArrayList<BankAccount> bankAccounts; 
   private String bankDetails;
   
   
   public Bank(){
		readFromDB();
	}
   public void Login(int accountNumber){
	   
	  if( bankAccounts.contains(accountNumber)){
		 System.out.println("Enter in Pin:"); 
		
		 if(bankAccount.verifyPIN(a.nextInt())){
			 if(bankAccount.hasACheckingAccount()){
				 
			 provideMenu(); 
		
		
			 
		 }
	   }
	   
	  }  
	   
   }
   
   private void provideMenu(){
	   
	   System.out.println("Hello "+bankAccount.getAccountHolderName()+", which account would you like to access:"
		 		+ "\n 1)Checkings"
		 		+ "\n 2)Savings"
		 		+ "\n Choice:");
		 
	   
   }
   
   private void deposit(){
	   
   }
   
   public void readFromDB(){
	   
   }
   
   
   
   public void writeToDB(){
	   
	   
	   
   }
   
   
   
   
   
   
   
public ArrayList<BankAccount> getBankAccounts() {
	return bankAccounts;
}
public void setBankAccounts(ArrayList<BankAccount> bankAccounts) {
	this.bankAccounts = bankAccounts;
}
public String getBankDetails() {
	return bankDetails;
}
public void setBankDetails(String bankDetails) {
	this.bankDetails = bankDetails;
} 
  
	
	
}
