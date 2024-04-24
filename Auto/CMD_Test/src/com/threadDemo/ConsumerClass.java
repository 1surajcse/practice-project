package com.threadDemo;

import java.util.concurrent.BlockingQueue;

public class ConsumerClass implements Runnable {
	BlockingQueue<Integer> blockingQueue;
	
	public ConsumerClass(BlockingQueue<Integer> blockingQueue){
		this.blockingQueue=blockingQueue;
	}

	@Override
	public void run() {
		try{
			System.out.println(blockingQueue.take());
			System.out.println(blockingQueue.take());
			System.out.println(blockingQueue.take());
			System.out.println(Thread.currentThread());
		}catch (Exception e) {
			
		}
		
	}

}
