package com.binding;

class Test {

	public static void walk() {
		System.out.println("Test Walk");
	}
}

public class RunTimeBinding extends Test {
	public static void walk() {
		System.out.println("Run Walk");
	}

	public static void main(String args[]) {
new RunTimeBinding();
		//		Test t = new RunTimeBinding();
//		t.walk();
		RunTimeBinding.walk();
	}
}
