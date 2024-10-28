package com.designpatterns.factory;/*
 * @author -Suraj Tiwari
 */

public class Main {
    public static void main(String[] args) {



        Vehicle bikeObj=VehicleFactory.getInstance("car");
        bikeObj.type();

    }
}
