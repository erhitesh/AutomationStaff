package primeRelated;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeSeries {

	public static void getPrimeSeries(int n) {
		int p;
		for (int i = 2; i < n; i++) {
			p = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0){
					p = 1;
				}
			}
			if (p == 0) {
				System.out.println("Prime Number series..> "+i);
			}
		}
	}
	public static void main(String args[]) throws NumberFormatException, IOException {
		int number = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
		getPrimeSeries(number);
		System.out.println();
	}

}
