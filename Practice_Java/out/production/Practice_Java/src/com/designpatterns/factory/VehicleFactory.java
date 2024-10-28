package com.designpatterns.factory;/*
 * @author -Suraj Tiwari
 */

public class VehicleFactory {

    public static Vehicle getInstance(String type) {
        if (type.equals("car")) {
            return new Car();
        } else if (type.equals("bike")) {
            return new Bike();
        }
        return null;
    }
}
