/***
 * 
 * @author stiwari
 * 1.in Java, an instance of an abstract class cannot be created, we can have references of abstract class type though.
 * 2.an abstract class can contain constructors in Java. And a constructor of abstract class is called when 
 * an instance of a inherited class is created. 
 * 3.we can have an abstract class without any abstract method. This allows us to create classes that cannot be instantiated, but can only be inherited.
4.Abstract classes can also have final methods (methods that cannot be overridden). 
 */
abstract public class AbstractClass {
	
	abstract void foo();
	 final void newF() {
		 System.out.println("Final Check");
	} 

}
