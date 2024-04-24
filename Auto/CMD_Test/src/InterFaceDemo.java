/***
 * 
 * @author stiwari
 *Why do we use interface ?

It is used to achieve total abstraction.
Since java does not support multiple inheritance in case of class, but by using interface it can achieve multiple 
inheritance .
It is also used to achieve loose coupling.
Interfaces are used to implement abstraction. So the question arises why use interfaces when 
we have abstract classes?


The reason is, abstract classes may contain non-final variables, whereas variables in interface are final, 
public and static.
 */
public class InterFaceDemo implements abc {

	public static void main(String[] args) {
		
	

		InterFaceDemo obj=new InterFaceDemo();
		obj.disply(a);
		obj.display();//In java 8 we can have default method
		
		abc.display1();
		
	}
	@Override
	public void disply(int a) {
		System.out.println("Variable::"+a);

	}

}

interface abc  {
	int a=8;
	void disply(int a);
	default void display() 
	{ 
		System.out.println("hello"); 
	}
	
	static void display1() 
	{ 
		System.out.println("you can call me without creating the object but I can not be inherrited"); 
	}

}


/*New features added in interfaces in JDK 8

1.Prior to JDK 8, interface could not define implementation. We can now add default implementation for interface methods. 
This default implementation has special use and does not affect the intention behind interfaces.
Suppose we need to add a new function in an existing interface. Obviously the old code will not work as the classes
have not implemented those new functions. So with the help of default implementation, we will give a default
body for the newly added functions. Then the old codes will still work.

// An example to show that interfaces can 
// have methods from JDK 1.8 onwards 
interface in1 
{ 
    final int a = 10; 
    default void display() 
    { 
        System.out.println("hello"); 
    } 
} 

// A class that implements interface. 
class testClass implements in1 
{ 
    // Driver Code 
    public static void main (String[] args) 
    { 
        testClass t = new testClass(); 
        t.display(); 
    } 
} 

 *
 *
 *2...Another feature that was added in JDK 8 is that we can now define static methods in interfaces which
 * can be called independently without an object. Note: these methods are not inherited.
// An example to show that interfaces can 
// have methods from JDK 1.8 onwards 
interface in1 
{ 
    final int a = 10; 
    static void display() 
    { 
        System.out.println("hello"); 
    } 
} 

// A class that implements interface. 
class testClass implements in1 
{ 
    // Driver Code 
    public static void main (String[] args) 
    { 
        in1.display(); 
    } 
}
 *
 *
 *
 *
 *Imp Points:
 *We can’t create instance(interface can’t be instantiated) of interface but we can make reference of it that refers to the Object of its implementing class.
A class can implement more than one interface.
An interface can extends another interface or interfaces (more than one interface) .
A class that implements interface must implements all the methods in interface.
All the methods are public and abstract. And all the fields are public, static, and final.
It is used to achieve multiple inheritance.
It is used to achieve loose coupling.
New features added in interfaces in JDK 9 
From Java 9 onwards, interfaces can contain following also

Static methods
Private methods
Private Static methods
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
