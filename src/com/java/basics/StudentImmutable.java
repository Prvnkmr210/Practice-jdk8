package com.java.basics;

public final class StudentImmutable {// final class to make this class non-extendible
	private final int id;
	private final String name;
	
	public StudentImmutable(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "StudentImmutable [id=" + id + ", name=" + name + "]";
	}
	
}
