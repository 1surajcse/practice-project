package com.threadDemo;

import java.util.concurrent.BlockingQueue;

public class ProducerClass implements Runnable {
	BlockingQueue<Integer> blockingQueue;
	public ProducerClass(BlockingQueue<Integer>blockingQueue){
		this.blockingQueue=blockingQueue;
	}

	@Override
	public void run() {
		try {
			blockingQueue.put(1);
			Thread.sleep(500);
			blockingQueue.put(2);
			Thread.sleep(500);
			blockingQueue.put(3);
			System.out.println(Thread.currentThread());
		} catch (Exception e) {
			
		}
		
	}

}
