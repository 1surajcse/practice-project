package com.practice.check.asml.oops.polymorphism.overriding;/*
 * @author -Suraj Tiwari

 Polymorphism Means: More than one form or many ways to represent an Entity
 two type:
 1.Method overloading ie- Compile Time/Static/EarlyBinding

 Same Name but
 different type,order,no of parameter and return type

 2.Method Overriding ie- Runtime/Dynamic/lateBiding
 same name ,same parameter,same order and same return type


 Notes: In method overriding object is define which method to run and
 reference type define whether it has access or not for that method

 -We can not override static method but it can be inherited
 -we can not override final method

 Note:::polymorphsim does not apply to instance variable
 */

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PolymorphismDemo {
    public static void main(String[] args) {


        Function<String ,String> f= s->s.toLowerCase();
        System.out.println(f.apply("Sreu"));

        Consumer<String>c=(s)-> System.out.println(s);

        c.accept("Suraj");

        Supplier<String>s=()->"Tera";
        System.out.println(s.get());

        Predicate<Integer>p=k->(k>10)?false:true;

        System.out.println(p.test(3));
Shape  shape=new Shape();
shape.area();

Circle circle=new Circle();
circle.area();
Shape square=new Square();
square.area1();
    }
}
