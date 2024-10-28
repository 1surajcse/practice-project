package com.designpatterns.singleton;
/*
 * @author -Suraj Tiwari
 */

public class SingletonEager {
    private  static SingletonEager instance=new SingletonEager();

    private SingletonEager(){

    }

    public static SingletonEager getInstance() {
        return instance;
    }
    public String check(){
        return "correct";
    }
}
