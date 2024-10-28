package com.practice.check.asml.oops.overriding;/*
 * @author -Suraj Tiwari
 */

public final class Dog extends Animal{
    @Override
    public void makeNoise() {
        System.out.println("dog..");
    }
    public void dogNoise(){
        System.out.println("Bhaw Bhaw..");
    }
}
