package com.multithreading;

public class Runner {
    public static void main(String[] args) {
        // // Created with Thread class
        // MultipleThreadDemo t1 = new MultipleThreadDemo();
        // t1.start();

        // // Created with Runnable interface
        // RunnableInterfaceImplementation r1 = new RunnableInterfaceImplementation();
        // Thread t2 = new Thread(r1);
        // t2.start();

        // for(int i= 0; i< 100; i++){
        //     System.out.println("Main thread is running");
        // }

        // //Thread life cycle
        // //New
        // MultipleThreadDemo t3 = new MultipleThreadDemo();
        // System.out.println(t3.getState());

        // //Runnable/Running
        // t3.start();
        // System.out.println(t3.getState());

        // //Blocked/Waiting
        // try {
        //     t3.sleep(10000);
        // } catch (InterruptedException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }
        // System.out.println(t3.getState());

        // //Terminated
        // try {
        //     t3.join(0);
        // } catch (InterruptedException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }
        // System.out.println(t3.getState());

        // Thread Methods
        // run, start, join, sleep, 
        // setPriority, getPriority, getName, setName
        // MultipleThreadDemo t4 = new MultipleThreadDemo();
        // t4.start();
        // System.out.println(t4.getName());
        // t4.setName("Thread 1");
        // System.out.println(t4.getName());
        // t4.setPriority(10);
        // System.out.println(t4.getPriority());
        // System.out.println(t4.getState());
        // System.out.println(t4.isAlive());
        
        // //yield -> current thread will give up the CPU and allow other threads to run
        // t4.yield();
        // System.out.println(t4.getState());

        // //isAlive -> check if thread is alive
        // System.out.println(t4.isAlive());

        // //isDaemon -> check if thread is a daemon thread
        // System.out.println(t4.isDaemon());

        // //isInterrupted -> check if thread is interrupted
        // System.out.println(t4.isInterrupted());
        
         //Synchronization
         // Counter counter = new Counter();
         // MultipleThreadDemo t5 = new MultipleThreadDemo(counter);
         // MultipleThreadDemo t6 = new MultipleThreadDemo(counter);
         // t5.start();
         // t6.start();
         // try {
         //    t5.join();
         //    t6.join();
         // } catch (InterruptedException e) {
         //    // TODO Auto-generated catch block
         //    e.printStackTrace();
         // }
         // System.out.println(counter.getCount());

         LocksDemo locksDemo = new LocksDemo();
         Runnable r1 = () -> {
            locksDemo.withdraw(500);
         };
          
         Thread t1 = new Thread(r1, "t1");
         Thread t2 = new Thread(r1, "t2");
         t1.start();
         t2.start();
         try {
            t1.join();
            t2.join();
         } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
         System.out.println(locksDemo.getBalance());


         // Read write lock
         // ReadWriteLock readWriteLock = new ReadWriteLock();
         // Runnable readLock = new Runnable() {
         //    @Override
         //    public void run(){
         //       for(int i = 0; i < 10; i++){
         //          try {
         //             Thread.sleep(1000);
         //          } catch (InterruptedException e) {
         //             // TODO Auto-generated catch block
         //             e.printStackTrace();
         //          }
         //          System.out.println(Thread.currentThread().getName() + " is reading the count: " + readWriteLock.getCount());
         //    }
         // }
         // };

         // Runnable writeLock = new Runnable() {
         //    @Override
         //    public void run(){
         //       readWriteLock.incrementCount();
         //       try {
         //          Thread.sleep(5000);
         //       } catch (InterruptedException e) {
         //          // TODO Auto-generated catch block
         //          e.printStackTrace();
         //       }
         //    }
         // };

         // Thread readThread1 = new Thread(readLock, "readThread");
         // Thread writeThread2 = new Thread(writeLock, "writeThread");
         // Thread readThread3 = new Thread(readLock, "readThread2");
         // Thread writeThread4 = new Thread(writeLock, "writeThread2");
         
         // readThread1.start();
         // writeThread2.start();
         // readThread3.start();
         // writeThread4.start();

         // try {
         //    readThread1.join();
         //    writeThread2.join();
         //    readThread3.join();
         //    writeThread4.join();
         // } catch (InterruptedException e) {
         //    // TODO Auto-generated catch block
         //    e.printStackTrace();
         // }
    }
}
