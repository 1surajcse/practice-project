package com.designpatterns.decorater.pizza;/*
 * @author -Suraj Tiwari
 */

public class PizzaDecorater implements Pizza{

    protected Pizza pizza;
     PizzaDecorater(Pizza pizza){
       this.pizza=pizza;
   }
    @Override
    public double price() {
        return pizza.price();
    }
}
