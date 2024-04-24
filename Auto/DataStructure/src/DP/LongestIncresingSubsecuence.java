package DP;

public class LongestIncresingSubsecuence {

	public static void main(String[] args) {
	int arr[]={10,22,9,33,35,21,50,40,60};
	int n =arr.length;
	
	int les=getLES(arr,n);
	System.out.println("LES::"+les);

	}

	private static int getLES(int[] arr, int n) {
		
	int arr1[]=new int[n];
	int max=0;
		
		for(int i=0;i<n;i++)
		{
			arr1[i]=1;
			System.out.print(arr1[i]+" ");
		
		for( i=1;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(arr[j]<arr[i]&& arr1[i]<arr1[j]+1)
				{
					arr1[i]=arr1[j]+1;
				}
				
			}
			
			
			for(int k=0;k<n;k++)
			{
				if(max<arr1[i])
					{
					max=arr1[i];
					}
			}
	}
		}
	
	
	return max;
}

	
	

}
