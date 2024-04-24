package com.multiThreading;

public class CreatingThreadByExtendingThreadClass extends Thread {

	public void run(){
		try{
			System.out.println("Thread "+Thread.currentThread().getId()+" isrunning");
		}
		catch (Exception e) {

		}
	}
	public static void main(String[] args) {
		int n=8;
		for(int i=0;i<n;i++)
		{
			CreatingThreadByExtendingThreadClass object=new CreatingThreadByExtendingThreadClass();

			object.start();

		}}

}
