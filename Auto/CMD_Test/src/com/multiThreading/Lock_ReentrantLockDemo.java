package com.multiThreading;

import com.exceptionHandling.Parrent;

import java.io.IOException;
import java.sql.SQLDataException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*ReentrantLock: This is the most widely used implementation class of Lock interface. This class implements the Lock 
interface in similar way as synchronized keyword. Apart from Lock interface implementation, ReentrantLock contains 
some utility methods to get the thread holding the lock, threads waiting to acquire the lock etc.

*,  main difference between synchronized and ReentrantLock is ability to trying for lock interruptibly, and with timeout.

*Thread doesn�t need to block infinitely, which was the case with synchronized.
*
*
*
*) Another significant difference between ReentrantLock and synchronized keyword is fairness. 
*synchronized keyword doesn't support fairness. Any thread can acquire lock once released, 
*no preference can be specified, on the other hand you can make ReentrantLock fair by specifying 
*fairness property, while creating instance of ReentrantLock. 
*Fairness property provides lock to longest waiting thread, in case of contention.
*
*
*) Second difference between synchronized and Reentrant lock is tryLock() method. 
*ReentrantLock provides convenient tryLock() method, which acquires lock only if its available or
* not held by any other thread. This reduce blocking of thread waiting for lock in Java application.


ability to interrupt Thread while waiting for Lock. In case of synchronized keyword, 
a thread can be blocked waiting for lock, for an indefinite period of time and there was no way to control that. 
ReentrantLock provides a method called lockInterruptibly(), which can be used to interrupt thread when it is waiting for lock.
 Similarly tryLock() with timeout can be used to timeout if lock is not available in certain time period.



*/
public class Lock_ReentrantLockDemo implements Runnable {
	
	private Parrent p;
	private Lock lock;
	public Lock_ReentrantLockDemo(Parrent p){
		this.p=p ;
		this.lock = new ReentrantLock();
	}
	
	public static void main(String[] args) throws SQLDataException {
		
		Parrent p1=new Parrent();
		Parrent p2=new Parrent();
		Lock_ReentrantLockDemo demo=new Lock_ReentrantLockDemo(p1);
		Lock_ReentrantLockDemo demo1=new Lock_ReentrantLockDemo(p2);
		Thread thread=new Thread(demo);
		Thread thread1=new Thread(demo1);
		thread.start();
		thread1.start();

	}

	@Override
	public void run() {
		
		try {
			if(lock.tryLock(10, TimeUnit.SECONDS)){
				try {
					p.m1();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			lock.unlock();
		}
	}

}
