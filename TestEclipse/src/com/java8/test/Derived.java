package com.java8.test;

class Base {

	public Base() {
		System.out.println("Base");
	}

	public void BaseMethod() {
		System.out.println("Base Method");
	}
}

public class Derived extends Base {

	public Derived() {
		System.out.println("Deriver");
	}

	@Override
	public void BaseMethod() {
		System.out.println("Derived Method");
	}

	public final static void main(String args[]) {
		Base base = new Derived();
		base.BaseMethod();
	}
}
