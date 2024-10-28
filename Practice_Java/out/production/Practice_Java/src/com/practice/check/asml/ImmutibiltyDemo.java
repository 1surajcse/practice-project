package com.practice.check.asml;/*
 * @author -Suraj Tiwari
 */

import java.util.ArrayList;
import java.util.List;

/**
 * This Class is for creating Immutable class
 *
 * Notes: when ever you create a class as final ,implicitly it's all methods also become final
 */
public final class ImmutibiltyDemo {

    private final int age;



    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    /**
     *
     * @return
     */
    public List<String> getList() {
        List<String>temp=new ArrayList<>();
     for(String vale:list) {
         temp.add(vale);
     }
        return temp;
    }



    private final String name;
    private final List<String> list;

    /**
     *
     * @param age
     * @param name
     * @param list
     */
    public ImmutibiltyDemo(int age,String name,List<String>list){
        List<String>temp=new ArrayList<>();
        this.age=age;
        this.name=name;
        for(String vale:list) {
            temp.add(vale);
        }
       this.list=temp;
    }



}
