package com.java.basics.multithreading;

public class RunnableImplementation implements Runnable{

private int threadNumber;
	
	
	public RunnableImplementation(int i) {
		this.threadNumber = i;
	}

	@Override
	public void run() {
		// all the codes within this block will be executed in multithread
		for(int i=0; i<5;i++) {
			System.out.println(i + " is priniting from Thread " + threadNumber);
		}
		
	}

}
