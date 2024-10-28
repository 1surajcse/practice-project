package com.company.forescout;/*
 * @author -Suraj Tiwari
 */

import java.util.concurrent.Callable;

public class DoPing implements Callable<String>{
    private final String ipToPing;

    public DoPing(String ipToPing) {
        this.ipToPing = ipToPing;
    }

    public String call() throws Exception {
      return "first";
    }
}
