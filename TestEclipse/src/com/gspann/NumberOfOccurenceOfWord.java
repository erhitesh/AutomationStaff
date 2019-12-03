package com.gspann;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.google.common.base.CharMatcher;

public class NumberOfOccurenceOfWord {
	
	public static int NoOfOccurenceOfWordUsingList(String sentence, String word) {
		int freq = 0;
		try {
			List<String> list = new ArrayList<>(Arrays.asList(sentence.split(" ")));
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).replaceAll("[-+.^:,]", "").equalsIgnoreCase(word))
					freq++;
			}
		}catch(Exception e) {}
		System.out.println("Searched word occurs Using List : "+ freq +" times.");
		return freq;
	}
	
	public static int NoOfOccurenceOfWordUsingString(String sentence, String word) {
		int freq = 0;
		String w = "";
		try {
			for (int i = 0; i < sentence.length(); i++) {
				if (sentence.charAt(i)==' '|| sentence.charAt(i)=='.') {
					if (w.equalsIgnoreCase(word))
						freq++;
					w = "";
				}
				w=(w+sentence.charAt(i)).trim();
				w.replaceAll(".", "");
			}	
		}catch(Exception e) {}
		System.out.println("Searched word occurs using String : "+ freq +" times.");
		return freq;
	}
	
	public static int findOutNoOfOccurenceOfLetter(String sentence, String word) {
		int freq = 0;
		try {
			freq = StringUtils.countMatches(sentence, word);
		}catch(Exception e) {}
		System.out.println("Count of letter..."+freq);
		return freq;
		
	}
	
	public static int findOutNoOfOccurenceOfLetterUSIngString(String sentence, char word) {
		int freq = 0;
		try {
			for (int i = 0; i < sentence.length(); i++) {
				if (sentence.charAt(i) == word)
					freq++;
			}
		}catch(Exception e) {}
		System.out.println("Count of letter..."+freq);
		return freq;
	}
	
	public static int findOutNoOfOccurenceOfLetterUSIngFilter(String sentence, char word) {
		int freq = 0;
		try {
			freq = (int) sentence.chars().filter(ch -> ch == word).count();
			System.out.println("Using filter with codepoint.."+(sentence.codePoints().filter(ch -> ch == word).count()));
		}catch(Exception e) {}
		System.out.println("Count of letter..."+freq);
		System.out.println(CharMatcher.is('E').countIn(sentence));
		return freq;
		
	}
	
	public static void main(String args[]) throws IOException {
		// Variable Declaration
		String sentence, word = "";
		char chada = 'E';
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter a sentence : ");
			sentence = br.readLine().toUpperCase();//"the quick brown fox jumps over the lazy dog.";
			System.out.print("Enter a word to be searched : ");
			word = br.readLine().toUpperCase();
			//NoOfOccurenceOfWordUsuingList(sentence, word);
			//NoOfOccurenceOfWordUsingString(sentence, word);
			
			//findOutNoOfOccurenceOfLetter(sentence, word);
			//findOutNoOfOccurenceOfLetterUSIngString(sentence, 'H');
			findOutNoOfOccurenceOfLetterUSIngFilter(sentence, 'E');
			System.out.println(sentence.chars().filter(ch -> ch == chada).count());
		}catch(Exception e) {}
	}
}
