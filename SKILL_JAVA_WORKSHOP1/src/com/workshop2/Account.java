package com.workshop2;

public class Account {
	String accountNo, name;
	double balance;
	public static double interest;
	public Account(String accountNo, String name, double balance) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}
	
	public String getAccountNo() {
		return accountNo;
	}
	
	public String getAccountName() {
		return name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double money) {
		balance+=money;
	}
	
	public void withdraw(double money) {
		balance-=money;
	}
	
	public void addInterest() {
		balance=balance+balance*interest;
	}
	
}
