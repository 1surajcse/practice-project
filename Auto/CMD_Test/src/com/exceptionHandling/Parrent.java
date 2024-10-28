package com.exceptionHandling;

import java.io.IOException;
import java.sql.SQLDataException;
/***
 * 
 * @author stiwari
 *There is no problem in case of run time exception(Unchecked exception) for both child and parent
 *There is no problem if parent is throwing checked exception(compile time) exception and child does not
 *there is a problem if child is throwing a checked exception(Compile) and its not handled in parent.
 *
 *
 *Above scenario is work just opposite in case of exception is thrown on constructor
 *
 *in case of constructor there is no problem in run time
 *
 *there is no problem if you throws checked exception at child constructor
 *but if you are throwing an exception at parent constructor you have to handle it in child constructor as well
 *
 *Important points to remember about throws keyword:

throws keyword is required only for checked exception and usage of throws keyword for unchecked exception is meaningless.
throws keyword is required only to convince compiler and usage of throws keyword does not prevent abnormal termination of program.
By the help of throws keyword we can provide information to the caller of the method about the exception
 *
 *
 * +-----------+
		   | Throwable |
                   +-----------+
                    /         \
		   /           \
          +-------+          +-----------+
          | Error |          | Exception |
          +-------+          +-----------+
	   /  |  \           / |        \
         \________/	  \______/    	 \
			                +------------------+
	unchecked	 checked	| RuntimeException |
					+------------------+
					  /   |    |      \
					 \_________________/
					   
					   unchecked
 *
 *
 */



public class Parrent {
	int i=6;
	public Parrent() {
		System.out.println("inside Parrent class constructor::"+i);
	
	}
	 
	public  void m1() throws IOException{
		System.out.println("inside parrent");

	}
	public  Integer m2(float  a,float b)throws SQLDataException{
		System.out.println("inside parrent m2");
		return (int) (a+b);
	}
}
