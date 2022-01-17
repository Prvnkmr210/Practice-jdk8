package com.java.basics.multithreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
	
	public static void main(String[] args) {
		Runnable r1 = new Task("1");
		Runnable r2 = new Task("2");
		Runnable r3 = new Task("3");
		Runnable r4 = new Task("4");
		Runnable r5 = new Task("5");

//		new Thread(r1).start();
//		new Thread(r2).start();
//		new Thread(r3).start();
//		new Thread(r4).start();
//		new Thread(r5).start();
		
		ExecutorService pool = Executors.newFixedThreadPool(3);
		pool.execute(r1);
		pool.execute(r2);
		pool.execute(r3);
		pool.execute(r4);
		pool.execute(r5);
		pool.shutdown();
	}
}

class Task implements Runnable{

	String name;

	public Task(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("for loop, position i - " + i + " for thread " + name);
		}		
	}	
}

