package com.java.basics.javaadvance;

import java.io.Serializable;

public class Person implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private transient String education;
	
	public Person(String name, int age, String education) {
		super();
		this.name = name;
		this.age = age;
		this.education = education;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getEducation() {
		return education;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", education=" + education + "]";
	}
	
	
}
