package com.designpatterns.decorater.pizza;/*
 * @author -Suraj Tiwari
 */

public class MageritaPizza implements Pizza{
    double price=10;


    @Override
    public double price() {
        return price;
    }
}
