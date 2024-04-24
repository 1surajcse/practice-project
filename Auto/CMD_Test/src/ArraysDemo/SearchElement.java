package ArraysDemo;

import java.util.Arrays;

public class SearchElement {

	public static void main(String[] args) {
		int arr[]={4,5,6,67,11,7,8,9};
		 int n=6;
		 
		 printModifiedArray(arr,n);
	}

	private static void printModifiedArray(int[] arr, int n) {
	
		//Arrays.sort(arr);
		arr=sortArray(arr);
		
		for (int i=0;i<arr.length;i++) {
			if(arr[i]==n){
				arr[i]=n*2;
			}
			
		}
		for (int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+",");
			
		}
	}

	private static int[] sortArray(int[] array) {
		for(int lastindex=array.length-1;lastindex >0;lastindex--){
			for(int i=0;i<lastindex;i++){
				if(array[i]>array[i+1]){
					swap(array, i, i+1);
				}
			} 
			
		}
		return array;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp;
		if(i==j){
			return  ;
		}
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
		
	}

}
