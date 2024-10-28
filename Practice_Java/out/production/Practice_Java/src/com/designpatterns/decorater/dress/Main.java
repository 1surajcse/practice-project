package com.designpatterns.decorater.dress;
/*
 * @author -Suraj Tiwari
 * 1. Create interface or abstractClass for common method
 * 2.Create basicObject class and implemts the interface
 * 3.create the decorator class which will have interface refrence
 *
 * Decorator implements interface{
 * Dress dress;
 * public Decorator(Dress dress){
 * this.dress=dress;
 * public method(){
 * this.dress.assemple();
 * }
 * }
 * }
 *
 *
 *

 */


public class Main {
    public static void main(String[] args) {

        BasicDress b=new BasicDress();
       // b.assemple();

        ModernDress dress=new ModernDress(new ProfessionalDress(new BasicDress()));
        dress.assemple();
    }
}
