package com.designpatterns.singleton;/*
 * @author -Suraj Tiwari
 */

public class SingletonLazy {
    private static SingletonLazy instance;
    private SingletonLazy(){
    }

    public static SingletonLazy getInstance(){

        if (instance==null ){
            instance= new SingletonLazy();

        }
        return instance;
    }

    public String getData(){
        return "Hi There";
    }

}
