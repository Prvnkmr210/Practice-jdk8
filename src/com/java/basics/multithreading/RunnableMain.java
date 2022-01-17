package com.java.basics.multithreading;

public class RunnableMain {

	public static void main(String[] args) {
		RunnableImplementation runnableImplementation = new RunnableImplementation(1);
		RunnableImplementation runnableImplementation2 = new RunnableImplementation(2);

		Thread threadExample = new Thread(runnableImplementation);
		Thread threadExample2 = new Thread(runnableImplementation2);
		
		System.out.println("Before start: " + threadExample.isAlive());
		threadExample.start();
		System.out.println("After start: " + threadExample.isAlive());
		try {
			threadExample.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println("After sleep: " + threadExample.isAlive());
		threadExample2.start();

	}

}
