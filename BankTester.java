package bank;

import java.util.Scanner;

public class BankTester {

	public static void main(String[] args) {
		
		Bank bank = new Bank(); 
		Scanner a = new Scanner(System.in);
		
		// TODO Auto-generated method stub
System.out.println("Welcome To Bank"); 
System.out.println("Options:"
		+ "\n 1) Login"
		+ "\n 2) Save and Quit");

 if(a.hasNext()){
	 if(a.nextInt() == 1){
		 System.out.println("Choice: 1");
		 System.out.println("Enter in the Bank Account Number:"); 
		 bank.Login(a.nextInt());
	 }
	 else if(a.nextInt() == 2){
		 System.out.println("Bank Database after the transaction");
		 
		 System.exit(0); 
	 }
 }

	}

}
