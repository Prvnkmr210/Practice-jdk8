package com.java.basics.multithreading;

public class SynchronizedExample {
	
	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();
		
		Thread t1 = new Thread(()-> {
			for(int i=0; i<1000; i++) {
				counter.increment();
			}
		});
		
		Thread t2 = new Thread(()-> {
			for(int i=0; i<1000; i++) {
				counter.increment();
			}
		});
		
		t1.start();		
		t2.start();
		
		t1.join();
		t2.join();
		
//		Thread.sleep(2000);
		System.out.println(counter.count);
	}

}

class Counter {
	int count;

	void increment() {
		synchronized(this){
			count++;
		}		
	}
}



