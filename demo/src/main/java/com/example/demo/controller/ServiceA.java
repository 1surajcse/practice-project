package com.example.demo.controller;/*
 * @author -Suraj Tiwari
 */

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.Executors;

@RestController
public class ServiceA {

    @Autowired
    private RestTemplate restTemplate;

    private static final String ServiceA="serviceA";

    @GetMapping("hello")
    @CircuitBreaker(name=ServiceA ,fallbackMethod = "callServiceBFallBack")
    public String serviceA(){
        return restTemplate.getForObject("http://localhost:8082/package/api/v1/service-b",String.class);
    }

    public  String callServiceBFallBack(Exception e){

        return "Service B is Taking time longer than usual";
    }


}
