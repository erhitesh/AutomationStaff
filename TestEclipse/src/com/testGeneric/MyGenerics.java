package com.testGeneric;

public class MyGenerics {

	public static void main(String args[]) {

		// Mark as String
		SimpleGenericsOne<String> simpleStr = new SimpleGenericsOne<String>("Hitesh");
		simpleStr.printType();
		// Mark asboolean
		SimpleGenericsOne<Boolean> simpleBoolean = new SimpleGenericsOne<Boolean>(Boolean.TRUE);
		simpleBoolean.printType();

		
		
		SimpleGenericsTwo<String, Integer> simple = new SimpleGenericsTwo("Hitesh", 123);
		simple.printType();
	}
}

// Simple Generics class with one parameter.
class SimpleGenericsOne<T> {

	private T objReff = null;

	public SimpleGenericsOne(T param) {
		this.objReff = param;
	}

	public T getObjReff() {
		return this.objReff;
	}

	public void printType() {
		System.out.println("Type: " + objReff.getClass().getName());
	}
}

// Simple Generics class with two parameters.
class SimpleGenericsTwo<U, V> {

	private U objUReff = null;
	private V objVReff = null;

	public SimpleGenericsTwo(U objUReff, V objVReff) {
		this.objUReff = objUReff;
		this.objVReff = objVReff;
	}

	public U getObjU() {
		return objUReff;
	}
	
	public V getObjV() {
		return objVReff;
	}
	
	public void printType() {
		System.out.println("U Type: " + this.objUReff.getClass().getName());
		System.out.println("V Type: " + this.objVReff.getClass().getName());
		System.out.println("Value Of U.."+this.getObjU()+"\n"+"Value Of V.."+this.getObjV());
	}
}