package fibonacciSeries;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonacciUsingrecursion {

	public static int fibonacciUsingRecursion(int n) {
		if (n <= 1)
			return n;
		else
			return fibonacciUsingRecursion(n - 1) + fibonacciUsingRecursion(n - 2);
	}

	public static void main(String args[]) throws NumberFormatException, IOException {
		System.out.println("Enter the number for getting fibonacci series...");
		int number = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
		for (int i = 0; i < number; i++) {
			System.out.print(fibonacciUsingRecursion(i) + " ");
		}
	}
}
