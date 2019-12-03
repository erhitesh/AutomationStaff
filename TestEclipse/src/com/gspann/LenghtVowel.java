package com.gspann;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LenghtVowel {
	
	public static void main(String args[]) throws IOException {
		int vowelCount = 0;
		String original,reverse = "";
		System.out.println("Please Enter The String for No. Of Operation..");
		original = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		original = original.toUpperCase();
		System.out.println("Length Of String.."+original.length());
		for (int i = original.length()-1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
			if (original.charAt(i)=='A'||original.charAt(i)=='E'||original.charAt(i)=='I'||original.charAt(i)=='O'||original.charAt(i)=='U') {
				vowelCount++;
			}
		}
		System.out.println("Original String.."+original+"\n"+"Reverse String.."+reverse+"\n"+"Vowel Count.."+vowelCount);
	}
}
