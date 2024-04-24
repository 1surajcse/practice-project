package com.designpatterns.singleton;/*
 * @author -Suraj Tiwari
 */

public class Main {
    public static void main(String[] args) {
        SingletonLazy singleton= SingletonLazy.getInstance();
        SingletonLazy singleton1= SingletonLazy.getInstance();
        SingletonLazy singleton2= SingletonLazy.getInstance();
        System.out.println(singleton);
        System.out.println(singleton1);
        System.out.println(singleton2);



        SingletonEager singletonEager=SingletonEager.getInstance();
        System.out.println(singletonEager.check());

        //Tripleton
        Tripleton t1= Tripleton.getInstance();
        Tripleton t2= Tripleton.getInstance();
        Tripleton t3= Tripleton.getInstance();
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        Tripleton t4= Tripleton.getInstance();
        Tripleton t5= Tripleton.getInstance();
        System.out.println(t4);
        System.out.println(t5);

    }
}
