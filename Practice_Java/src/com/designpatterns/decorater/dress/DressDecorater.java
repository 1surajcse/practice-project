package com.designpatterns.decorater.dress;/*
 * @author -Suraj Tiwari
 */

public class DressDecorater implements Dress{
    protected Dress dress;

    public DressDecorater(Dress d){
        this.dress=d;
    }

    @Override
    public void assemple() {
        this.dress.assemple();
    }
}
