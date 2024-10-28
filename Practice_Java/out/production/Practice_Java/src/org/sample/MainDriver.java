package org.sample;/*
 * @author -Suraj Tiwari
 */


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainDriver {
    public static void main(String[] args) {





    }

    interface DI1{

        public default void display()

        {

            System.out.println("DI1");}

    }

    interface DI2 {

        public default void display(){

            System.out.println ("DI2");}

    }

    class DemoClass implements DI1,DI2{

        public void display(){

//I want to call display method of Interface DI1 & DI2

        }



    }




}

