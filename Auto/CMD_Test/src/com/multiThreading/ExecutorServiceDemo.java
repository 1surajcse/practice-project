package com.multiThreading;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.*;

/****
 * Executor service is an interface,Asynchronas in nature, which is capable of executing tasks in background
 * 
 * Executor service thus a very similar in term of thread pool.
 * @author stiwari
 *
 */
public class ExecutorServiceDemo {

	public static void main(String[] args) throws ExecutionException {
	ExecutorService executorService=Executors.newFixedThreadPool(10);
	executorService.submit(new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Asynchronous");
			
		}
	});
	/**
	 * thus Executor service is an interface then there shuld be its implemataion
	 * 
	 * ThreadpoolExecutor
	 * scheduledthreadpoolExecutor
	 * 
	 */
	
	ExecutorService service1=Executors.newFixedThreadPool(10);
	/*ExecutorService s2=Executors.newSingleThreadExecutor();
	ExecutorService s3=Executors.newScheduledThreadPool(10);*/
	
	/***
	 * ExecutorService Usage:
               There are a few different ways to delegate tasks for execution to an ExecutorService:

execute(Runnable)
submit(Runnable)
submit(Callable)
invokeAny(...)
invokeAll(...)
	 */

/*	Execute method takes the runnable object and execute it asynchronsly*/
	
	service1.execute(new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Using runnable");
			
		}
	});
	
	/*	submit method is similler as execute it returns the future object. 
	 * This future object can be used to check weather runable as finished its executing*/
Future future=service1.submit(new Runnable() {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
});

try {
	
	System.out.println("check::"+future.get());//future object is returned null if the task is executed succesfully
} catch (InterruptedException | ExecutionException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
/*
submit(callable) is same as submit(runable ) except its call() method is return the result*/

Future f1=service1.submit(new Callable() {

	public Object call() throws Exception {
		// TODO Auto-generated method stub
		return "return result";
	}
	
});
try {
	System.out.println("check2::"+f1.get());
} catch (InterruptedException | ExecutionException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

/*invokeAny is basically method takes the collection of callable object.invoking this method does not return the future but
 * return the result of one of the callable objects .
 * if one of the calable object is completed or throws exception rest of the callable objects are canceled.
 *  */
	

ExecutorService executorService2=Executors.newFixedThreadPool(10);
Set<Callable<String>>callables=new HashSet<Callable<String>>();

callables.add(new Callable<String>() {
	
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return "result1";
	}
});
callables.add(new Callable<String>() {
	
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return "result2";
	}
});
try {
	String result=executorService2.invokeAny(callables);
	System.out.println("Result::"+result);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (ExecutionException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
/*
The invokeAll() method invokes all of the Callable objects you pass to it in the collection passed as parameter. The invokeAll() returns a 
list of Future objects via which you can obtain the results of the executions of each Callable.*/

try {
	List<Future<String>>l=executorService2.invokeAll(callables);
	for(Future<String> futur : l){
	    System.out.println("future.get = " + futur.get());
	}
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
executorService2.shutdown();
executorService.shutdown();
	}
	
	
	
	

}
