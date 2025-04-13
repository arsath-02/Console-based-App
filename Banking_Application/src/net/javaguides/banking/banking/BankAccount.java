package net.javaguides.banking.banking;
//import org.mindrot.jbcrypt.BCrypt;
import java.security.*;
import java.util.*;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private String passwordHash;

    public BankAccount(String accountNumber, String accountHolder, String password) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.passwordHash = hashPassword(password);
        this.balance = 0.0;
    }

    // Hash Password
    private String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256"); 
            byte[] hashedBytes = md.digest(password.getBytes()); 

           
            StringBuilder sb = new StringBuilder();
            for (byte b : hashedBytes) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString(); 
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error hashing password", e);
        }
    }
   
 // Verify password 
    public boolean verifyPassword(String inputPassword) {
        String hashedInput = hashPassword(inputPassword);
        return hashedInput.equals(this.passwordHash);
    }


    // Deposit Amount
    public void deposit(double amount, String inputPassword) {
        if (verifyPassword(inputPassword)) {
            if (amount > 0) {
                balance += amount;
                System.out.println("✅ Amount deposited successfully. Current Balance: " + balance+" For the Account Holder :"+ accountHolder);
            } else {
                System.out.println("❌ Invalid amount! Please enter a positive number.");
            }
        } else {
            System.out.println("❌ Incorrect password! Deposit failed.");
        }
    }

    // Withdraw Amount
    public void withdraw(double amount, String inputPassword) {
        if (verifyPassword(inputPassword)) {
            if (amount <= 0) {
                System.out.println("❌ Invalid amount! Please enter a positive number.");
            } else if (amount > balance) {
                System.out.println("❌ Insufficient balance! Transaction failed.");
            } else {
                balance -= amount;
                System.out.println("✅ Amount withdrawn successfully. Remaining Balance: " + balance+" For the Account Holder :"+ accountHolder);
            }
        } else {
            System.out.println("❌ Incorrect password! Withdrawal failed.");
        }
    }

    // Transfer Money
    public void transfer(BankAccount otherAccount, double amount, String inputPassword) {
        if (verifyPassword(inputPassword)) {
            if (amount > 0 && amount <= balance) {
                this.withdraw(amount, inputPassword);
                otherAccount.balance += amount;
                System.out.println("✅ Amount transferred successfully! New Balance: " + this.balance);
            } else {
                System.out.println("❌ Insufficient balance or invalid amount! Transfer failed.");
            }
        } else {
            System.out.println("❌ Incorrect password! Transfer failed.");
        }
    }

    // Display Account Details
    public void displayAccountDetails() {
        System.out.println("📄 Account Number: " + accountNumber + ", Account Holder: " + accountHolder + ", Balance: " + balance);
    }

    // Getters and Setters
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getAccountHolder() {
        return accountHolder;
    }
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    public double getBalance() {
        return balance;
    }
}
