package com.practice.check.asml.oops.inheritence;/*
 * @author -Suraj Tiwari
 */
//You can only access those method ,attribute which are available in reference type for the respective object
public class InheritenceDemo {
    private int a=10;
    public static void main(String[] args) {
        InheritenceDemo demo=new InheritenceDemo();
//        System.out.println(demo.a);
//        Box box=new Box(3,4,45);
//        System.out.println(box.l);
//        box.print();
//        Box box1=new BoxWeight(6);
//        System.out.println(((BoxWeight)box1).l);
//        box1.print();
//        BoxWeight weight=new BoxWeight(5);
//        System.out.println(weight.l);

        BoxPrice boxPrice=new BoxPrice(4,5,5,25);
        BoxPrice boxPrice1=new BoxPrice();

        BoxWeight  b=new BoxWeight();
        System.out.println(((Box)b).l);
     System.out.println(boxPrice1.l);
//        System.out.println(boxPrice1.h);
        boxPrice.print();
        b.greetings();


    }
}
