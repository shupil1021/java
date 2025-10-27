package cote.exam1020;

public class BankAccount {
	private static int count = 0;
	private String name;
	private String accountNumber;
	private int balance;
	
	public BankAccount(String name, String accountNumber) {
		this(name, accountNumber, 0);
	}
	public BankAccount(String name, String accountNumber, int balance) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
		count++;
	}
	
	public int withdrawal(int amount) {
		if(amount > balance) {
			amount = balance;
			balance = 0;
			return amount;
		}else {
			balance -= amount;
			return amount;
		}
	}
	
	public int getCount() {
		return count;
	}
	
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
}
