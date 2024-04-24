package com.sample.dto;/*
 * @author -Suraj Tiwari
 */

import java.util.ArrayList;
import java.util.List;

final public class ImmutableClassSample {

    public int getAge() {
        return age;
    }

    public List<Integer> getList() {
        return (List<Integer>) new ArrayList<>(list).clone();
    }

    private final int age;
     private final List<Integer>list;

     public ImmutableClassSample(int age, List<Integer> list){
         List<Integer>temp=new ArrayList<>();
         for (Integer i:list) {
            temp.add(i);
         }
         this.age = age;
         this.list = temp;
     }
}
