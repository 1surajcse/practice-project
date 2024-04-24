package ArraysDemo;

import java.util.Arrays;
import java.util.BitSet;

public class MissingNo {

	public static void main(String[] args) {
	
                int arr[]= {1,2,5,8};
             
             int missing=3;
               missingNo(arr,5) ;
               printMissingNumber(arr, arr.length+2);
                
                
	}
	
	public static void  missingNo(int arr1[],int n)
	{   int sum=0;
		   for(int i=0;i<arr1.length;i++)
           {
           	sum=sum+arr1[i];
           	
           }
		   System.out.println("sum::"+sum);
		   
         
         int sum1=n*(n+1)/2;
         
         System.out.println("sum1::"+sum1);
         
         System.out.println("missing no::"+(sum1-sum));
       
         
	}
	 private static void printMissingNumber(int[] numbers, int count) {
	        int missingCount = count - numbers.length;
	        System.out.println("missing count"+missingCount);
	        BitSet bitSet = new BitSet(count);
	 
	        for (int number : numbers) {
	            bitSet.set(number - 1);
	        }
	 
	        System.out.printf("Missing numbers in integer array %s, with total number %d is %n",
	        Arrays.toString(numbers), count);
	        int lastMissingIndex = 0;

	        for (int i = 0; i < missingCount; i++) {
	        	System.out.println("inside");
	            lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
	            System.out.println(++lastMissingIndex);
	        }
	 
	    }

}
