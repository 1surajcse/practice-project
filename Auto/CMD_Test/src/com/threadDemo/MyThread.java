package com.threadDemo;

public class MyThread extends Thread {

	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("inside thread1 ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread myThread=new MyThread();
		myThread.start();
		
		//yield();
		for(int i=0;i<10;i++)
		{
			System.out.println("inside thread2");
		}
	}

}
