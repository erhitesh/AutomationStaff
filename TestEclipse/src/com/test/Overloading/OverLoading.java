package com.test.Overloading;

public class OverLoading {
	
	public static void getName(int a, int b) {
		System.out.println("Hello GetName");
	}
	
	public static int getName(int a, long b) {
		System.out.println("Hello GetName");
		return (a+(int)b);
	}
}
