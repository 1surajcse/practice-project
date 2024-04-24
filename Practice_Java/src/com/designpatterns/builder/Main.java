package com.designpatterns.builder;/*
 * @author -Suraj Tiwari
 */

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle.VehicleBuilder("Car",4).setAirbags("AirBag").build();
        Vehicle bike=new Vehicle.VehicleBuilder("Bike",2).build();
        System.out.println(vehicle.getWheels());
        System.out.println(bike.getWheels());



        Animal dog= new Animal.AnimalBuilder("Dog",4).setPet(true).setFood("Non-veg").build();
        Animal lion=new Animal.AnimalBuilder("Lion",4).setPet(false).build();
        System.out.println(dog.getFood());
        System.out.println(lion.getFood());
    }
}
