package com.java.basics.multithreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import com.java.basics.collections.Student;

public class BlockingQueueExample {

	public static void main(String[] args) {
		BlockingQueue<Student> queue = new ArrayBlockingQueue<>(10);
		
		// Producer
		final Runnable producer = () -> {
			while(true) {
				try {
					queue.put(new Student("rohan", 01));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		new Thread(producer).start();
		new Thread(producer).start();
		
		// consumer
		final Runnable consumer = () -> {
			while(true) {
				try {
					queue.take();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}; 
		new Thread(consumer).start();
		new Thread(consumer).start();
	}

}
