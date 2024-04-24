package com.designpatterns.prototype;
/*
 * @author -Suraj Tiwari
 *
 * We need prototype design pattern when we need to create the duplicate of an object and then
 * we want to add certain functionality
 *
 * implementation:
 *
 * we need to implements the cloneable interface
 *
 * we need to have the deep copy of objects
 *
 */

import java.util.ArrayList;
import java.util.List;

public class PrototypeDesign implements Cloneable{

    public List<String> getCars() {
        return this.cars;
    }

    public void setCars(List<String> cars) {
        this.cars = cars;
    }

    private List<String>cars;
    public PrototypeDesign(){
       this.cars=new ArrayList<>();

    }
    public PrototypeDesign(List<String>list){
        this.cars=list;

    }
    public void insertCars(){
        this.cars.add("Honda");
        this.cars.add("i10");
        this.cars.add("BMW");
        this.cars.add("Ferrari");


    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<String> temp=new ArrayList<String>();

        for (String car:this.cars){
            temp.add(car);
        }

        return   new PrototypeDesign(temp);
    }
}
