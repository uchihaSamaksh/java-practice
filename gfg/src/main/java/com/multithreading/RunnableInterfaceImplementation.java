package com.multithreading;

public class RunnableInterfaceImplementation implements Runnable{

    @Override
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Thread 2 is running");
        }
    }

}
