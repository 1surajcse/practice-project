package com.practice.check.asml.oops.overriding;/*
 * @author -Suraj Tiwari
 */

public class Cat extends Animal{

    @Override
    public void makeNoise() {
        System.out.println("cat noise");
    }

    public void catNoise(){
        System.out.println("Meaw");
    }
}
