package com.designpatterns.decorater.dress;/*
 * @author -Suraj Tiwari
 */

public class ModernDress extends DressDecorater{
    public ModernDress(Dress d) {
        super(d);
    }

    @Override
    public void assemple() {
        super.assemple();
        System.out.println("creating modern dress");
    }
}
