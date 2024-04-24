package DP;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="ACBCBB";
		String s2="ABCCBB";
		 int n=s1.length();
		 int m=s2.length();
		
		int lcs=getlcs(s1,s2,n,m);
		System.out.println("LCS::"+lcs);

	}

	private static int getlcs(String s1, String s2,int n,int m) {
		
		 char arr[] =s1.toCharArray();
		 char arr1[]=s2.toCharArray();
		
		if(n==0||m==0)
		{
			return 0;
		}
		if(arr[n-1]==arr1[m-1])
		{
			return getlcs(s1,s2,n-1,m-1)+1;
		}
		else
		{
			return max( getlcs(s1,s2,n,m-1), getlcs(s1,s2,n-1,m));
		}
		
	
	}

	private static int max(int a, int b) {
		// TODO Auto-generated method stub
		
		return (a>b)?a:b;
	}

}
