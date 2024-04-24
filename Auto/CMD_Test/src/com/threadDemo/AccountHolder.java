package com.threadDemo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AccountHolder implements Runnable{

	private String holderName;
	private BankAccount bankAccount;
	private int transactionAmount;
	private Lock lock;

	public AccountHolder(String holderName, BankAccount bankAccount,int transactionAmount ) {
		super();
		this.holderName = holderName;
		this.bankAccount = bankAccount;
		this.transactionAmount=transactionAmount;
		lock=new ReentrantLock();
	}

	@Override
	public void run() {
		try{
			//bankAccount.deposit(transactionAmount);
			bankAccount.withdraw(transactionAmount);
			System.out.println(Thread.currentThread()+"Has successfully withDraw the amount with holderName::"+holderName);
			
			System.out.println("Availabe Balance:"+bankAccount.getBalance());
			Thread.sleep(100);
		}
		catch(InterruptedException e){
			System.out.println();

		}
	}
}
