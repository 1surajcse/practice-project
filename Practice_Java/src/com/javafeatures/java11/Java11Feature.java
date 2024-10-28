package com.javafeatures.java11;/*
 * @author -Suraj Tiwari
 */

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java11Feature {

    public static void main(String[] args) throws IOException, InterruptedException {
        //a. new String methods
       // isBlank(): Checks if a string is empty or contains only white space characters.

        String s="Ram:R";
        System.out.println(s.isEmpty()+"::"+s.isBlank());
        System.out.println();

        String text = "   Java 11   ";

        String stripped = text.strip(); // "Java 11"
        System.out.println(stripped);
        //StripLeading
        String leadingStripped = text.stripLeading(); // "Java 11   "
        System.out.println(leadingStripped);
        //stripTrailing
        String trailingStripped = text.stripTrailing(); // "   Java 11
        System.out.println(trailingStripped);
        String multilineString = "Baeldung helps \n \n developers \n explore Java.";

       List<String> list= multilineString.lines().
               filter(line->!line.isBlank())
               .map(String::strip)
               .collect(Collectors.toList());
        System.out.println(list);


        //3.2. New File Methods
       // We can use the new readString and writeString static methods from the Files class:

        Path p=Files.writeString(Files.createTempFile("demo",".txt"),"sample text");
        System.out.println(Files.readString(p));

        //  3.3. Collection to an Array

       List<String>arr =Arrays.asList("Java", "Kotlin");
        List<Character>arr1 =Arrays.asList('J', 'K');

        String[] ar = arr.toArray(String[]::new);

        System.out.println(Arrays.toString(ar));

        //4.3. A No-Op Garbage Collector
       // A no-op garbage collector to test the performance of applications.

//new HTTPClient

        //create a HTTPClient
        HttpClient httpClient = HttpClient.newHttpClient();


        //Create HTTpRequest

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.sampleapis.com/coffee/hot"))
                .GET()
                .build();

        //Get HTTP response

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.statusCode());
        System.out.println(response.body());

        //Epsilon garbage collector
        /**
         * This is also called no-ops garbage collector which is used test perforamce of aan application
         */


    }
}
