package com.designpatterns.observer;/*
 * @author -Suraj Tiwari
 */

import java.util.ArrayList;
import java.util.List;
//This is concrete class which Implements Subject
public class WeatherData  implements  Station{
    private float humidity;
    private float presure;
    //List of Observers
    private List<DisplayTemprature>displayTempratures;

    public WeatherData() {
        displayTempratures=new ArrayList<>();
    }

    private float temp;

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {

        this.humidity = humidity;

    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public float getPresure() {
        return presure;
    }

    public void setPresure(float presure) {
        this.presure = presure;
    }


    @Override
    public List<DisplayTemprature> registerDisplay(DisplayTemprature displayTemprature) {
        displayTempratures.add(displayTemprature);
        return displayTempratures;
    }

    @Override
    public List<DisplayTemprature> removeDisplay(DisplayTemprature displayTemprature) {
      displayTempratures.remove(displayTemprature);
        return displayTempratures;
    }



    @Override
    public void notifyAllDisplay() {
        System.out.println("Inside ...notify all");
        for (DisplayTemprature temprature:displayTempratures){
            temprature.update(temp,humidity,presure);
        }

    }

    public void setChanges(float temp, float humidity, float presure) {
        this.humidity=humidity;
        this.presure=presure;
        this.temp=temp;
        notifyAllDisplay();

    }
}
