package com.designpatterns.decorater.dress;/*
 * @author -Suraj Tiwari
 */

public class ProfessionalDress extends  DressDecorater{
    public ProfessionalDress(Dress d) {
        super(d);
    }

    @Override
    public void assemple() {
        super.assemple();
        System.out.println("Creating Professional Dress");
    }
}
