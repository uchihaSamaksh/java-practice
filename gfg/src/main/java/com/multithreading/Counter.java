package com.multithreading;

public class Counter {
    private int count = 0;

    // public  void increment(){
    //     count++;
    // }
    public synchronized void increment(){
        count++;
    }

    //synchronized block
    // public void increment(){
    //     synchronized(this){
    //         count++;
    //     }
    // }

    public  void decrement(){
        count--;
    }

    public int getCount(){
        return count;
    }
    
}
