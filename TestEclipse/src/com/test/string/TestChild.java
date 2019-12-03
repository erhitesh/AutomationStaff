package com.test.string;

class TestParent {

	public static void testParent1() {
		System.out.println("Parent");
	}

	public static void testParent2() {
		System.out.println("Child");
	}

}

public class TestChild extends TestParent {

	public static void testParent1() {
		System.out.println("Child");
	}

	public static void testchild1() {
		System.out.println("Child");
	}

	public static void testchild2() {
		System.out.println("Child");
	}

	public static void main(String args[]) {

		
	}

}
