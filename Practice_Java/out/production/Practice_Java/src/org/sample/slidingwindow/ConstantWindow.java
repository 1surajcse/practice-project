package org.sample.slidingwindow;/*
 * @author -Suraj Tiwari
 */

public class ConstantWindow {

    public static void main(String[] args) {

        int arr[]={-1,3,4,6,6,-1};

        int k=4;
        int l=0,r=k;
        int sum=12;
        int maxsum=0;

        //int arr[]={-1,3,4,6,6,-1};

        while(r<arr.length){
            sum=sum-arr[l];
            l++;
            sum=sum+arr[r];
            maxsum=Math.max(sum,maxsum);
            r++;
        }

        System.out.println(maxsum);
    }
}
