package com.sorting;

public class MergeSort {

	public static void main(String[] args) {
	int arr[]={2,4,3,6,9,4,45,33};
	System.out.print(" Array:");
	
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+",");
	}
	
	sort(arr,0,arr.length-1);
	
	System.out.println("sorted Array");
	for (int o = 0; o< arr.length; o++) {
		System.out.print(arr[o]+",");
	}

	}

	

	private static void sort(int[] arr, int l, int r) {
		if(l<r){
			int m=(l+r)/2;
			
			sort(arr,l,m);
			sort(arr,m+1,r);
			merge(arr,l,m,r);
		}
		
	}

	private static void merge(int[] arr, int l, int m, int r) {
		//create the size of two halves array
		int n1=m-l+1;
		int n2=r-m;
		
		//create the temp arrays for two halves
		
		int L[]=new int [n1];
		int R[]=new int [n2];
		
		//copying data into arrays
		for(int i=0;i<n1;++i)
			L[i]=arr[l+i];
		for(int j=0;j<n2;++j)
			R[j]=arr[m+1+j];
		
		
		//merge the arrays
		
		int i=0;int j=0;
		int k=l;
		
		while(i<n1&&j<n2){
			if(L[i]<=R[j])
			{
				arr[k]=L[i];
				i++;
			}
			else
			{
				arr[k]=R[j];
				j++;
			}
			k++;
		}
		//copying the remaining values
		
		while(i<n1){
			arr[k]=L[i];
			i++;
			k++;
		}
		while(j<n2){
			arr[k]=R[j];
			j++;
			k++;
		}
		
	}
	

}
