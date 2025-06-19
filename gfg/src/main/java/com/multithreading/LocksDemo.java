package com.multithreading;

import java.lang.annotation.Retention;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;



public class LocksDemo {
    // private int amount = 0;
    private int balance = 1000;
    
    public int getBalance() {
        return balance;
    }
    
    private Lock lock = new ReentrantLock();

    
    public void withdraw(int amount) {
    // public synchronized void withdraw(int amount) {
        try {
            if(lock.tryLock(1000, TimeUnit .MILLISECONDS)) {
                try{
                    if(balance >= amount) {
                        try{
                        Thread.sleep(3000);
                        } catch(InterruptedException e) {}
                        balance -= amount;
                        System.out.println("Withdrawal successful. Remaining balance: " + balance);
                    } else {
                        System.out.println("Insufficient balance. Current balance: " + balance);
                    }
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println("Lock is already locked by another thread");
            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            Thread.currentThread().interrupt();
            System.out.println("Thread interrupted");
        }

    }
}
