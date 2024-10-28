package com.designpatterns.decorater.pizza;/*
 * @author -Suraj Tiwari
 */

public class VegParadise extends  PizzaDecorater{
    VegParadise(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double price() {
        return super.price()+30;
    }
}
