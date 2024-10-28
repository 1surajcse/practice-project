package com.practice.check.asml.collections;/*
 * @author -Suraj Tiwari
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Use an ArrayList for storing and accessing data, and LinkedList to manipulate data
 */
public class ListDemo {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(13);
        list.add(114);
        List<Integer> list1 =list.subList(2,4);
        System.out.println(list1);
        System.out.println(list.stream().reduce(0,(a,b)->a+b));

        LinkedList<Integer> linklist=new LinkedList<>();
        linklist.add(10);
        linklist.add(11);

        linklist.addFirst(30);
        linklist.addLast(40);
        System.out.println(linklist.getFirst());



    }
}
