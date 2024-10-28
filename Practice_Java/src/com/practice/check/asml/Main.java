package com.practice.check.asml;/*
 * @author -Suraj Tiwari
 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {


   List<String>list=new ArrayList<>();
   list.add("ds");
   list.add("sd");




         ImmutibiltyDemo demo=new ImmutibiltyDemo(2,"rau",list);
         list.add("23");
         System.out.println(demo.getList());

//         ImmutibiltyDemo demo1=(ImmutibiltyDemo)demo.clone();
        // demo1.getList().add("2");

        // System.out.println(demo1.getList());




         JavaOuterClass.StaticInnerClass innerClass1=new JavaOuterClass.StaticInnerClass();
        System.out.println(innerClass1.z);
        JavaOuterClass javaOuterClass=new JavaOuterClass();
       // JavaOuterClass.InnerClass innerClass=javaOuterClass.new InnerClass();

       // System.out.println(javaOuterClass.name+ ": "+innerClass.z);
        JavaOverloading overloading=new JavaOverloading();

        overloading.getdetails("name");
        overloading.getdetails("name","age");



        /**
         * 57. Casting superclass object to subclass object? what will happen (down casting)
         * 58. Given a list of operations, how to retrieve a unique list of operations (set vs list )
         * 59. Given a list of operations and subclasses of operations, how to get all operations of a specific
         * type?
         * 60. Given a list of numbers how to get a list of non-repeating numbers greater than 100 (in one
         * line of code)
         * 61. Convert a list of type A to a list of type B using knowing that B is a subclass of A. and get the
         * result as a list&lt;A&gt; (in one line of code)
         */

          /* 60. Given a list of numbers how to get a list of non-repeating numbers greater than 100 (in one
                * line of code)*/

        List<Integer>integers=List.of(101,434,5,434,3334,4343,434,34343,43,3,43,4,101);




        TypeA a1=new TypeA("Ram","Sha","M");

        TypeA a2=new TypeA("R","k","b");

        TypeA a3=new TypeA("B","d","v");

        List<TypeA> aList=new ArrayList<>();
        aList.add(a1);      aList.add(a2);      aList.add(a3);
        TypeB b1=new TypeB("A");
        TypeB b2=new TypeB("A");
        TypeB b3=new TypeB("A");

        List<TypeB> bList=new ArrayList<>();
        bList.add(b1);        bList.add(b2);        bList.add(b3);



    }
}
