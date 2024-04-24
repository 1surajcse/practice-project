package com.threadDemo;

public class DriverTest {

	public static void main(String[] args) throws InterruptedException {

		BankAccount bankAccount=new BankAccount(6000);
		AccountHolder accountHolder1=new AccountHolder("Reema", bankAccount, 400);
		AccountHolder accountHolder2=new AccountHolder("Seema", bankAccount, 500);
		
		AccountHolder accountHolder3=new AccountHolder("Raman", bankAccount, 4000);
		AccountHolder accountHolder4=new AccountHolder("Shyam", bankAccount, 5000);
		Thread t1=new Thread(accountHolder1);
		Thread t2=new Thread(accountHolder2);
		
		
		Thread t3=new Thread(accountHolder3);

	
		Thread t4=new Thread(accountHolder4);
		t1.start();
		t2.start();

		t3.start();
		t4.start();
		t4.join();
		
		

		
		


	}

}
