package com.restapp.practice;/*
 * @author -Suraj Tiwari
 */

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Manager {
    public static void main(String[] args) {

        int arr[][]={{1,2,3},//0,n-1
                {4,5,6},//1,n-2
                {9,8,9}//2,n-3
        };
        int diff=diagonalDifference(arr);

        int nums2 []= {1,1,0,-1,-1};//4,3,3,2,2,1

        int cPos=0;
        int cNeg=0;
        int cZero=0;
        for (int i = 0; i < nums2.length; i++) {
            if(Integer.signum(nums2[i])==1){
                cPos++;
            }
            else if(Integer.signum(nums2[i])==0){
                cZero++;
            }
            else{
                cNeg++;
            }



        }
        float ff=cPos/(float)nums2.length;
        System.out.println(ff);

        System.out.printf("%6f %n",ff);


        int nums []= {12,28,83,4,25,26,25,2,25,25,25,12};//4,3,3,2,2,1

        List<Integer> list=Arrays.stream(nums).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(list);
        int min=minimumSubArray(213,list);
        int max=longestConsecutive(nums);
        System.out.println(min);
        String []strs = {"flower","flower","flower","flower"};
       // int min=Arrays.stream(strs).min(Comparator.comparing(String::length)).get().length();
       // System.out.println(min);
        int length=strs.length-1;
        int commonLength=0;
        for (int i = 0; i < min-1; i++) {
            String matching=strs[0].substring(0,i+1);
            System.out.println(matching);
            long check=Arrays.stream(strs).filter(s->s.startsWith(matching)).count();
            System.out.println(check);
            if(check==strs.length){
                commonLength++;
            }
            else {
               break;
            }
        }
        System.out.println("Matching:  "+strs[0].substring(0,commonLength));
    }
////4,3,3,2,2,1
    private static int minimumSubArray(int target,List<Integer> list) {
        if(list.isEmpty()){
            return 0;
        }
        int count=0;
        int sum=0;
        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i)>target){
                continue;
            }
            if(list.get(i)==target){
                return 1;
            }
//            if((list.get(i)+list.get(i+1))==target){
//                return 2;
//            }
            if((sum + list.get(i))<=target) {
                sum = sum + list.get(i);
                count++;
            }

            if((list.subList(i+1,list.size())).contains(target-sum)){
                return count+1;
            }
            if(sum>=target){
                return count;
            }
        }
        return 0;
    }

    public static int longestConsecutive(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int count = 1;
        int max = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if ((nums[i + 1] - nums[i]) == 0) {
                continue;
            }
            if ((nums[i + 1] - nums[i]) == 1) {
                count++;
                if (nums[nums.length - 1] - nums[nums.length - 2] == 1 && (i + 1) == nums.length - 2) {
                    max = max + 1;
                }
                if (count >= max) {
                    max = count;
                }
            } else {
                count = 1;
            }
        }

        return max;
    }

    public static int diagonalDifference( int arr[][]) {
        // Write your code here

        int dia1 = 0;
        int dia2 = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                int p = arr.length - j - 1;
                if (i == j) {
                   // System.out.println(arr[i][j]);
                    dia1 = dia1 + arr[i][j];
                }
                if (i ==arr.length- p-1) {
                    System.out.println(arr[i][p]);
                    dia2 = dia2 + arr[i][p];
                }

                }

            }
            System.out.println(dia1 + ":" + dia2);
            return Math.abs(dia1 - dia2);
        }

}
