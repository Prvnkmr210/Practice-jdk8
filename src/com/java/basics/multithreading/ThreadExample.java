package com.java.basics.multithreading;

public class ThreadExample extends Thread{
	
	private int threadNumber;
	
	
	public ThreadExample(int i) {
		this.threadNumber = i;
	}


	public void run() {
		try {
			if(threadNumber == 1 || this.isDaemon()) {
				Thread.sleep(2000);
			}			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// all the codes within this block will be executed in multithread
		for(int i=0; i<5;i++) {
			System.out.println(i + " is priniting from Thread " + threadNumber);
		}
		
	}

}
