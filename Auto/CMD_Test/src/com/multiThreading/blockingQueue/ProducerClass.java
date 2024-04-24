package com.multiThreading.blockingQueue;

import java.util.concurrent.BlockingQueue;

/***
 * The producing thread keeps producing the new object and adding the element in the queue until its full.If its full then the 
 * producing thread will be block until the consumer thread will not consume all the element from the queue
 * @author stiwari
 * 
 * java provides several BlockingQueue implementations such as ArrayBlockingQueue,
 *  LinkedBlockingQueue, PriorityBlockingQueue, SynchronousQueue etc.
 *
 */
public class ProducerClass implements Runnable{
	protected  BlockingQueue queue=null;
	 public ProducerClass(BlockingQueue queue) {
	        this.queue = queue;
	    }
	@Override
	public void run() {
		try{
		queue.put(1);
		Thread.sleep(1000);
		queue.put(2);
		Thread.sleep(1000);
		queue.put(3);
		
		}
		catch (InterruptedException e) {
			// TODO: handle exception
		}
		
		
	}

}
