package com.test.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringToArray {

	public static String getReverseStr(String str) {
		String reverseStr = "";
		for (int i = str.length()-1; i >= 0; i--) {
			reverseStr = reverseStr+str.charAt(i);
		}
/*		char chars[] = str.toCharArray();
		for (int i = chars.length-1; i >= 0; i--) {
			reverseStr = reverseStr + str.charAt(i);
		}*/
		return reverseStr;
	}
	
	public static List<String> reverseSentence(String Sentence) {
		List<String> list = new ArrayList<>(Arrays.asList(Sentence.split(" ")));
		List<String> reverseSen = new ArrayList<>();
		try {
			for (int i = 0; i < list.size(); i++)
				reverseSen.add(getReverseStr(list.get(i)));
		}catch(Exception e){}
		
		return reverseSen;
	}
	
	public static List<String> test() {
		List<String> list = new ArrayList<>();
		list.add("Dr. CYNTHIA DEKLOTZ");
		list.add("Dr. ddsd Bhardwaj");
		list.add("Dr. we Shara");
		list.add("Dr. yty shrma");
		
		return list;
	}
	
	public static void main(String args[]) {
		String str = "My Name Is Hitesh";
		List<String> rev = reverseSentence(str);
		System.out.println("String Before Reverse.."+str+"\n"+"List After Reverse.."+rev);
	}
}
