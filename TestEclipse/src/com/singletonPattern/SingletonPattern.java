package com.singletonPattern;

public class SingletonPattern {
	
	private static SingletonPattern singletonInstance;

	private SingletonPattern() {}
	
	public static SingletonPattern getSingletonPatternInstances() {
		if (singletonInstance == null) {
			System.out.println("Creating new instance");
			singletonInstance = new SingletonPattern();
		}
		return singletonInstance;
	}
	
	public static void printSingleton() {
		 System.out.println("Inside print Singleton");
	}
}
