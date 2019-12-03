package com.test.string;

class TestOver {
	
	void testOverriding() {
		System.out.println("Hello Parent");
	}
	
	void testOverriding1() {
		System.out.println("Hello Parent");
	}
	
}

public class Overriding extends TestOver {
	
	@Override
	public void testOverriding() {
		System.out.println("Hello Child");
	}
	
	public void test() {
		System.out.println("Child class method");
	}
	
	public static void main(String args[]) {
		Overriding over = new Overriding();
		over.testOverriding();
		over.testOverriding1();
	}

}
