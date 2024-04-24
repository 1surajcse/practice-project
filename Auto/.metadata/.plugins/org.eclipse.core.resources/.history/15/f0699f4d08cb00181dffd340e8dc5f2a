package ArraysDemo;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfNumber {

		
	static void findCounts(int arr[], int n)  
    { 
        // Traverse all array elements 
        int i = 0; 
        while (i < n)  
        { 
            // If this element is already processed, 
            // then nothing to do 
            if (arr[i] <= 0)  
            { 
                i++; 
                continue; 
            } 
  
            // Find index corresponding to this element 
            // For example, index for 5 is 4 
            int elementIndex = arr[i] - 1; 
  
            // If the elementIndex has an element that is not 
            // processed yet, then first store that element 
            // to arr[i] so that we don't loose anything. 
            if (arr[elementIndex] > 0)  
            { 
                arr[i] = arr[elementIndex]; 
  
                // After storing arr[elementIndex], change it 
                // to store initial count of 'arr[i]' 
                arr[elementIndex] = -1; 
            }  
            else 
            { 
                // If this is NOT first occurrence of arr[i], 
                // then increment its count. 
                arr[elementIndex]--; 
  
                // And initialize arr[i] as 0 means the element 
                // 'i+1' is not seen so far 
                arr[i] = 0; 
                i++; 
            } 
        } 
  
        System.out.println("Below are counts of all elements"); 
        for (int j = 0; j < n; j++) 
            System.out.println(j+1 + "->" + Math.abs(arr[j])); 
    }  
			      
			    // Driver program 
			    public static void main (String[] 
			    args) { 
			          
			        int a[] = {0, 5, 5, 5, 4}; 
			        int x = 5; 
			        int n = a.length; 
			          
			        findCounts(a,n); 
			    } 
			} 
	


