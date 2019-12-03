package com.test.eclipse;

public class RuntimeConcepts {

	public static void main(String args[]) {
		Runtime runtime = Runtime.getRuntime();
		System.out.println("Total Memory..." + runtime.totalMemory());
		System.out.println("Free Memory...." + runtime.freeMemory());

		for (int i = 0; i < 100000; i++) {
			new RuntimeConcepts();
		}
		System.out.println("After creating 10000 instance, Free Memory: " + runtime.freeMemory());
		System.gc();
		System.out.println("After Call gc method, Free Memory: " + runtime.freeMemory());
	}

}
