package com.java8.test;

class Parent {

	public Parent(String name) {
		System.out.println(name);
	}
	
	public void show() {
		System.out.println("Show Parent");
	}
}

class ChildClass extends Parent {
	
	public ChildClass(String name) {
		super(name);
		System.out.println("Bhardwaj");
	}

	@Override
	public void show() {
		System.out.println("Show Child");
	}
	
	public static void main(String args[]) {
		ChildClass c = new ChildClass("Hitesh");
		c.show();
	}
}