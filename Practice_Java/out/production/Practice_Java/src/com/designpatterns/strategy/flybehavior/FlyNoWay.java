package com.designpatterns.strategy.flybehavior;/*
 * @author -Suraj Tiwari
 */

import com.designpatterns.strategy.Flyable;

public class FlyNoWay implements Flyable {
    @Override
    public void fly() {
        System.out.println("I cant fly");
    }
}
