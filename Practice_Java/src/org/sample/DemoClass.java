package org.sample;/*
 * @author -Suraj Tiwari
 */

interface DI1 {

    public default void display() {

        System.out.println("DI1");
    }


public  void sjho();
}

interface DI2 {

    public default void display(){

        System.out.println ("DI2");}
    public  void sjho();

}

class DemoClass implements DI1,DI2 {

//    public void display() {
//
////I want to call display method of Interface DI1 & DI2
//        DI2.super.display();
//        DI1.super.display();
//
//
//    }

//    @Override
//    public void display() {
//        DI1.super.display();
//    }

    @Override
    public void display() {
        DI1.super.display();
    }

    @Override
    public void sjho() {

    }

    public static void main(String[] args) {

        DemoClass obj = new DemoClass();
        obj.display();
    }
}