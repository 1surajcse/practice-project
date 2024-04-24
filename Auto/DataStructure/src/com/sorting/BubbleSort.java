package com.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		
		int []array ={2,2,5,-10,3,3,7,9,4,3,20};
		
		for(int lastindex=array.length-1;lastindex >0;lastindex--){
			for(int i=0;i<lastindex;i++){
				if(array[i]>array[i+1]){
					swap(array, i, i+1);
				}
			} 
			
		}
		System.out.println("Sorted Array::");
		
		for(int j=0;j<array.length;j++){
			System.out.print(array[j]+" ");
		    }
		
		
		
	}
	
	public static void swap(int array[],int i, int j)
	{
	  if(i==j){
			return  ;
		}
		   int temp=array[i];
		   array[i]=array[j];
		   array[j]=temp;
	}

}
