package com.threadDemo;


/*You can make any java thread as daemon thread. Daemon threads acts like service providers for other threads running in the same process.
Daemon threads will be terminated by the JVM when there are none of the other threads running, it includs main thread of execution as well.
To specify that a thread is a daemon thread, call the setDaemon method with the argument true.
To determine if a thread is a daemon thread, use the accessor method isDaemon.*/
public class DamenThread extends Thread{

	public DamenThread()
	{
	setDaemon(true);	
	}
	public void run()
	{
		System.out.println("is Daemon thead::-"+isDaemon());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DamenThread damenThread=new DamenThread();
		damenThread.start();
	}

}
