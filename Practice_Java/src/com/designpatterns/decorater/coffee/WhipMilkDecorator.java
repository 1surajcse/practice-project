package com.designpatterns.decorater.coffee;/*
 * @author -Suraj Tiwari
 */

public class WhipMilkDecorator extends CondimentsDecorator{
    Beverage beverage;
    public WhipMilkDecorator(Beverage beverage) {
        this.beverage=beverage;
    }

    @Override
    public double cost() {
        return this.beverage.cost()+20;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription()+","+"Whip Milk";
    }
}
