package com.multiThreading;

import java.util.LinkedList;

public class ProducerConsumerProblem {



	public static void main(String[] args) throws InterruptedException {
		//object of the class both have producer and consumer
		final  PC pc=new PC();


		Thread t1=new Thread(new Runnable(){

			@Override
			public void run() {

				try{
					pc.produce();
				}
				catch (InterruptedException e) {

				}
			}

		});
		
		Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try{
					pc.consume();
				}
				catch (InterruptedException e) {
					
				}
			}
			
		});
		//start the both the thread
		t1.start();
		t2.start();
		//t1 finishes before t2
		t1.join();
		t2.join();

	}

	public static class PC{

		int capacity=2;
		//create a list shared by consumer and producer both
		LinkedList<Integer> l=new LinkedList<>();

		public void produce()throws InterruptedException{
			int value = 0;
			while(true){
				synchronized(this){
					while(capacity==l.size())
						wait();

					System.out.println("Producer produced-"
							+ value);


					l.add(value++);
					notify();//Notify to consumer thread that now it can start consuming it.

					Thread.sleep(1000);
				}

			}
		}

		public void consume() throws InterruptedException{

			while (true){
				synchronized(this)
				{
					//consumer thread wait
					while(l.size()!=0)
						wait();
					int val=l.removeFirst();//retrive first job

					System.out.println("consumer consumed::"+val);

					notify();
					Thread.sleep(1000);

				}
			}

		}
	}

}
