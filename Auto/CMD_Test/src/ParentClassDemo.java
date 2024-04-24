class ChildClass extends ParentClassDemo
{
	public int data=20;
	public void getData()
	{
		System.out.println("Me child");
	}

	public ChildClass()
	{
		System.out.println("inside child constructor");
	}
	static{
		System.out.println("Child static");
	}
}


public class ParentClassDemo {


	public ParentClassDemo()
	{
		System.out.println("inside parent constructor");

	}
	public int data=10;
	protected void getData()
	{
		System.out.println("Me Parent");
	}
	static{
		System.out.println("Parent static");
	}

	public static void main(String[] args) {

		//ParentClassDemo ph=new ParentClassDemo();
		//ChildClass cc=new ChildClass();
		ParentClassDemo pc=new ChildClass();
		//ph.getData();
		//cc.getData();
		pc.getData();

		// System.out.println();

	}

}
