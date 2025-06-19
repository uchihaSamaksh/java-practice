package com.multithreading;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {
    
    private static ReentrantLock lock = new ReentrantLock();
    public static void main(String[] args) {
        
        OuterMethod();
    }

    public static void OuterMethod(){
        lock.lock();
        System.out.println("OuterMethod locked");
        InnerMethod();
        lock.unlock();
        System.out.println("OuterMethod unlocked");
    }

    public static void InnerMethod(){
        lock.lock();
        System.out.println("InnerMethod locked");
        lock.unlock();
        System.out.println("InnerMethod unlocked");
    }
}
