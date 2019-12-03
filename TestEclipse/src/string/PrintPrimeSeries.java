package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintPrimeSeries {
	
	public static boolean checkPrimeNumber(int number) {
		boolean status = false;
		for (int i = 2; i < number/2; i++) {
			if (number % i == 0)
				status = false;
			else 
				status = true;
		}
		return status;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
	  System.out.println(checkPrimeNumber(3));
		System.out.println("Enter the find out prime number series...>");
		int p, n = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
		
		for(int i = 2; i < n; i++){
			p = 0;
			for(int j = 2; j < i; j++){
				if(i % j == 0){
					p = 1;
					
				}
				
			}
				if(p == 0){
					System.out.println("Value"+i);
				}
			}
			
		}
		
	}