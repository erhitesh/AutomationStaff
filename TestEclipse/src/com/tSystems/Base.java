package com.tSystems;

public class Base{
	private int multiplier(int data) {
		return data*5;
	}
	
} class Derived extends Base {
	private static int data;
	
	public Derived() {
		data = 25;
	}
	
	public static void main(String args[]) {
		Base base = new Derived();
		//base.multiplier(2); // Private method cannot be access outside the class.
	}
}
