package com.java.basics.javaadvance;

public class CovariantReturnTypeExample {
	
	public static void main(String[] args) {
		Base base = new Derived();
		base.fun();
	}

}

class X {}
class Y extends X{}

class Base{
	X fun() {
		System.out.println("Base fun");
		return new X();
	}
}

class Derived extends Base{
	Y fun() {
		System.out.println("Derived fun");
		return new Y();
	}
}
