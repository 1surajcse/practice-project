package com.multiThreading;
//Main thread created automatically the moment a program is started.To control it we have to create the reference
//for each program main method is created by the JVM.
//Main thread first verify the existence of main method.then its initailize the class
//Main method is mandatory after jdk 6
public class MainThread extends Thread{

	public static void main(String[] args) throws InterruptedException {
		//getting reference to main thread
Thread main=Thread.currentThread();
main.setName("Geeks");
System.out.println("Default priority:"+main.getPriority());

main.setPriority(MAX_PRIORITY);
System.out.println("after Setting ::"+main.getPriority());

//creting deadlock using main thread

System.out.println("enterring into deadlock");
Thread.currentThread().join();
System.out.println("This statement will never execute");

//main thread will wait for this thread(mean itself) to die.



	}

}
