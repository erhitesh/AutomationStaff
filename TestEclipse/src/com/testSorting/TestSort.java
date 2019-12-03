package com.testSorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestSort {

	public static boolean getUniqueRandomNumber(int number, int arr[]) {
		
		if (number == -1)
			return true;
		else
			for (int i = 0; i < arr.length; i++) {
				if (number == arr[i]) 
					return true;
			}
		return false;
	}
	
	public static void main(String args[]) {
		String str = "hitesh bhardwaj asda abadjbda";
		List<String> list = new ArrayList<>(Arrays.asList(str.split(",")));
		System.out.println(list);
		
		int a[] = {1, 3, 4, 1};
		System.out.println("Unique number array..."+getUniqueRandomNumber(1, a));
		
	}
	
}
