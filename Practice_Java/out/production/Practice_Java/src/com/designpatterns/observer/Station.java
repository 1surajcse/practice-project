package com.designpatterns.observer;/*
 * @author -Suraj Tiwari

 Station is nothing but Subject in terms on observerPattern
 */


import java.util.List;
//Subject
public interface Station {

     List<DisplayTemprature> registerDisplay(DisplayTemprature displayTemprature);
     List<DisplayTemprature>  removeDisplay(DisplayTemprature displayTemprature);
     void notifyAllDisplay();
}
