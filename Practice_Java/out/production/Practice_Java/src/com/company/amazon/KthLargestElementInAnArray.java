package com.company.amazon;/*
 * @author -Suraj Tiwari
 */

// Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.

// For example,
// Given [3,2,1,5,6,4] and k = 2, return 5.

// Note:
// You may assume k is always valid, 1 ≤ k ≤ array's length.

import java.util.Arrays;

import java.util.Comparator;

import java.util.stream.Collectors;

public class KthLargestElementInAnArray {
    public static void main(String[] args) {
int arr [] ={3,24,115,5,6,4};
         int k=5;
        int result=Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).get(k-1);
        System.out.println(result);

    }
}
