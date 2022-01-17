package com.java.basics.multithreading;

public class ThreadLocalExample {
	
	public static void main(String[] args) {
		ThreadLocal<String> threadLocal = new ThreadLocal<>();
		
		Thread t1 = new Thread(() -> {
			threadLocal.set("Thread1");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(threadLocal.get());
		});
		
		Thread t2 = new Thread(() -> {
			threadLocal.set("Thread2");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(threadLocal.get());
		});
		
		t1.start();
		t2.start();
	}

}
