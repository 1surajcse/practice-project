package CMD_Test.src.com.AnonumousandInnerclass;
/***

Nested classes are divided into two types −

1.Non-static nested classes − These are the non-static members of a class.
Inner classes are a security mechanism in Java. We know a class cannot be associated with the access modifier private, 
but if we have the class as a member of other class, then the inner class can be made private. And this is also used to 
access the private members of a class.

Inner classes are of three types depending on how and where you define them. They are −
Inner Class
Method-local Inner Class
Anonymous Inner Class

Unlike a class, an inner class can be private and once you declare an inner class private,
 it cannot be accessed from an object outside the class

2.Static nested classes − These are the static members of a class.


 * @author stiwari
 *
 */
public class InnerClassesDemo {

	public static void main(String[] args) {
	InnerC outer=new InnerC();
	InnerC.InnerD i=outer.new InnerD();
	i.Foo();

	}

}
