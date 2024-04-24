package com.threadDemo;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueDemo {

	public static void main(String[] args) throws InterruptedException {
		final BlockingQueue<Integer> blockingQueue=new ArrayBlockingQueue<>(1024);

		ProducerClass producerClass=new ProducerClass(blockingQueue);
		Thread t1=new Thread(producerClass);
		ConsumerClass consumerClass=new ConsumerClass(blockingQueue);
		Thread t2=new Thread(consumerClass);


		t1.start();
		t2.start();
		Thread.sleep(1000);

	}

}
