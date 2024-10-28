package com.practice.check.asml.oops.inheritence;/*
 * @author -Suraj Tiwari
 */

public class BoxWeight extends Box{
    double weight;
     double l=20;

    public BoxWeight(double h, double w, double l,double weight) {
        super(h, w, l);
        System.out.println("inside c constructor");
        this.l=l;
        this.weight=weight;
    }
//    static  void greetings(){
//        System.out.println("inside boxweight");
//    }
    public BoxWeight(double weight) {
        super(10,1,10);

        this.weight=weight;
        System.out.println("inside c constructor");
    }
  public  BoxWeight(){

    }

    public void print(){
        System.out.println("printing c");
    }


}
