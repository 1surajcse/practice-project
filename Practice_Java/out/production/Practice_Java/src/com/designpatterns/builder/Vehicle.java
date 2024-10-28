package com.designpatterns.builder;

/*
 * @author -Suraj Tiwari
 *
 * To get a flexibility to construct object based on parameter we pass for ex
 * construtor(x,y,z) we want to only pass x,y then builder pattern comes into picture
 *
 *
 * How to create
 * we create a static nested class which contains all the parameter of outer class
 *
 * if a class name is vehicle then its builder would be VehicleBuilder
 *
 * builder class should have a public constructor will all the required param
 *
 * builderclass should have a method to set the optional parameter and will return the builder object
 * A build method that will return the final objects
 *
 * The main class Vehicle should have private constructor and will be only getter methods
 * so only it should be created from builder class.
 *
 *
 *
 * */

public class Vehicle {
    //Required Parameters
    private String engine;

    public String getEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public String getAirbags() {
        return airbags;
    }

    private int wheels;

    //optional Parmeters
    private String airbags;

    private Vehicle(VehicleBuilder vehicleBuilder){
        this.airbags=vehicleBuilder.airbags;
        this.wheels=vehicleBuilder.wheels;
        this.engine=vehicleBuilder.engine;
    }

    public static class VehicleBuilder{
        private String engine;
        private int wheels;
        public VehicleBuilder setAirbags(String airbags) {
            this.airbags = airbags;
            return this;
        }

        //Optional Parmeters
        private String airbags;

        //Constructor with required parameter
        public VehicleBuilder(String engine,int wheels){
            this.engine=engine;
            this.wheels=wheels;
        }

        public Vehicle build (){
            return new Vehicle(this);
        }

    }


}
