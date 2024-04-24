
public class Practical {
	int A=10;
	public static void main(String[] args) throws Exception{
		
	Practical practical=new Practical();
	Practical.get(3.0f,1.0f);
	
	Integer i=1;
	int a=i;
	
	//System.out.println(Practical.get(i));
	
	Practical.get(i);

	
//	System.out.println(	practical.get(practical.A));

	}
	
	public static Object get(Object a){
	System.out.println("inside object");
	return a;
	}
/*	public static String get(String a){
	System.out.println("inside String");
	return a;
	}*/
	public static int get(int a,int b){
		System.out.println("inside int ");
		return a+b;
		}
	private static float get(float b,float a){
	System.out.println("inside float");
	return a;
	
		}
	
	public  int get(int a){
		int x=5;
		System.out.println("inside first"+x);
		return x;
		}
	

}
