package com.String;

public class StringPallondrme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
isPallondrome("Suraj");


//Write a method which will remove any given character from a String


String s="Suraj";
System.out.println("Removal::"+s.substring(0,s.indexOf('u'))+s.substring(s.indexOf('u')+1));

	}

	public static boolean isPallondrome(String s )
	{
		//1.Reverse a String using string Builder
		StringBuilder sb=new StringBuilder(s);
		String s2=sb.reverse().toString();
		
		String s3="";
		char[]arr=s.toCharArray();
		
		//1.Reverse a String without any method
		/*for(int i=arr.length-1;i>=0;i--)
		{
			s3=s3+arr[i];
		}*/
		System.out.println("S3::"+s3);
		if(s2.equals(s))
		{
			System.out.println(" pallondorme");
			return true;
		}
		
			
		
	System.out.println("Not a pallondorme");
	return false;
	}
}
