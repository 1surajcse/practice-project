package com.multiThreading.blockingQueue;

import java.util.concurrent.BlockingQueue;

/*The consuming thread keeps taking objects out of the blocking queue, and processes them. If the 
consuming thread tries to take an object out of an empty 
queue, the consuming thread is blocked until a producing thread puts an object into the queue.

*
*
*
*
*put(E e): This method is used to insert elements to the queue. If the queue is full, it waits for the space to be available.
E take(): This method retrieves and remove the element from the head of the queue. If queue is empty 
it waits for the element to be available.
*/
public class ConsumerClass implements Runnable{
	BlockingQueue blockinQ=null;
	
	public ConsumerClass(BlockingQueue blockingQueue) {
		// TODO Auto-generated constructor stub
		blockinQ=blockingQueue;
	}

	@Override
	public void run() {try {
	System.out.println(blockinQ.take());

	System.out.println(blockinQ.take());
	
	System.out.println(blockinQ.take());
	
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		// TODO Auto-generated method stub
		
	}

}
