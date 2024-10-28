package com.designpatterns.strategy;/*
 * @author -Suraj Tiwari
 */

public abstract class Duck {

    public void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }

    public void setQuackable(Quackable quackable) {
        this.quackable = quackable;
    }

    private  Flyable  flyable;
   private Quackable quackable;

   public void fly(){
       flyable.fly();
   }

    public void quack(){
        quackable.quack();
    }

    public abstract void display();
    public void swim(){
        System.out.println(" Duck can swim");
    }


}
