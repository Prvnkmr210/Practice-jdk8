package com.java.basics.collections;

import java.util.Comparator;
import java.util.Objects;

public class Student {
	
	private int id;
	private String name;
	
	public Student(String name, int id) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
}
