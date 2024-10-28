package com.designpatterns.decorater.coffee;/*
 * @author -Suraj Tiwari
 */

public class ChocoPowder extends CondimentsDecorator{
    Beverage beverage;
    public ChocoPowder(Beverage beverage) {
        this.beverage=beverage;
    }

    @Override
    public double cost() {
        return this.beverage.cost()+20;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription()+","+"Choco Powder";
    }
}
