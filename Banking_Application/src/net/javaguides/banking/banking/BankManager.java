package net.javaguides.banking.banking;
//import BankAccount.java;
import java.util.*;
public class BankManager {
	List<BankAccount> accounts = new ArrayList<>();
	
	// new Bank Account
	public void createAccount(String accountNumber, String accountHolder,String inputpassword) {
		BankAccount newaccount = new BankAccount(accountNumber,accountHolder,inputpassword);
		accounts.add(newaccount);
		System.out.print("New Account has been Created for "+ accountHolder+" with Account Number has "+accountNumber);
	}
	
	//Find Account by Account Number
	
	private BankAccount findAccount(String accountNumber) {
		for(BankAccount account:accounts) {
			if(account.getAccountNumber().equals(accountNumber)) {
				return account;
			}
		}
		return null;
	}
	
	
	// Deposit money into other account 
	public void depsoitToAccount(String accountNumber,double amount ,String inputpassword) {
		BankAccount account = findAccount(accountNumber);
		if(account==null) {
			System.out.println("Account Not Found !!.");
		}
		else {
			account.deposit(amount,inputpassword);
		}
	}
	
	
	// WithDraw money from an Account
	public void withdrawFromAccount(String accountNumber,double amount ,String inputpassword) {
		BankAccount account = findAccount(accountNumber);
		if(account==null) {
			System.out.println("Account Not Found !!.");
		}
		else {
			account.withdraw(amount,inputpassword);
		}
	}
	
	//Transfer Amount Between Two Accounts 
	
	public void transferBetweenAccounts(String fromAccountNumber,String toAccountNumber,double amount,String inputpassword){
		BankAccount fromAccount = findAccount(fromAccountNumber);
		BankAccount toAccount = findAccount(toAccountNumber);
		if(fromAccount!=null && toAccount!=null) {
			fromAccount.transfer(toAccount, amount,inputpassword);
		}
		else {
			System.out.println("One or Both Accounts are Not Found");
		}
	}
	
	public void displayAllAccounts() {
		for(BankAccount account:accounts) {
			account.displayAccountDetails();
		}
	}
	
	
	
	
}
