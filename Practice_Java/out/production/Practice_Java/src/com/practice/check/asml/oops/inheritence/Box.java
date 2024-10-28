package com.practice.check.asml.oops.inheritence;/*
 * @author -Suraj Tiwari
 */

public class Box {

    double h=-1;
    double w=-1;
    double l=-1;

    public Box(double h, double w, double l) {
        System.out.println("inside p constructor");
        this.h = h;
        this.w = w;
        this.l = l;
    }
    static  void greetings(){
        System.out.println("inside box");
    }

    public Box(Box b) {
        System.out.println("inside p constructor");
        this.h = b.h;
        this.w = b.w;
        this.l = b.l;
    }

    public Box(){

    }

    public void print(){
        System.out.println("printing p");
    }


}
