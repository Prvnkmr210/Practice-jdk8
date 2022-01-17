package com.java.basics.multithreading;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

class Q{
	Queue<Integer> queue = new ArrayDeque<>(10);
	public synchronized void put(int num) {		
		if(queue.size()==10) {
			try { wait(); } catch (InterruptedException e) {System.out.println(e);}
		}
		queue.add(num);
		System.out.println("Adding element in the queue" + queue);
		notify();
	}
	public synchronized void get() {
		System.out.println("Removing element from Q: " + queue);
		try { if(queue.isEmpty()) {wait(); }} catch (InterruptedException e) {System.out.println(e);}
		queue.remove();
		notify();
	}
}

class Producer implements Runnable{
	Q q;

	public Producer(Q q) {
		this.q = q;
	}

	public void run(){
		int i=0;
		while(true) {								
			q.put(i);
			try {Thread.sleep(1000);} catch(Exception ex) {}
			i++;						
		}
	}		
}

class Consumer implements Runnable{
	Q q;

	public Consumer(Q q) {
		this.q = q;
	}

	public void run(){
		while(true) {
			q.get();
			try {Thread.sleep(1000);} catch(Exception ex) {System.out.println(ex);}
		}
	}
}

public class ProducerConsumerExample {

	public static void main(String[] args) {
		System.out.println("Total available thrtead: " + Runtime.getRuntime().availableProcessors());

		Q q = new Q();
		Producer producer = new Producer(q);
		Consumer consumer = new Consumer(q);		

		new Thread(producer,"producerThread").start();
		new Thread(consumer, "consumerThread").start();
	}
}
