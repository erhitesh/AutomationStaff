package fibonacciSeries;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonacciPatternPrint {
	public static void fibonacciWithoutRecursion(int number){
		int n3, n1 = 0, n2 = 1;
		if (number > 1){
			System.out.print(n1+" "+n2);
			for(int i = 2; i < number; i++){
				n3 = n1 + n2;
				System.out.print(" "+n3);
				n1 = n2;
				n2 = n3;
			}
		}
		else
			System.out.println("Please enter number greater than one");
	}
	public static void main(String args[]) throws NumberFormatException, IOException{
	System.out.println("Enter the number for printing fibonacci series.............");
    fibonacciWithoutRecursion(Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine()));
	}
}