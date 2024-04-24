package com.designpatterns.singleton;/*
 * @author -Suraj Tiwari
 */

public class Tripleton {
    private static Tripleton instance;
    public static  int count;
    private Tripleton(){

    }

    public static Tripleton getInstance(){

        if (count<3 ){
            System.out.println(count+": time");
            instance= new Tripleton();
            count++;
        }
        return instance;
    }

    public String getData(){
        return "Hi There";
    }

}
