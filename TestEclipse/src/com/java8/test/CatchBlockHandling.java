package com.java8.test;

public class CatchBlockHandling {

	public static void main(String args[]) {
		String nam = "";
//		try {
//			try {
//				System.out.println("going to divide");
//				int b = 39 / 0;
//			} catch (ArithmeticException e) {
//				System.out.println("Arthimetic"+e);
//			}
//
//			try {
//				int a[] = new int[5];
//				a[5] = 4;
//			} catch (ArrayIndexOutOfBoundsException e) {
//				System.out.println("Arrya"+e);
//			}
//			System.out.println("other statement");
//		} catch (Exception e) {
//			System.out.println("handeled");
//		}
//
//		System.out.println("normal flow..");
		
		try {
			System.out.println("going to divide");
			int b = 39 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}finally {
			System.out.println("This is finally block");
		}
		
		CatchBlockHandling block = new CatchBlockHandling();
		CatchBlockHandling block1 = new CatchBlockHandling();
		System.out.println(block+"\n"+block1);

	}

}
