package com.generics;

/*The idea is to allow type (Integer, String, … etc and user defined types) to be a parameter to methods, classes and 
interfaces. For example, classes like HashSet, ArrayList, HashMap, 
etc use generics very well. We can use them for any type.*/

//To create an instance of generic class 
/*BaseType <Type> obj = new BaseType <Type>()

Note: In Parameter type we can not use primitives like 
   'int','char' or 'double'.*/

public class GenericDemo {

	public static void main(String[] args) {
		Test<Integer> m=new Test<Integer>(15);
		System.out.println(m.getClass()+":"+m.getType());
		
		Test<String> m1=new Test<String>("Hi");
		System.out.println(m1.getClass()+":"+m1.getType());
		
		

	}

	// We use < > to specify Parameter type 
	

}
class Test<T>{
	T obj;
	// constructor 
	public Test(T obj){
		this.obj=obj;
	}
	public T getType()
	{
		return this.obj;
	}
}

/*Advantages of Generics:

Programs that uses Generics has got many benefits over non-generic code.
Code Reuse: We can write a method/class/interface once and use for any type we want.
.

Type Safety : Generics make errors to appear compile time than at run time (It’s always better to know problems in 
your code at compile time rather than making your code fail at run time). Suppose you want to create an ArrayList that
 store name of students and if by mistake programmer adds an integer object instead of 
string, compiler allows it. But, when we retrieve this data from ArrayList, it causes problems at runtime.

// A Simple Java program to demonstrate that NOT using 
// generics can cause run time exceptions 
import java.util.*; 
  
class Test 
{ 
    public static void main(String[] args) 
    { 
        // Creatinga an ArrayList without any type specified 
        ArrayList al = new ArrayList(); 
  
        al.add("Sachin"); 
        al.add("Rahul"); 
        al.add(10); // Compiler allows this 
  
        String s1 = (String)al.get(0); 
        String s2 = (String)al.get(1); 
  
        // Causes Runtime Exception 
        String s3 = (String)al.get(2); 
    } 
} 
Run on IDE

Output :

Exception in thread "main" java.lang.ClassCastException: 
   java.lang.Integer cannot be cast to java.lang.String
	at Test.main(Test.java:19)
How generics solve this problem?
At the time of defining ArrayList, we can specify that this list can take only String objects.

// Using generics converts run time exceptions into  
// compile time exception. 
import java.util.*; 
  
class Test 
{ 
    public static void main(String[] args) 
    { 
        // Creating a an ArrayList with String specified 
        ArrayList <String> al = new ArrayList<String> (); 
  
        al.add("Sachin"); 
        al.add("Rahul"); 
  
        // Now Compiler doesn't allow this 
        al.add(10);  
  
        String s1 = (String)al.get(0); 
        String s2 = (String)al.get(1); 
        String s3 = (String)al.get(2); 
    } 
}*/

