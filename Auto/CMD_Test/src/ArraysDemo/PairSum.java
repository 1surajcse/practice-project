package CMD_Test.src.ArraysDemo;

import java.util.HashSet;
import java.util.Set;

public class PairSum {

	public static void main(String[] args) {
	
		int arr[]={1,2,3,6,9,13,12};
		
		printSumPair(arr,15);

	}

	private static void printSumPair(int[] arr,int n) {
		
		Set<Integer>h=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++){
		int target=n-arr[i];
		
		if(!h.contains(target)){
			h.add(arr[i]);
		}
		else{
			System.out.println("Pair::"+target+","+arr[i]);
		}
		}
		

		
		
	}

}
