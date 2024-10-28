package com.searchingTechnique;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int array[]={4,15,30,45,55,90,110};
       
       System.out.println(binarySearch(array, 30));
       
       System.out.println(binarySearch(array, 90));
       
       System.out.println(binarySearch(array, 88));
       
       System.out.println(binarySearch(array, 15));
       
       System.out.println("using recurtion");
       
       System.out.println(binarySearchUsingRecursion(array, 30));
       
       System.out.println(binarySearchUsingRecursion(array, 90));
       
       System.out.println(binarySearchUsingRecursion(array, 88));
       
       System.out.println(binarySearchUsingRecursion(array, 110));
       
       

	}
	
	//Using itrative method
	public static int binarySearch(int array[],int value)
	{
		int start=0;
		int end=array.length;
		while(start<end)
		{
		int mid=(start+end)/2;
		if (array[mid]==value){
			return mid;
		}
		else if(array[mid]<value){
			start=mid+1;
		}
		else{
			end=mid;
		}
		}
		
		return -1;
		
	}
	
	public static int binarySearchUsingRecursion(int array[],int value)
	{
		
		return usingRecursion(array,0,array.length,value);
		
	}

	private static int usingRecursion(int[] array, int start, int end, int value) {
		int mid=(start+end)/2;
		if(start>=end){
			return -1;
		}
		if(array[mid]==value){
			return mid;
		}
		else if(array[mid]<value)
		{
			return usingRecursion(array, mid+1, end, value);
		}
		else
		{
			return usingRecursion(array, start, mid, value);
		}
		
	}

}
