package com.java.basics.multithreading;

public class VolatileTest extends Thread {
	
	//volatile
    volatile boolean keepRunning = true;

    public void run() {
        long count=0;
        while (keepRunning) {
            count++;
//            System.out.println(count);
        }

        System.out.println("Thread terminated with count value: " + count);
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileTest t = new VolatileTest();
        t.start();
        Thread.sleep(1000);
        System.out.println("after sleeping in main");
        t.keepRunning = false;
        t.join();
        System.out.println("keepRunning set to " + t.keepRunning);
    }

}
