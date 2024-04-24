package com.multiThreading;

public class UsingRunnableInterFace implements  Runnable{

	public static void main(String[] args) {
		for(int i=0;i<8;i++)
		{
	Thread thread=new Thread(new UsingRunnableInterFace());
	thread.start();
		}
	}

	@Override
	public void run() {
		try {
			System.out.println("thread "+Thread.currentThread().getId()+" is Runing");
		} catch (Exception e) {
			
		}
		
	}

}
