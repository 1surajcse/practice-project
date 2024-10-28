package com.designpatterns.decorater.coffee;/*
 * @author -Suraj Tiwari
 */

public class FilterCoffee extends  Beverage{

    String description="Filter Coffee";
    @Override
    public double cost() {
        Size size1=super.getSize();
        if (size1.name().equals("MEDIUM")){
            return 20.0;
        }
        if (size1.name().equals("BIG")){
            return 25;
        }
        else return 10;

    }

    @Override
    public String getDescription() {
        return description+"-"+getSize();
    }
}
