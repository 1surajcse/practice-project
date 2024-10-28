package CMD_Test.src.com.AnonumousandInnerclass;
/**
 * An inner class declared without a class name is known as an anonymous inner class. In case of anonymous inner classes, 
 * we declare and instantiate them at the same time. Generally, they are used whenever you need to override the 
 * method of a class or an interface. The syntax of an anonymous inner class is as follows −
 * 
 * AnonymousInner an_inner = new AnonymousInner() {
   public void my_method() {
      ........
      ........
   }   
};
Anonymous inner class are mainly created in two ways:

Class (may be abstract or concrete)
Interface
 * @author stiwari
 *
 */

	abstract class AnonymousInner {
		   public abstract void mymethod();
		}
	public class AnonymousInnerC {

		   public static void main(String args[]) {
		      AnonymousInner inner = new AnonymousInner() {
		         public void mymethod() {
		            System.out.println("This is an example of anonymous inner class");
		         }
		      };
		      inner.mymethod();	
		      
		      ABC abc=new ABC() {
				
				@Override
				public void display() {
					System.out.println("I am inter face");
					
				}
			};
			abc.display();
		   }
		   
		}
	
	interface ABC{
		public void display();
	}
	
	/*Difference between Normal/Regular class and Anonymous Inner class:

		A normal class can implement any number of interfaces but anonymous inner class can implement only one 
		interface at a time.
		A regular class can extend a class and implement any number of interface simultaneously. But anonymous Inner
	    class can extend a class or can implement an interface but not both at a time.
		For regular/normal class, we can write any number of constructors but we cant write any constructor for anonymous 
		Inner class because anonymous class does not have any name and while defining constructor class name and 
		constructor name must be same.
		Accessing Local Variables of the Enclosing Scope, and Declaring and Accessing Members of the Anonymous Class
		Like local classes, anonymous classes can capture variables; they have the same access to local variables of the enclosing scope:

		An anonymous class has access to the members of its enclosing class.
		An anonymous class cannot access local variables in its enclosing scope that are not declared as final or 
		effectively final.
		Like a nested class, a declaration of a type (such as a variable) in an anonymous class shadows any other 
		declarations in the enclosing scope that have the same name.
		Anonymous classes also have the same restrictions as local classes with respect to their members:

		We cannot declare static initializers or member interfaces in an anonymous class.
		An anonymous class can have static members provided that they are constant variables.
		Note that you can declare the following in anonymous classes:

		Fields
		Extra methods (even if they do not implement any methods of the supertype)
		Instance initializers
		Local classes
*/
