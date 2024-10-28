package com.designpatterns.strategy.quackbehaviour;/*
 * @author -Suraj Tiwari
 */

import com.designpatterns.strategy.Quackable;

public class MuteQuack implements Quackable {
    @Override
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
