package com.test.eclipse;

public class Loops {
	
	public static void main(String args[]) {
		
		
		for (int i = 0; i < 4; i++) {
			System.out.println("Hi");
			if (i < 3) {
				while (i > 1) {
					System.out.println("Hello");
					
				}
				break;
			}
			System.out.println("Hi");
		}
	}

}
