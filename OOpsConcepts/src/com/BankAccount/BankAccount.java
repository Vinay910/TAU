package com.BankAccount;

public class BankAccount {
	
	private long accountNumber;
	private double balance;
	private String customerName;
	private String email;
	private long phoneNumber;
	

	public BankAccount()
	{
		this(11111,0,"John Doe","in@in.com",123445);
	}
	public BankAccount(long accountNumber, double balance, String customerName, String email, long phoneNumber) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void depositFunds(double funds)
	{
		this.balance=this.balance+funds;
		System.out.println("Updated balance is "+(this.balance));
	}
	
	public void withdrawFunds(double funds)
	{
		if(this.balance>=funds)
		{
			this.balance=this.balance-funds;
		System.out.println("Updated balance is "+(this.balance));
		}
		else
		{
			System.out.println("You dont have enough balance. Remaining Balance is "+this.balance);
		}
	}
}
