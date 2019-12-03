package looping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputOpPro {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int number = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
			if (number % 3 == 0 && number % 5 == 0) {
				System.out.println("Satya Prakash");
			}	
			
			else{
				if(number % 3 == 0){
					System.out.println("Satya");
				}
				
				else if (number % 5 == 0) {
					System.out.println("Prakash");
				}
				
				else{
					System.out.println("Not satisfy condition");
				}
			}
	}
}
