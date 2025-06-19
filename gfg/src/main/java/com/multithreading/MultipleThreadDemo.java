package com.multithreading;

public class MultipleThreadDemo extends Thread{
    // @Override
    // public void run() {
        // TODO Auto-generated method stub
        // for(int i= 0; i< 100; i++){
        //     System.out.println("Thread 1 is running");
        // }

        // try{
        //     System.out.println("Thread is sleeping");
        //     Thread.sleep(1000);
        // } catch (InterruptedException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }
        // System.out.println("Thread is running");

        Counter counter;
        MultipleThreadDemo(Counter counter){
            this.counter = counter;
        }

        @Override
        public void run(){
            for(int i=0;i<1000;i++){
                counter.increment();
            }
        }
}
