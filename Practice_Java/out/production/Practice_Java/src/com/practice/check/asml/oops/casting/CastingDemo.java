package com.practice.check.asml.oops.casting;/*
 * @author -Suraj Tiwari
 */

public class CastingDemo {
    public static void main(String[] args) {
        float a=4.5f;
        double b= a;

        int c=4;
        float f=c;
        System.out.println(f);

        byte by=(byte)c;
        int bt=by;
        System.out.println(by);

        System.out.println(b);
    }
}
