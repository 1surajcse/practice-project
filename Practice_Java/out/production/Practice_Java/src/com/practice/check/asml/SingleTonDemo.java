package com.practice.check.asml;/*
 * @author -Suraj Tiwari
 */

public class SingleTonDemo {
    private  static  SingleTonDemo instance;
    private SingleTonDemo(){
    }

    public static synchronized SingleTonDemo getInstance(){
        if(instance==null){
            instance=new SingleTonDemo();
        }
        return instance;
    }

}
