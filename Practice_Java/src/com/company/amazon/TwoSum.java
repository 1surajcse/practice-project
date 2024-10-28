package com.company.amazon;/*
 * @author -Suraj Tiwari
 */

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// Example:
// Given nums = [2, 7, 11, 15], target = 9,

import java.util.*;
import java.util.stream.Collectors;

// Because nums[0] + nums[1] = 2 + 7 = 9,
// return [0, 1].
public class TwoSum {
    public static void main(String[] args) {
      int   nums []= {2, 7, 11, 15};
    List<Integer> ls=  Arrays.stream(nums).boxed().collect(Collectors.toList());
      Map<Integer,Integer> result=new HashMap<>();
      int target=17;

        List<Integer> lists=new ArrayList<>();

        for (int i = 0; i <nums.length ; i++) {
            int diff=target-nums[i];
            if(result.containsKey(diff)){
                lists.add(result.get(diff));
                lists.add(i );

                break;
            }
            else{
                result.put(nums[i],i);
            }

        }
        System.out.println(lists);


    }
}
