package com.multiThreading;
//We can prevent the execution of a thread by using one of the following methods of Thread class.
//yield ,sleep,join
/***
 * 
 * @author stiwari
 * 
 * Yield: this method is give the priority based on the condition Means lets say there is thread t1 which takes  min to complete a task 
 * which is not particular imp
 * and a thread t2 is takes 5 sec to complete a task then 
 * 
 * def:yield() basically means that the thread is not doing anything particularly important and if any other 
 * threads or processes need to be run, they should run. Otherwise, the current thread will continue to run.
 * 
 * public static native void yield()
 * 
 * 
 * Sleep():
 * this method makes a thread to stop its execution for a limited amount of time
 * def:This method causes the currently executing thread to sleep for the specified number of milliseconds, 
 * subject to the precision and accuracy of system timers and schedulers.
 * 
 * sleep(): causes the thread to definitely stop executing for a given amount of time; 
 * if no other thread or process needs to be run, the CPU will be idle (and probably enter a power saving mode). 
 * 
 * //  sleep for the specified number of milliseconds
public static void sleep(long millis) throws InterruptedException

//sleep for the specified number of milliseconds plus nano seconds
public static void sleep(long millis, int nanos) 
                         throws InterruptedException

 *
 *Join ::-If join() is called on a Thread instance, the currently running thread will block until the Thread instance
 * has finished executing.
 */
public class MethodToPreventThreadExecution {

	public static void main(String[] args) throws InterruptedException {
		
		//Yield Method
		
		/*Mythread mythread=new Mythread();
		mythread.start();
		for(int i=0;i<5;i++){
			
		// Control passes to child thread
			Thread.yield();
			System.out.println(Thread.currentThread().getName()+"  in Controll");
		}
		
	}
	*/	
		
		//Sleep Method
		Mythread t1=new Mythread();
		Mythread t2=new Mythread();
		t1.start();
		t2.start();
		
		//Join Method
		System.out.println("isAlive:"+t1.isAlive());
		t1.join(1000);
		t2.join(1000);
		System.out.println("isAlive:"+t1.isAlive());
		

	}
	}
	class Mythread extends Thread
	{
		public void run(){
			for(int i=0;i<5;i++){
				
			/*try {
				//Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
*/				System.out.println(Thread.currentThread().getName()+"in Controll"+i);
			}
		}}
	

