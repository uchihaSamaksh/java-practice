package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutoreFrameworkDemo {
    public static void main(String[] args){
        Long startTime = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 50; i++) {
            final int j = i;
            executor.submit(() -> {
                int result = factorial(j);
                System.out.println(Thread.currentThread().getName() + " is calculating factorial of " + j + " and the result is " + result);
            });
        }
        executor.shutdown();
        // while(!executor.isTerminated()){
        //     System.out.println("Waiting for all tasks to complete");
        // }
        try{
            executor.awaitTermination(1, TimeUnit.SECONDS);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("Time taken to calculate factorial of 10 numbers is " + (endTime - startTime) + " milliseconds");
    }


    private static int factorial(int i){
        // try{
        //     // Thread.sleep(1000);
        // }catch(InterruptedException e){
        //     e.printStackTrace();
        // }
        if(i == 0){
            return 1;
        }else{
            return i * factorial(i-1);
        }
    }
}
