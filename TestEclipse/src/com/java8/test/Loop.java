package com.java8.test;

public class Loop {
	
	public static void reverseLoop(int count) {
		for (int i = count-1; i >= 0; i--) {
			System.out.println("Iteration value.."+i);
			if (i <= 0) {
				System.out.println("Inside con");
				break;
			}
		}
	}
	
	public static void main(String args[]) {
		/*int j = 5;
		int count = 0;
		int total = 5;
		for (int i = 1; i <j; i++) {
			System.out.println("Value of I..."+(i-1));
			count++;
			if (count==total) {
				System.out.println("After 5");
				break;
			}
			i = i-1;
			//System.out.println("VALUE AFTER>>>"+i);
		}*/
		
		reverseLoop(2);
	}

}
