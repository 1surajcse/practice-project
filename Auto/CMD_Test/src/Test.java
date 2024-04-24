interface Age{
	int x=10;
void getAge(int x);
}

public class Test
{
	public static void main(String[] args) {
		Age t=(x)->
		{
			System.out.println("age:"+x*x);
		};
		int x1=t.x;
		t.getAge(x1);
	}}

