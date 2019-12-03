package primeRelated;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckPrimeNumber {
	
	public static boolean isPrime(int number){
		for(int i = 2; i<= number/2; i++){
			if(number % i == 0){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Enter the number for checking either number is prime or not.");
		System.out.println(isPrime(Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine())));
		
	}

}
