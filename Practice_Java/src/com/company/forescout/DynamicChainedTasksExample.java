package com.company.forescout;/*
 * @author -Suraj Tiwari
 */

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DynamicChainedTasksExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        Callable<List<String>> task1 = () -> {
            List<String> result = new ArrayList<>();
            // Simulate processing
            result.add("Task1 Result");
            return result;
        };

        Callable<List<String>> task2 = () -> {
            DoPing doPing=new DoPing("imp");
            String rs=doPing.call();
            List<String> result = new ArrayList<>(  );
            // Simulate processing
            result.add("Task2 Result");
            return result;
        };

        try {
            Future<List<String>> future1 = executor.submit(task1);
            List<String> currentResult = future1.get(); // Wait for task1 to complete
            int iterations = 5; // Number of times to perform the operation

            for (int i = 0; i < iterations; i++) {
                Callable<List<String>> nextTask = () -> task2.call();
                Future<List<String>> futureNext = executor.submit(nextTask);
                currentResult = futureNext.get(); // Wait for the next task to complete
            }

            System.out.println("Final Result: " + currentResult);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }
}

