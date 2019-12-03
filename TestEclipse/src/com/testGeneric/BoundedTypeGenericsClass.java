package com.testGeneric;

public class BoundedTypeGenericsClass {

	public static void main(String args[]) {
		
		Bound<C> c = new Bound<C>(new C());
		c.doPrint();
		
		Bound<B> b = new Bound<B>(new B());
		b.doPrint();
		
		Bound<A> a = new Bound<A>(new A());
		a.doPrint();
	}
}

class Bound<T extends A> {
	
	private T objReff;
	
	public Bound(T param) {
		this.objReff = param;
	}
	
	public void doPrint() {
		this.objReff.printClass();
	}
}

class A {
	public void printClass() {
		System.out.println("I am in super class A");
	}
}

class B extends A {
	@Override
	public void printClass() {
		System.out.println("I am in super class B");
	}
}

class C extends A {
	@Override
	public void printClass() {
		System.out.println("I am in super class C");
	}
}
