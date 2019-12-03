package com.test.string;

public class PriorityCalling {

	 String text = "";
	
	public static void Ts(String str) {
		System.out.println("String.." + str);
	}

	public static void Ts(Object str) {
		System.out.println("Object.." + str);
	}

	public static void main(String args[]) {
		Ts(null);
		
		System.out.println(new PriorityCalling().text.equalsIgnoreCase(null));
		
	}
}