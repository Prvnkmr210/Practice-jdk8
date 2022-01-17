package com.java.basics.finaal;

public final class Person {
	private final String name = "kumar";
	private final Address address = new Address("Bihta", "Patna", "800002");
	
	private Address newaddress = new Address("Ara", "Patna", "800002");
	
	void updateAddress() {
//		address = newaddress;
	}
	
}
