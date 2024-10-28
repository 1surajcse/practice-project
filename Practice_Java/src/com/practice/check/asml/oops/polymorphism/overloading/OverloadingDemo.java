package com.practice.check.asml.oops.polymorphism.overloading;/*
 * @author -Suraj Tiwari
 */

public class OverloadingDemo {

//    int sum(int a, int b){
//        System.out.println("1.");
//        return a+b;
//    }

//    Integer sum(Integer a, Integer b){
//        System.out.println("2:"+(a+b));
//        return a+b;
//    }

//    String sum(String a,String b){
//        System.out.println("string");
//        return a+b;
//    }
    Number sum(Float a,Float b){
        System.out.println("object");
        return a+b;
    }
    Number sum(long a,Float b){
        System.out.println("long");
        return a+b;
    }


    public static void main(String[] args) {

        System.out.println(2+3+":"+2+3);

        OverloadingDemo demo=new OverloadingDemo();
        Integer a=4;
        Integer b=5;
     //   System.out.println( demo.sum(new String("a"),new String("v")));
        //demo.sum(new Float(3),new Float(3));

    }
}
