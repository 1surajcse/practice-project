package com.designpatterns.strategy.flybehavior;/*
 * @author -Suraj Tiwari
 */

import com.designpatterns.strategy.Flyable;

public class FlyWithWings implements Flyable {
    @Override
    public void fly() {
        System.out.println("I am flying with wings");
    }
}
