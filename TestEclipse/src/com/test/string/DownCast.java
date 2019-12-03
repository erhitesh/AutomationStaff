package com.test.string;

class Test {}

public class DownCast extends Test {
	
	static void testDownCasting(Test test) {
		DownCast down = (DownCast) test;   // downcasting
		System.out.println("DownCasting down");
	}
	
	public static void main(String args[]) {
		Test tt = new DownCast();
		DownCast.testDownCasting(tt);
	}
}
