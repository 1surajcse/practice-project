package com.designpatterns.observer;
/*
 * @author -Suraj Tiwari
 */



public class WeatherStation {
    public static void main(String[] args) {
        //Creating Topic/Subject which has the data

         WeatherData weatherData=new WeatherData();
         //Now creating the Observers which required the data  which internally registering it to the Subject
        CurrentConditionDisplay currentConditionDisplay=new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay=new StatisticsDisplay(weatherData);

        weatherData.setChanges(45,66,555);



    }
}
