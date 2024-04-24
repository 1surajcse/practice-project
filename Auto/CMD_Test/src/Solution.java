import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            /*Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                String s2=sc.next();
                int x1=sc.nextInt();
                String s3=sc.next();
                int x2=sc.nextInt();
              
           
                     System.out.printf("%-14s %03d %n",s1,x);

                     
                     System.out.printf("%-14s %03d %n",s2,x1);

                     
                     System.out.printf("%-14s %03d %n",s3,x2);
                     
                
            System.out.println("================================");
            
            
*/
    	
    	/*Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int multi;
        if(n>=2&&n<=20)
        {
          for(int i=1;i<11;i++)
          {
              multi=n*i;
              System.out.println(n+"X"+i+"="+multi+"\n");
          }
        }*/
    	
    	
    	/*String check="abbcccbbbbaaddddccccffsssss";
    	String result="";
    	String cou="";
    	int count=1;
    	for(int i=0;i<check.length();i++)
    	{
    		if(i==check.length()-1)
    		{
    			if(count>1)
    			{
    				result=""+check.charAt(i)+cou;
    			}
    			else
    			{
    				result=""+check.charAt(i);	
    			}
    			
    			System.out.print(result);
    			break;
    		}
         	if(check.charAt(i)==check.charAt(i+1))
    		{
    			count++;
    			 if(i==check.length())
    				{
    	         	
    					cou=String.valueOf(count);
    	    			if(count>1)
    	    			{
    	    				result=""+check.charAt(i)+cou;
    	    			}
    	    			else
    	    			{
    	    				result=""+check.charAt(i);
    	    			
    	    			}
    	    			count=1; 
    	    			System.out.print(result);
    				}
    			
    		}
         	
    		else
    		{
    			
    			cou=String.valueOf(count);
    			if(count>1)
    			{
    				result=""+check.charAt(i)+cou;
    			}
    			else
    			{
    				result=""+check.charAt(i);
    			
    			}
    		
 				
    			
    			count=1; 
    			System.out.print(result);
    		
    	    	
    		}
         
         	
    		
    	}
    *//*
    	recursiveMethod("Suraj");
    	System.out.print(recursiveMethod("Suraj"));
    	
    	
    	*//***
    	 * Reverse String through String buffer
    	 *//*
    	String s="This is Suraj";
    	String arr[]=s.split(" ");
    	Character arrr[];
    	String result;
    	
    	StringBuffer bf=new StringBuffer(s);
    	System.out.println("Reverdse::"+bf.reverse());
    	
    	*//***
    	 * through for loop
    	 *o/p siht si jaruS
    	 *//*
    	int p;
    	for(int i=0;i<arr.length;i++)
    	{
    		String j=arr[i];

    		for(int k=j.length()-1;k<=0;k--)
    		{
    			//arr[p]=""+j.charAt(k);
    			
    		}
    		//results[i]=""+result;
    	}
    	
    	
    	
    	
    	
    	
        
            }
    static String recursiveMethod(String str)
    {
         if ((null == str) || (str.length() <= 1))
         {
                return str;
         }
        
     
         return recursiveMethod(str.substring(1)) + str.charAt(0);
    }*/
    	
   /* 	Problem -7*/
    	/*Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int result=0;
          int temp=0;
        for(int i=1;i<=t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            result=a+1*b;
    	            int x=2;
    	            	do
                        {
    	            result=result+temp;
    	       	 temp=x*b;
    	           
    	
    	            System.out.println(result);
                            x=x*2;
                            if(n>15)
                            {
                                break;
                            }
                          n--;  
                        }
                        while(n>0);
        
        }
        in.close();*/
    	
    	
    /*	Arry short*/
    	
 /*   	int arr[]={2,4,1,5,6,8};
    	String sArr[]={"Suraj","Ram","shyam"};
    
    	Arrays.sort(arr);
    	System.out.println("sorted int::"+Arrays.toString(arr));
    	
    	Arrays.sort(sArr);
    	System.out.println("sorted String::"+Arrays.toString(sArr));
    	
    	int sum=0;
    	
    	for(int i=0;i<arr.length;i++)
    	{
    		sum=sum+arr[i];
    	}
    	System.out.println("sum:"+sum);
    }
  */  
    	FunctionalInterface_Demo play=()->
    	{
    		System.out.println("Play a game");
    	};
    	
    	play.play();
    
    
    } 
    
}