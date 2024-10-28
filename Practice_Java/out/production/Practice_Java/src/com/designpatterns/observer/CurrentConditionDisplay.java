package com.designpatterns.observer;/*
 * @author -Suraj Tiwari
 */



public class CurrentConditionDisplay implements DisplayTemprature{
    private float humidity;
    private float temp;
    private  WeatherData weatherData;





    public  CurrentConditionDisplay(WeatherData weatherData) {

        this.weatherData=weatherData;
        weatherData.registerDisplay(this);

    }


    @Override
    public void update(float temp,float humidity,float presure) {
        this.temp=temp;
        this.humidity=humidity;
        display();
    }
    private void display() {
        System.out.println("Display in CurrentConditionDisplay..."+temp+":"+humidity);
    }

}
