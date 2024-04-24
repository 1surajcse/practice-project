package com.practice.check;/*
 * @author -Suraj Tiwari
 */

public class JavaReflection {
    public JavaReflection(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private int age;

    public  String simpleMethod(){
        return "Simple";
    }
    public  static String simpleStaticMethod(){
        return "Simple static";
    }
    private  String simplePrivateMethod(){
        return "Simple Private";
    }
}
