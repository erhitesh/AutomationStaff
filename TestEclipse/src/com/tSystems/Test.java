package com.tSystems;

class SuperClass {
	  /*final*/ public int calc(int a, int b) { // final method can not be override
		return 0;
	}
}

class SubClass extends SuperClass {
	@Override
	public int calc(int a, int b) {
		return 1;
	}
}

public class Test {
public static void main(String args[]) {
	SubClass sub = new SubClass();
	System.out.println("X = "+sub.calc(0, 1));
}
}
