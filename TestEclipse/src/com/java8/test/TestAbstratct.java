package com.java8.test;

abstract class TestAb {
	abstract void test();
}

class SubAb extends TestAb {
	
	@Override
	void test() {
		System.out.println("Sub Class Method");
	}
}

public class TestAbstratct extends SubAb {

	public static void main(String args[]) {
		
		TestAbstratct ab = new TestAbstratct();
		ab.test();
	}
}
