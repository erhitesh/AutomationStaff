package com.testGeneric;

public class BoundedTypeGenericsInterface {

	public static void main(String args[]) {
		BoundTest<Z> z = new BoundTest<Z>(new Z());
		z.doPrint();
	}
}

class BoundTest<T extends X> {
	
	private T objReff;
	
	public BoundTest(T param) {
		this.objReff = param;
	}
	
	public void doPrint() {
		this.objReff.printClass();
	}
}

interface X {
	public void printClass();
}

class Y implements X {
	@Override
	public void printClass() {
		System.out.println("I am in class Y");
	}
}

class Z implements X {
	@Override
	public void printClass() {
		System.out.println("I am in class Z");
	}
}
