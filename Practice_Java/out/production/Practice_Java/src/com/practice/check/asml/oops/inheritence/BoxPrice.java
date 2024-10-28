package com.practice.check.asml.oops.inheritence;/*
 * @author -Suraj Tiwari
 */

public class BoxPrice extends BoxWeight{
    public BoxPrice(double h, double w, double l, double weight) {
        super(h, w, l, weight);
        System.out.println("inside cc constructor");
    }
    public BoxPrice(){
        super.l=-5;
    }
    public BoxPrice(double weight) {
        super(weight);
        System.out.println("inside cc constructor");
    }

    @Override
    public void print() {
        if(weight>10) {
            System.out.println("High price");
        }else {
            System.out.println("Low Price");
        }
    }
}
