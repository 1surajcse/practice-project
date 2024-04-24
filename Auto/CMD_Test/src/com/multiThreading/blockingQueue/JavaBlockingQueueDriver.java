package com.multiThreading.blockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/***
 * Java blocking queue is an interface (java.util.concurrent).this queue is a thread safe to put and take the instance from
 * @author stiwari
 * 
 * Blocking queue has 4 methods for insert reomve and examine the element
 * 
	 	 
The 4 different sets of behaviour means this:

Throws Exception: 
If the attempted operation is not possible immediately, an exception is thrown.
Special Value: 
If the attempted operation is not possible immediately, a special value is returned (often true / false).
Blocks: 
If the attempted operation is not possible immedidately, the method call blocks until it is.
Times Out: 
If the attempted operation is not possible immedidately, the method call blocks until it is, but waits no longer than the given timeout. 
Returns a special value telling whether the operation succeeded or not (typically true / false).

Imp points::
blocking queue can not insert the null values if you try the insert the null it will throw null pointer exception
 *
 *
 *BlockingQueue Implementations
Since BlockingQueue is an interface, you need to use one of its implementations to use it. T
he java.util.concurrent package has the following implementations of the BlockingQueue interface (in Java 6):

ArrayBlockingQueue
DelayQueue
LinkedBlockingQueue
PriorityBlockingQueue
SynchronousQueue


 */
public class JavaBlockingQueueDriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
BlockingQueue blockingQueue=new ArrayBlockingQueue(1024);
System.out.println(blockingQueue);

ProducerClass producerClass=new ProducerClass(blockingQueue);
ConsumerClass consumerClass=new ConsumerClass(blockingQueue);
new Thread(producerClass).start();
new Thread(consumerClass).start();
Thread.sleep(4000);
	}

}
