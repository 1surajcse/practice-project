package com.practice.check.asml;/*
 * @author -Suraj Tiwari
 */

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class JavaDate {

    public static void main(String[] args) {
        LocalDate localDate=LocalDate.now();
        System.out.println(localDate);

        LocalTime localTime=LocalTime.now();
        System.out.println(localTime.getMinute());

        LocalDateTime dateTime=LocalDateTime.now();
        System.out.println(dateTime.getDayOfMonth());

        //DateTimeFormater

        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("mm:HH:mm:ss| dd-yyyy-MM,E ");
        System.out.println(dateTime);
       String dateFormat=dateTime.format(formatter);
        System.out.println(dateFormat);

    }
}
