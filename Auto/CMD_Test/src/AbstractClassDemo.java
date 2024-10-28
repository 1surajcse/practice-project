package CMD_Test.src;


/***
 * 
 * @author stiwari
 * 1.in Java, an instance of an abstract class cannot be created, we can have references of abstract class type though.
 * 2.an abstract class can contain constructors in Java. And a constructor of abstract class is called when 
 * an instance of a inherited class is created. 
 * 3.we can have an abstract class without any abstract method. This allows us to create classes that cannot be instantiated, but can only be inherited.


 */
public class AbstractClassDemo  extends AbstractClass{
 

	public static void main(String[] args) {
		AbstractClass abstractClass=new AbstractClassDemo() ;

		abstractClass.newF();

		abstractClass.foo();
		
		String s="\"Ram\"";
		System.out.println(s);
	//	s=StringEscapeUtils.escapeHtml3(s);
		System.out.println(s);

	}

	@Override
	void foo() {
		System.out.println("inside foo");

	}

}
