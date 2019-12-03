package com.test.string;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;


public class RandomData {

	public static String getRandomNumber(int numberLength) {
		String randomNumberAsString = "";
		try {
			randomNumberAsString = RandomStringUtils.randomAlphabetic(1)+RandomStringUtils.randomNumeric(numberLength)+RandomStringUtils.randomAlphabetic(1);//RandomStringUtils.randomAlphanumeric(numberLength);//RandomStringUtils.randomNumeric(numberLength);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return randomNumberAsString;
	}
	public static String getRandomData() {
		String result = null;
		try {
			result = "" + System.currentTimeMillis();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public static int getRandomInteger(int maxRange) { // ##U
		int result = 0;
		try {
			Random t = new Random();
			result = t.nextInt(maxRange);
		} catch (Exception e) {
		}
		return result;
	}
	
	public static String getRandomString() {
		String finalValue = null;
		try {
			String result = getRandomData();
			char[] ch = result.toCharArray();
			finalValue = "";
			for (char c : ch) {
				int temp = 97 + Character.getNumericValue(c);
				finalValue = finalValue.concat(Character.toString((char) temp));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return finalValue;
	}
	
	public static int getRandomIntegerBtRange(int minRange, int maxRange) { // ##U
		int result = 0;
		try {
			Random t = new Random();
			result = t.nextInt(maxRange-minRange)+minRange;
		} catch (Exception e) {
		}
		return result;
	}
	
	public static String generateMobileNumber() { // ##U
		Random rm = new Random();
		String num = String.valueOf(rm.nextInt(9) + 1);
		int i = 0;
		while (i != 9) {
			num = num.concat(String.valueOf((rm.nextInt(9))));
			i++;
		}
		return num;
	}
	
	public static String randomMonthValue() {
		String month = "";
		Random random = new Random();
		int monthValue = 1+ random.nextInt(12);
		System.out.println(monthValue);
		if (monthValue == 1)
			month = "Jan";
		else if (monthValue == 2) 
			month = "Feb";
		else if (monthValue == 3) 
			month = "Mar";
		else if (monthValue == 4) 
			month = "Apr";
		else if (monthValue == 5) 
			month = "May";
		else if (monthValue == 6) 
			month = "Jun";
		else if (monthValue == 7) 
			month = "Jul";
		else if (monthValue == 8) 
			month = "Aug";
		else if (monthValue == 9) 
			month = "Sep";
		else if (monthValue == 10) 
			month = "Oct";
		else if (monthValue == 11) 
			month = "Nov";
		else if (monthValue == 12) 
			month = "Dec";
			
		return month;
		
	}
	
	public static String getRandomAlphabetic(int numberLength) {
		String randomNumberAsString = "";
		try {
			randomNumberAsString = RandomStringUtils.randomAlphabetic(numberLength);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return randomNumberAsString;
	}
	
	public static String getDateAsString(String pattern, String dateValue) {
		String date = "";
		Date date1 = null;
		SimpleDateFormat simple = new SimpleDateFormat("MM/dd/yyyy");
		try {
			date1 = simple.parse(dateValue);
			date = new SimpleDateFormat(pattern).format(date1);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
	public static void main(String args[]) throws ParseException {
		System.out.println("Random Mobile Number..."+generateMobileNumber());
	}
}
