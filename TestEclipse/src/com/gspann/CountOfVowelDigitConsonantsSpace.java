package com.gspann;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountOfVowelDigitConsonantsSpace {

	public static void main(String args[]) {
		int vowel = 0, consonant = 0, digit = 0, space = 0;
		String str = "";
		try {
			System.out.println("Please Enter The String For the following operations...");
			str = (new BufferedReader(new InputStreamReader(System.in)).readLine().toLowerCase());
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				//  for vowel
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
					vowel++;
				else if (ch >= 'a' && ch <= 'z')
					consonant++;
//				else if (ch >= '0' && ch <='9')
//					digit++;
				else if (Character.isDigit(ch))
					digit++;
				else if (ch == ' ')
					space++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Vowel.."+vowel+"\n"+"Consonante.."+consonant+"\n"+"Digit.."+digit+"\n"+"Spaces.."+space);
	}
}
