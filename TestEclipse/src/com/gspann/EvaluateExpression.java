package com.gspann;

/**
 * @author sony
 *
 */
public class EvaluateExpression {
	public static void main(String args[]) {
		int a = 2, b = 3, c = 9, d = 10;
		System.out.println(b++);
		int aa = a - (b++);
		System.out.println(b);

		System.out.println("Result" + (a - (b++) * (--c)));
		c++;
		c--;
		System.out.println(b + "\n" + c);
		// System.out.println("Result" + (a * (++b) % c));
	}
}
