package com.practice.check.asml;/*
 * @author -Suraj Tiwari

 The idea behind the inner class to group the classes which are belongs to each other

 we can also create static inner class so that we can create the inner class
 without creating the object of outer class.
 */

public class JavaOuterClass {
public String name="Inita";
   private int x=5;
   private class InnerClass{
        int y=4;
        int z=x;
    }
    static class StaticInnerClass{
       int z=8;
    }

    public static void main(String[] args) {
        JavaOuterClass javaOuterClass=new JavaOuterClass();
        JavaOuterClass.InnerClass innerClass=javaOuterClass.new InnerClass();
        System.out.println(innerClass.y);
        //Creating inner class without creating outer class java object

        StaticInnerClass innerClass1=new StaticInnerClass();
        System.out.println(innerClass1.z);



    }


}
