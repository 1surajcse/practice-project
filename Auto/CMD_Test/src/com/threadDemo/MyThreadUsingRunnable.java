package com.threadDemo;

public class MyThreadUsingRunnable implements Runnable{

	public static void main(String[] args) {
		
MyThreadUsingRunnable myThreadUsingRunnable=new MyThreadUsingRunnable();

Thread thread=new Thread(myThreadUsingRunnable);
thread.start();
	}

	@Override
	public void run() {
		System.out.println("inside run");
		
	}

}
