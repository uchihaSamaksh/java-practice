package com.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLock {
    int count = 0;

    ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    Lock readLock = readWriteLock.readLock();
    Lock writeLock = readWriteLock.writeLock();

    public void incrementCount(){
        writeLock.lock();
        System.out.println(Thread.currentThread().getName() + " is writing the count: " + count);
        count++;
        writeLock.unlock();
    }

    public int getCount(){
        readLock.lock();
        int temp = count;
        readLock.unlock();
        return temp;
    }
    
}
