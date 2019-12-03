package com.test.NumberFormat;

import java.text.DecimalFormat;

public class IntergerConversion {

	public static int numberDigitCount(int number) {
		int count = 0;
		while (number != 0) {
			number = number / 10;
			++count;
		}

		if (count == 1) {
			String r = new DecimalFormat("00").format(count);
			System.out.println(r);
			System.out.println(Integer.parseInt(new DecimalFormat("00").format(count)));
		}

		return count;
	}

	public static String removeLeadingZerosFromNumber(String numberStr) {
		String number = "";
		try {
			number = numberStr.replaceAll("^0*", "");
		} catch (Exception e) {
		}
		return number;
	}

	public static void conversion() {
		int a = 60;
		int b = 60;
		int c = a & b;
		System.out.println("value of C" + c);

		if (a == b)
			System.out.println("mdslamd");
		else
			;
	}

	public static void main(String args[]) {
		
		System.out.println(123 <= 123.2 && 123.12 <=124.12);
	}

}
