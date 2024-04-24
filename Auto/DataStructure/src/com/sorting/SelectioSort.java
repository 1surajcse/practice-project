package com.sorting;

public class SelectioSort {

	public static void main(String[] args) {
		int array []={3,94,2,14,3,55};
		
		for(int lastindex=array.length-1;lastindex>0;lastindex--)
		{
			int largest=0;
			
			for(int i=1;i<=lastindex;i++)
			{
				if(array[i]>array[largest]){		
				largest=i;
				System.out.println(array[largest]);
	
				}
					
			}
			swap(array, largest, lastindex);
		}
		
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}

	}
	
	public static void swap(int array[],int i,int j)
	{
		if(i==j){
			return;
			}
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;
		
		
		
	}

}
