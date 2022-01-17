package com.java.basics.multithreading;

public class DaemonThreadExample {
	
	public static void main(String[] args) throws InterruptedException {
		
//		ThreadExample t1 = new ThreadExample(1);		
//		t1.start();		
		
		ThreadExample daemonThread = new ThreadExample(11);	
		daemonThread.setDaemon(true);
		daemonThread.start();	
		
		System.out.println("Executing this line...");
	}

}
