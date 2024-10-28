package com.designpatterns.decorater.coffee;/*
 * @author -Suraj Tiwari
 */

public abstract class Beverage {

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    Size size;
    public abstract double cost();

    public abstract  String getDescription();


}
