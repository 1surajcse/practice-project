package com.javafeatures.java17.patternmatchinginstanceof;/*
 * @author -Suraj Tiwari
 */

public class Driver {

    public static void main(String[] args) {
     afterJava17(9);
    }

    public static void beforeJava17(Object o){

        if(o instanceof  String){
            String s=(String)o;
            System.out.println("String obj: "+s);
        }
        else if(o instanceof  Integer){
                Integer i=(Integer) o;
                System.out.println("Integer obj: "+i);
            }
        else {
            System.out.println("Default value");
        }
        }

    /**
     * using instanceOf pattern matching we dont have to cast and assign the object
     * @param o
     */
    public static void afterJava17(Object o){

        if(o instanceof  String s){
            System.out.println("String obj: "+s);
        }
        else if(o instanceof  Integer i){
            System.out.println("Integer obj: "+i);
        }
        else {
            System.out.println("Default value");
        }
    }
}
