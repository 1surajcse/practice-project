package com.designpatterns.observer;/*
 * @author -Suraj Tiwari
 */

public class StatisticsDisplay implements  DisplayTemprature{
  private  float temp;
  private float presure;
  private float humidity;
  private WeatherData weatherData;


    public  StatisticsDisplay(WeatherData weatherData) {
        this.weatherData=weatherData;
        weatherData.registerDisplay(this);

    }

    @Override
    public void update(float temp, float humidity, float presure) {
        this.humidity=humidity;
        this.presure=presure;
        this.temp=temp;
        display();
    }
    private void display() {
        System.out.println("Display in StatisticsDisplay..."+temp+":"+humidity+presure);
    }
}
