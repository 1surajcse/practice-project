package com.designpatterns.prototype;/*
 * @author -Suraj Tiwari
 */

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        PrototypeDesign a=new PrototypeDesign();
        a.insertCars();
        System.out.println(a.getCars());
        PrototypeDesign b= (PrototypeDesign) a.clone();
        b.getCars().add("Santro");
        System.out.println(b.getCars());
        System.out.println(a.getCars());
    }
}
