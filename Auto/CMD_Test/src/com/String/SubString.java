package com.String;
import java.util.Scanner;

public class SubString {


		public static String getSmallestAndLargest(String s, int k) {
	        String smallest = "";
	        String largest = "";
	        
	        // Complete the function
	        // 'smallest' must be the lexicographically smallest substring of length 'k'
	        // 'largest' must be the lexicographically largest substring of length 'k'
	        
	        for(int i=0;i<s.length();i++)
	        {
	        	
	        	String s1=s.substring(-3,1);
	        	System.out.println(s1);
	        }
	        
	        return smallest + "\n" + largest;
	    }

	    public static void main(String[] args) {
	      
	        //System.out.println(getSmallestAndLargest("dsfdsaf", 4));
	    	
	    	System.out.println(1.0 / 0.0);
	    }

	

}
