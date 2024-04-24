package com.demo.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class TraditionalCollectionVsConcurrentCollection extends Thread {

	// Traditional Collections ( i.e. List, Set, Queue and its implemented Classes
	/***
	 * Tranditional collection like arrayList and Hashset are not synchronized in the nature means there is not thread safety
	 * Vector and stack are synchronized in nature and Traditional classes also have the synchronizedSet,synchronizedMap and synchronizedList
	 * methods through which we can get synchronized version of non synchronized object.But those are not performnace wse good cause of
	 * wide-locking machanism.
	 * @param args
	 * 
	 */
	//static List<String>l=new  ArrayList<String>();
	static CopyOnWriteArrayList<String>l=new CopyOnWriteArrayList<>();
	//Instead of using traditional arrayList I am using concurrent collection List	copyonwriteArraylist	
	public void run(){
		try{
			Thread.sleep(1000);

		}catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("child thread is going to add");
		}
		l.add("A");
		System.out.println("adding");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		l.add("B");
		l.add("C");
		l.add("D");
		//we will create a child thread which is going to modify the list
		TraditionalCollectionVsConcurrentCollection t1=new TraditionalCollectionVsConcurrentCollection();
		
		t1.start();
		
		Iterator it=l.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			Thread.sleep(1000);
		}
		System.out.println(l);
		

	}
	
	//concurrent Collection (i.e. ConcurrentMap interface, ConcurrentHashMap class, CopyOnWriteArrayList class etc).
	/***
	 * Concurrent Collection are syncronized in nature .Hence there is a thread safety.
	 */
/*	8) Why is ConcurrentHashMap faster than Hashtable in Java? (answer)
			ConcurrentHashMap is introduced as an alternative of Hashtable in Java 5, it is faster because of its design.
			 ConcurrentHashMap divides the whole map into different segments and only lock a particular segment during 
			 the update operation, instead of Hashtable, which locks whole Map.

			The ConcurrentHashMap also provides lock-free read, which is not possible in Hashtable,
			 because of this and lock striping, ConcurrentHashMap is faster than Hashtable, especially
			  when a number of the reader is more than the number of writers.
*/
			
}
