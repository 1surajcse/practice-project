package com.designpatterns.strategy.quackbehaviour;/*
 * @author -Suraj Tiwari
 */

import com.designpatterns.strategy.Quackable;

public class Quack implements Quackable {
    @Override
    public void quack() {
        System.out.println(" I can quack");
    }
}
