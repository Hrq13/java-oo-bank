package entities;

import java.util.Random;

public class BankAccount {
	
	Random rand = new Random();
	private int accountID = rand.nextInt(99999);
	private String accountName;
	private Double accountBalance;
	
	public BankAccount(String accountName, Double accountBalance) {
		this.accountName = accountName;
		this.accountBalance = accountBalance;
	}
	
	public String getAccountInfo() {
		return "         -- Account Info --"
			 + "\nAccount ID: " + accountID
			 + "\nName: " + accountName
			 + "\nBalance: " + accountBalance;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public Double getAccountBalance() {
		return accountBalance;
	}

	public void deposit(Double value) {
		this.accountBalance += value;
	}
	
	public void withdraw(Double value) {
		if (value + 5 <= accountBalance) {
			this.accountBalance -= value + 5;
		} else {
			System.out.println("\n\n[ERROR] Sorry, you can't withdraw more than your current balance.");
		}
	}
	
	
	
}
