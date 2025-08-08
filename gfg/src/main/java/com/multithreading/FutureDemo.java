package main.java.com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutionException;

public class FutureDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        Future<Integer> future = executor.submit(() -> {
            return 10;
        });
        try {
            System.out.println(future.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        // method
        System.out.println(future.isCancelled());
        System.out.println(future.isDone());
        try {
            System.out.println(future.get()); 
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        future.cancel(true);
        
        executor.shutdown();
    }
}
