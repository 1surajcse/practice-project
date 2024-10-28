public class CmdTest {
	 int a;
	int b;

	public static void main(String[] args){
		// TODO Auto-generated method stub	

		/*		        ProcessBuilder builder = new ProcessBuilder(
		            "cmd.exe", "/c", "cd \"C:/Users/stiwari/stiwari_IN-L1199_6/stiwari_IN-L1199_6/nsr-automation"
		            		+ "/NSR Project/WebContent/front-end\p4 sync betaAgentCreation.jsp#35\" && dir");
		        builder.redirectErrorStream(true);
		        Process p = builder.start();
		        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
		        String line;
		        while (true) {
		            line = r.readLine();
		            if (line == null) { break; }
		            System.out.println(line);
		        }*/


		try
		{
			int i=100/0;

			System.out.println(i);
		}
		catch(ArithmeticException e)
		{
			System.out.println("inside first cathc");
		}
		catch(Exception e)
		{
			System.out.println("inside second cathc");
		}
		finally
		{
			System.out.println("inside finalyy");
		}

		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Age:");
		    int age=sc.nextInt();

		    String verification=(age>=18)?"Valid Voter as you are:"+age:"Invalid voter As you are under Age:"+age;

		    System.out.println(verification);*/
		    
/*	int arr[]={3,4,5,6,7};


	for (int i : arr) {
		System.out.println("check1::"+i);
	}

	arr[2]=9;
	for (int i : arr) {
		System.out.println("check::"+i);
	}
		*/ 
		
		char c='m';

		char ch3=(char)(((int)c-3-97)%26+97);
		
		System.out.println(ch3);
		
		CmdTest cmdTest=new CmdTest();
		cmdTest.a=8;
		 int v=cmdTest.a;
		System.out.println(v);
		
		int cm[]={1,2,3,4,6,8,9};
		
	printSubSet(cm,7);
	String text="rma";
	
	int ss=(char)text.charAt(2);
	System.out.println(ss);
	
	System.out.println("1::"+(int)text.charAt(0));
	System.out.println("2::"+((int)text.charAt(0)+3 - 97));
	System.out.println("3::"+20%26);
	System.out.println("4::"+(((int)text.charAt(0)+3 - 97)%26+97));
	
	  char ch = (char)(((int)text.charAt(0) + 3 - 97) % 26 + 97);
	  System.out.println("its ::"+ch);
	
	String cap="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String smal=cap.toLowerCase();
	String result=null;
	for(int i=0;i<cap.toCharArray().length;i++){
	char a=cap.charAt(i);
	
		char j=(char) (((int)a+3-65)%26+65);	
		System.out.println(a+"::"+j);
		
		result=result+j;

	}
	System.out.println("For Smalll char::");
	String res=null;
	for(int i=0;i<smal.toCharArray().length;i++){
	char a=smal.charAt(i);
	
		char j=(char) (((int)a+3-97)%26+97);		
		System.out.println(a+"::"+j);
		
		res=res+j;

	}
	}

	private static void printSubSet(int[] cm, int i) {
		for (int j = 0; j < cm.length; j++) {
		for (int j2 = 0; j2 < cm.length; j2++) {
			int d=cm[j]+cm[j2];
			if(d==i)
			{
				System.out.println("Pair:"+"{"+cm[j]+','+cm[j2]+"}");
			}
			else if(cm[j2++]<cm.length){
			 if((d+cm[j2+1])==i){
				System.out.println("Pair:"+"{"+cm[j]+','+cm[j2]+","+cm[j2+1]+"}");
			}}
		}
		}
	}}



