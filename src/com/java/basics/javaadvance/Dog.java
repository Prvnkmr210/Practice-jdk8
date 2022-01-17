package com.java.basics.javaadvance;

import javax.management.remote.SubjectDelegationPermission;

public abstract class Dog implements Animal {
	public void eat() {
		System.out.println("Dogs are omnivorous");
	}
	
	public void sleep() {
		System.out.println("Dogs are sleeping");
	}
	
	
	
}
