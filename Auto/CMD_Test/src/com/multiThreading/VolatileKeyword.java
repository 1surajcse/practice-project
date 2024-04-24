package com.multiThreading;
/*The problem with threads not seeing the latest value of a variable because it has not yet been written back to 
 * main memory by another thread, is called a "visibility" problem.The updates of one thread are not visible to other 
 * threads.
 * 
 * 
 * 
 * The Java volatile Visibility Guarantee::
   The Java volatile keyword is intended to address variable visibility problems. By declaring the counter variable 
   volatile all writes to the counter variable will be written back to main memory immediately. Also, all reads of the
   counter variable will be read directly from main memory.

   Here is how the volatile declaration of the counter variable looks:

public class SharedObject {

    public volatile int counter = 0;

}
 * As I have mentioned earlier, if two threads are both reading and writing to a shared variable, then using the volatile 
 * keyword for that is not enough. You need to use a synchronized in that case to guarantee that the reading and 
 * writing of the variable is atomic. Reading or writing a volatile variable does not block threads reading or writing.
 *  For this to happen you must use the synchronized keyword around critical sections.
 * 
 * 
 *  the volatile keyword in Java is used as an indicator to Java compiler and Thread that do not cache value of 
 *  this variable and always read it from main memory. 


 * */
public  class VolatileKeyword {
	  private int years;
	    private  int months;
	    public VolatileKeyword(int years, int months, int days) {
			super();
			this.years = years;
			this.months = months;
			this.days = days;
		}

		private volatile int days;
	    
	public static void main(String[] args) {
		

	}
	
	/**
	 * Difference between synchronized and volatile keyword in Java
What is the difference between volatile and synchronized is another popular core Java question asked on multi-threading 
and concurrency interviews. Remember volatile is not a replacement of synchronized keyword but can be used as an 
alternative in certain cases. Here are few differences between volatile and synchronized keyword in Java.

1. The volatile keyword in Java is a field modifier while synchronized modifies code blocks and methods.

2. Synchronized obtains and releases the lock on monitor’s Java volatile keyword doesn't require that.

3. Threads in Java can be blocked for waiting for any monitor in case of synchronized, that is not the case with the 
volatile keyword in Java.

4. Synchronized method affects performance more than a volatile keyword in Java.

5. Since volatile keyword in Java only synchronizes the value of one variable between Thread memory and "main" memory 
while synchronized synchronizes the value of all variable between thread memory and "main" memory and locks and releases a monitor to boot. Due to this reason synchronized keyword in Java is likely to have more overhead than volatile.

6. You can not synchronize on the null object but your volatile variable in Java could be null.

7. From Java 5 writing into a volatile field has the same memory effect as a monitor release, and reading from a 
volatile field has the same memory effect as a monitor acquire



	 */

}
