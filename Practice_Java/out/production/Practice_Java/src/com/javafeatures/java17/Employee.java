package com.javafeatures.java17;/*
 * @author -Suraj Tiwari
 */

public record Employee(int id,int age, String name,double salary) {
//compact construtor

    public Employee
    {
        if (id < 100) {
            throw new IllegalArgumentException(
                    "Employee Id cannot be below 100.");
        }
        if (name.length() < 2) {
            throw new IllegalArgumentException(
                    "First name must be 2 characters or more.");
        }
    }
    public Employee(int id,int age,String name){
      this(id,age,name,0);
    }
}
