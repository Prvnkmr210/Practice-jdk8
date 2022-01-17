package com.java.basics.multithreading;

public class RaceCondition{
	
	int counter = 0;
	
	public void increment() {	
			try {
			      Thread.sleep(100);
			    } catch (InterruptedException e) {
			      // TODO Auto-generated catch block
			      e.printStackTrace();
			    }
		counter++;
			
	}
	
	public int getCounter() {
		return counter;
	}

	public static void main(String[] args) {
		
		RaceCondition r1 = new RaceCondition();
		
		for(int i=0; i<10; i++) {
			new Thread(()->{
			synchronized (r1) {
				r1.increment();
				System.out.println("value for " + Thread.currentThread().getName() + " - " + r1.getCounter());
			}			
			}).start();
		}
		
//		Thread t1 = new Thread(()->r1.increment());
//		Thread t2 = new Thread(()->r1.increment());
//		Thread t3 = new Thread(()->r1.increment());
//		Thread t4 = new Thread(()->r1.increment());
//		Thread t5 = new Thread(()->r1.increment());
//		
//		t1.start();
//		t2.start();
//		t3.start();
//		t4.start();
//		t5.start();
		
//		System.out.println(r1.getCounter());

	}

}
