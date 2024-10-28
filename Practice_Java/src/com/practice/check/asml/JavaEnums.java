package com.practice.check.asml;/*
 * @author -Suraj Tiwari

 Enums are special classes that is used for constant value which are not modifiable

 the diffrence between enums and class that enum can not create objects
 */

public class JavaEnums {
    enum Days {
        MON,TUE,WED,THUR,FRI
    }
    public static void main(String[] args) {
        Days days=Days.FRI;
        System.out.println(days.ordinal());
        //we can loop through

        for (Days days1:Days.values()){
            System.out.println(days1);
        }
    }
}
