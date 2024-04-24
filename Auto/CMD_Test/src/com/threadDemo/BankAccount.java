package com.threadDemo;

public class BankAccount {
	
	private int balance;
	private int amount;
	
	public BankAccount(int balance){
		this.balance=balance;
	
		
	}
	
	public synchronized void withdraw(int amount ){
		if(balance>=amount){
		balance=balance-amount;
		System.out.println(amount+"Money with drawn Successfully.Avail Bal::"+balance);
		}
		System.out.println("Insuffcient Balance::"+balance);
	}
	public synchronized void  deposit(int amount ){
		balance=balance+amount;
		System.out.println(amount+"credited successfully");
		System.out.println("Available Amount::"+balance);
	}

	public  synchronized int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}
