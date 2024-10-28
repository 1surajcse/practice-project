package com.designpatterns.observer;/*
 * @author -Suraj Tiwari
 */

public class ForecastDisplay implements DisplayTemprature{

    private float humidity;
    private float temp;
    private float presure;
    private  WeatherData weatherData;

    public  ForecastDisplay(WeatherData weatherData) {
        this.weatherData=weatherData;
       weatherData.registerDisplay(this);

    }


    @Override
    public void update(float temp, float humidity, float presure) {
        this.humidity=humidity;
        this.temp=temp;
        this.presure=presure;
        display();
    }
    private void display() {
        System.out.println("Display in ForecastDisplay..."+temp+":"+humidity+presure);
    }

}
