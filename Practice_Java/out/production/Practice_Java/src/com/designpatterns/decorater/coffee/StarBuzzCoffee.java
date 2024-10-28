package com.designpatterns.decorater.coffee;/*
 * @author -Suraj Tiwari

 Decorator pattern gives you the flexibility to add additional behavior at runtime
 */

public class StarBuzzCoffee {
    public static void main(String[] args) {

        Beverage filterCoffee=new FilterCoffee();
//        System.out.println(filterCoffee.getDescription());
//        System.out.println(filterCoffee.cost());
        filterCoffee.setSize(Size.BIG);

        WhipMilkDecorator  powderDecorator=new WhipMilkDecorator(new ChocoPowder(filterCoffee));
       powderDecorator=new WhipMilkDecorator(filterCoffee);
        System.out.println(powderDecorator.getDescription());
        System.out.println(powderDecorator.cost());
    }
}
