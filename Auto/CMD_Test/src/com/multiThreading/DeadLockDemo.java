package com.multiThreading;

public class DeadLockDemo {
	//This method request two locks first String and then Integer
	public void m1(){
		synchronized(String.class){
			System.out.println("Acquired Lock on String.class object");
		}
		synchronized(Integer.class){
			System.out.println("Acquired Lock on Integer.class object");
		}
	}
	//This method request two locks first Integer and then String
	/***
	 * /* * This method also requests same two lock but in exactly * Opposite order i.e. first Integer and then String. * 
	 * This creates potential deadlock, if one thread holds String lock * and other holds Integer lock and 
	 * they wait for each other, forever. 
	 * */


	 
	public void m2(){
		synchronized(Integer.class){
			System.out.println("Acquired Lock on Integer.class object");
		}
		synchronized(String.class){
			System.out.println("Acquired Lock on String.class object");
		}
	}

	public static void main(String[] args) {
		

	}
	
	//Solution to the above Problem
	
	/***
	 * Both the method will hold both the object but in same order
	 */
	public void m1Demo(){
		synchronized(String.class){
			System.out.println("Acquired Lock on String.class object");
		}
		synchronized(Integer.class){
			System.out.println("Acquired Lock on Integer.class object");
		}
	}
	//This method request two locks first Integer and then String
	/***
	 * /* * This method also requests same two lock but in exactly * Opposite order i.e. first Integer and then String. * 
	 * This creates potential deadlock, if one thread holds String lock * and other holds Integer lock and 
	 * they wait for each other, forever. 
	 * both will be waiting for each other to release lock on Integer and String to proceed further which will never happen.
	 * 
	 * Solution:
So, if thread A acquires a lock on Integer object, thread B will not proceed until thread A releases Integer lock, 
same way thread A will not be blocked even if thread B holds String lock because now thread B will not expect
 thread A to release Integer lock to proceed further.


	 * */


	 
	public void m2Demo(){
		synchronized(String.class){
			System.out.println("Acquired Lock on Integer.class object");
		}
		synchronized(Integer.class){
			System.out.println("Acquired Lock on String.class object");
		}
	}
}
