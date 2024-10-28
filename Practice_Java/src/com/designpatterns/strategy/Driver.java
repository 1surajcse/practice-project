package com.designpatterns.strategy;/*
 * @author -Suraj Tiwari

 The strategy Pattern define the family of algorithms,encapsulate each one and makes them
 interchangeable

 strategy lets you change the algorithm based on client needs
 */

import com.designpatterns.strategy.flybehavior.FlyNoWay;
import com.designpatterns.strategy.flybehavior.FlyWithWings;
import com.designpatterns.strategy.quackbehaviour.MuteQuack;
import com.designpatterns.strategy.quackbehaviour.Quack;

public class Driver {

    public static void main(String[] args) {
Duck d=new ModelDuck();
d.display();
d.setFlyable(new FlyWithWings());
d.fly();
d.setFlyable(new FlyNoWay());
        d.setQuackable(new Quack());
        d.quack();

    }
}
