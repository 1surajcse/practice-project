/*We can make constructor as private. So that We can not create an object outside of the class.
This property is useful to create singleton class in java.
Singleton pattern helps us to keep only one instance of a class at any time.
The purpose of singleton is to control object creation by keeping private constructor.*/

class Some
{
	//SingletonUsingPrivateConstructor oj=new SingletonUsingPrivateConstructor();
	
	}
public class SingletonUsingPrivateConstructor {
	
	private static SingletonUsingPrivateConstructor obj;
	private SingletonUsingPrivateConstructor(){
		
	}
	
	public static SingletonUsingPrivateConstructor getInstance()
	{
		if(obj==null)
		{
			obj=new SingletonUsingPrivateConstructor();
		}
		return obj;
		
	}
	
	public void doSomething()
	{
		System.out.println("method calling");
	}

	

	public static void main(String[] args) {
	
SingletonUsingPrivateConstructor obj= SingletonUsingPrivateConstructor.getInstance();

obj.doSomething();
	}
	
	/*
	 * First create the private static className class_instancse
	 * private constructor
	 * public static className new instance()
	 * {
	 * if(obj==null)
	 * {
	 * obj=new className();
	 * }
	 * return obj;
	 * }
	 * 
	 * public doSomething()//Make any method
	 * {
	 * syso("Method calling");
	 * }
	 * 
	 *PSVM()
	 *{
	 *className oj=new className.getInstance();
	 *}
	 * 
	 * */

}
