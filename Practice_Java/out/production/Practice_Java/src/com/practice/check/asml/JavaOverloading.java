package com.practice.check.asml;/*
 * @author -Suraj Tiwari
 */

public class JavaOverloading {

    private String name;
    private String age;


    public String getdetails(String name) {
        System.out.println("Inside 1");
        return name;
    }

    protected String getdetails(String name, String age) {
        System.out.println("Inside 2");
        return name + age;

    }
}
