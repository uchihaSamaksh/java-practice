package main.java.com.multithreading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureDemo {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(10);
        
        //supplyAsync is used to run a task asynchronously and return a result
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            return 10;
        }, executor);

        try {
            System.out.println(future.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        // executor.shutdown();

        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> {
            return 20;
        }, executor).thenApply(result -> {
            return result*2;
        });

        try{
            System.out.println(future2.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        // executor.shutdown();

        CompletableFuture<Integer> future3 = CompletableFuture.supplyAsync(() -> {
            return 30;
        }, executor).thenApplyAsync( (result) -> {return result * 3;});

        try{
            System.out.println(future3.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        CompletableFuture<Integer> future4 = CompletableFuture.supplyAsync(() -> {
            return 40;
        }, executor).thenCombine(future3, (result1, result2) -> {
            return result1 + result2;
        });

        try{
            System.out.println(future4.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

       
        
        
        
        
        executor.shutdown();
    }
}
