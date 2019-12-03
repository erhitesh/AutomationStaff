package com.test.NumberFormat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class RandomUniqueNumber {

	public static List<Integer> generateRandomUniqueNumber(int listSize, int howManyNumber) {
		int range = listSize;
		int[] number = new int[howManyNumber];
		List<Integer> sortedArray = new ArrayList<>();
		int count = 0;
		int num;
		Random r = new Random();
		while (count < number.length) {
			num = r.nextInt(range);
			boolean repeat = false;
			do {
				for (int i = 0; i < number.length; i++) {
					if (num == number[i]) {
						repeat = true;
						break;
					} else if (i == count) {
						number[count] = num;
						count++;
						repeat = true;
						break;
					}
				}
			} while (!repeat);
		}
		for (int j = 0; j < number.length; j++)
			sortedArray.add(number[j]);
		Collections.sort(sortedArray);
		
		return sortedArray;
	}
	
	public static int getRandomIntegerBtRange(int minRange, int maxRange) { // ##U
		int result = 0;
		try {
			Random t = new Random();
			result = t.nextInt(maxRange - minRange) + minRange;
		} catch (Exception e) {
		}
		return result;
	}

	public static void main(String args[]) {
		//List<Integer> sortedArray = generateRandomUniqueNumber(20, 10);
		System.out.println(getRandomIntegerBtRange(100000000, 999999999));
	}

}
