package com.designpatterns.decorater.pizza;/*
 * @author -Suraj Tiwari
 */

public class PannerPizza extends PizzaDecorater{
    PannerPizza(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double price() {
        return super.price()+20;
    }
}
