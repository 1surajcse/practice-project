package com.multiThreading;

public class ProgramToPrintPrimeNonPrime {

	public static void main(String[] args) throws InterruptedException {

		Thread t=new Thread(new Prime());
		Thread t1=new Thread(new NonPrime());
		t.start();
		t1.start();
		
		t.join(1000);
		
	}

	static class Prime implements Runnable	{

		@Override
		public void run() {
			for(int i=1;i<=10;i++)
			{
				if(i==2||i==3||i==5||i==7){

					System.out.println("PrimeNo::"+i);
				}
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}
	}

	static class NonPrime implements Runnable{

		@Override
		public void run() {
			for(int i=1;i<=10;i++)
			{
				if(i==4||i==6||i==8||i==9||i==10){

					System.out.println("Non PrimeNo::"+i);
				}
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}


			}
		}


	
	}}
