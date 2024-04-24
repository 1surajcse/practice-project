package com.threadDemo;

import java.util.ArrayList;
import java.util.LinkedList;

public class ProducerConsumerProblem {


	public static void main(String[] args) throws InterruptedException {
		
		final PC pc=new PC();
		
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					pc.producerMethod();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					pc.consumerMethod();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});


	t1.start();
	t2.start();
	t1.join();
	t2.join();
	}

	public static class PC{

		int capcity=2;
		LinkedList<Integer>queue=new LinkedList<Integer>();
	

		public void producerMethod() throws InterruptedException{
			int value=0;
			while(true){
				synchronized (this) {
					while(capcity==queue.size())
						wait();
					System.out.println("Producer Produces::"+value);
					queue.add(value++);
					notify();
					Thread.sleep(1000);
				}
			}
		}

		public void consumerMethod() throws InterruptedException{
			while(true){

				synchronized (this) {

					while(queue.size()!=0)
						wait();
					int val=queue.removeFirst();
					System.out.println("consumes::"+val);

					notify();
					Thread.sleep(1000);

				}

			}

		}}
}
