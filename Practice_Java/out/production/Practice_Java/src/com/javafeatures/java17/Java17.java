package com.javafeatures.java17;/*
 * @author -Suraj Tiwari
 */

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java17 {

    public static void main(String[] args) {

        List<Integer>list=new ArrayList<>();

        int arr[]={13,4,5,5,6,6,3,};
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    list.add(arr[i]);
                }
            }
        }

        int ar[]=new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ar[i]=list.get(i);
        }

        System.out.println(Arrays.toString(ar)); ;

        Employee employee=new Employee(111,33,"Suraj",34344);
        System.out.println(employee.salary());
        Employee employee1=new Employee(1121,3,"sd");
        System.out.println(employee1);

        Fruits fruits=new Banana();
        fruits.display();

       // Text Blocks

        String text= """
                "Hi"
                "How "
                "Are You"
                """;
        System.out.println(text);

        String a="Hello".toLowerCase();
        String b="hello".toLowerCase();

      //  Map<Character,Long> m1= a.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        //Map<Character,Long> m2= b.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        Map<Character,Long> m1=getMap(a);
        Map<Character,Long> m2=getMap(b);
        System.out.println(m1);
        System.out.println(m2);
        if(m1.equals(m2)){
            System.out.println("Anagram");
        }
        else
            System.out.println(" not Anagram");


    }

    public static Map<Character,Long> getMap(String a){

        Map<Character,Long>map=new HashMap<Character,Long>();

        Long count=1l;
        for (int i = 0; i < a.length();i++){
            System.out.println(a.charAt(i));
            if(map.containsKey(a.charAt(i))){
                System.out.println("inside if:"+count);
                count++;
                map.put(a.charAt(i),count);
                System.out.println(map);

            }
            else{
                System.out.println("inside else: "+count);
                count=1l;
                map.put(a.charAt(i),count);
                System.out.println(map);
            }
        }
        return map;
    }





}
