package programmingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindMissingNumber {
	
	
	public static int sumOfNumber(int number){
		return (number*(number+1)/2);
	}
	
	public static int sumOfArray(int a[]){
		int sum = 0;
		for (int i = 0; i < a.length; i++){
			sum = sum + a[i];
		}
		
		return sum;
	}
	
	
	public static void main(String args[]) throws NumberFormatException, IOException  {
		System.out.print("Enter Number");
		int number = 0;
		number = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
		int a[] = {1,2, 4, 5, 6, 7}; 
		
		if (number == a.length) {
			System.out.println("Please enter one number is greater than array length....");
			number = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
		}
		System.out.println("Missing Number..."+(sumOfNumber(number)-sumOfArray(a)));
	}

}
