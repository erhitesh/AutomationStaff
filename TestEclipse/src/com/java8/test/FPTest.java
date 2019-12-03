package com.java8.test;

public class FPTest {
	
	public static strictfp float testFP() {
		float f = 123.2367241f;
		return f; 
	}

	public static void main(String args[]) {
		System.out.println(testFP());
	}
}
