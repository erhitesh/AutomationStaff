package com.datePro;

import java.text.DateFormatSymbols;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;


public class GenerateDate {
	
/*	public String generateDate() {
		String dateValue = "";
		Calendar calender = new GregorianCalendar();
		Date date = new Date();
		calender.setTime(date);
		calender.add(Calendar.DATE, 0);
		Date newDate = calender.getTime();
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
		dateValue = format.format(newDate);
		return dateValue;
	}

	public static List<Integer> numberList() {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		list.add(12);
		
		return list;
	}
	
	public static List<String> numberListAsTwoDigits() {
		List<String> list = new ArrayList<>();
		NumberFormat format = new DecimalFormat("00");
		for (int i = 0; i < numberList().size(); i++) {
			list.add(format.format(numberList().get(i)));
		}
		
		return list;
	}
	
	public static LinkedHashMap<String, String> getMonthValueInDifferentFormat(String formatType) {
		LinkedHashMap<String, String> list = new LinkedHashMap<>();
		for (int i = 0; i < numberListAsTwoDigits().size(); i++) {
			list.put(numberListAsTwoDigits().get(i), getMonthsValueList(formatType).get(i));
		}
		
		return list;
	}
	
	public static List<String> getMonthsValueList(String monthValueType) {
		List<String> months = new ArrayList<>();
		String month[] = null;
		if (monthValueType.equalsIgnoreCase("shortform")) {
			month = new DateFormatSymbols().getShortMonths();
		} else if (monthValueType.equalsIgnoreCase("fullform")) {
			month = new DateFormatSymbols().getMonths();
		}
		for (int i = 0; i < month.length - 1; i++) {
			months.add(month[i]);
		}

		return months;
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
	
	public static String getCurrentYearValue(String dateFormateType) {
		String value = "";
		try {
			if (dateFormateType.equalsIgnoreCase("year"))
				value = new SimpleDateFormat("YYYY").format(new Date());
			else if (dateFormateType.equalsIgnoreCase("month"))
				value = new SimpleDateFormat("MMM").format(new Date());
			else if (dateFormateType.equalsIgnoreCase("day"))
				value = new SimpleDateFormat("dd").format(new Date());
		} catch (Exception e) {
		}

		return value;
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
	
	public static String dateInDifferentFormats(String pattern) {
		String date = "";
		SimpleDateFormat simple = new SimpleDateFormat(pattern);
		date = simple.format(new Date());
		
		return date;
	}
	
	public static String getCurrentDate() {
		SimpleDateFormat simple = new SimpleDateFormat("EEEE,MMMM d HH:mm a");
		String date = simple.format(new Date());
		return date;
	}
	
	
	public static void getCurrentTime() {
		try {
			LocalTime time = LocalTime.now();
			int sec = time.getSecond();
			Thread.sleep(2000);
			System.out.println(sec == time.getSecond());
		}catch(Exception e) {
			
		}
	}
	
	public static void getDate() {
		String dateValue = "";
		Calendar calender = new GregorianCalendar();
		Date date;
		try {
			date = new SimpleDateFormat("MM/dd/yyyy").parse("01/01/2017");
			calender.setTime(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		calender.add(Calendar.DATE, 1);
		Date newDate = calender.getTime();
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
		dateValue = format.format(newDate);
		System.out.println("dateValue"+dateValue);
		
	}*/
	public static List<String> getMonthsValueList(String monthValueType) {
		List<String> months = new ArrayList<>();
		String month[] = null;
		if (monthValueType.contains("short")) {
			month = new DateFormatSymbols().getShortMonths();
		} else if (monthValueType.contains("full")) {
			month = new DateFormatSymbols().getMonths();
		}
		for (int i = 0; i < month.length - 1; i++) {
			months.add(month[i]);
		}

		return months;
	}
	
	public static List<Integer> numberList() {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		list.add(12);
		
		return list;
	}
	
	
	public static List<String> numberListAsTwoDigits() {
		List<String> list = new ArrayList<>();
		NumberFormat format = new DecimalFormat("00");
		for (int i = 0; i < numberList().size(); i++) {
			list.add(format.format(numberList().get(i)));
		}

		return list;
	}

	public static String dateInDifferentFormats(String pattern) {
		String date = "";
		SimpleDateFormat simple = new SimpleDateFormat(pattern);
		date = simple.format(new Date());

		return date;
	}

	public static LinkedHashMap<String, String> getMonthValueInDifferentFormat(String formatType) {
		LinkedHashMap<String, String> list = new LinkedHashMap<>();
		for (int i = 0; i < numberListAsTwoDigits().size(); i++) {
			list.put(numberListAsTwoDigits().get(i), getMonthsValueList(formatType).get(i));
		}

		return list;
	}
	public static String getValueFromDate(String dateValue, String valueFor) {
		String value = "";
		try {
			if (valueFor.equalsIgnoreCase("day")) {
				value = dateValue.substring(dateValue.indexOf("/") + 1, dateValue.indexOf("/") + 3);
			} else if (valueFor.equalsIgnoreCase("month")) {
				value = dateValue.substring(0, dateValue.indexOf("/"));
			} else if (valueFor.equalsIgnoreCase("year")) {
				value = dateValue.substring(dateValue.indexOf("/") + 4, dateValue.length());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return value;
	}

	public static String getMonthValueBasedOnIndex(String formatType, String indexValue) {
		String value = "";
		HashMap<String, String> info = getMonthValueInDifferentFormat(formatType);
		if (indexValue.length() <= 1)
			indexValue = "0" + indexValue;
		value = info.get(indexValue);
		return value;
	}
	
	public static void main(String args[]) throws ParseException {
//		SimpleDateFormat simple = new SimpleDateFormat("YYYY");
//		LocalDate dte = LocalDate.now();
//		System.out.println("Date..."+simple.format(dte));
		
		Random random = new Random();
		int u = random.nextInt();
		System.out.println(u);
		
	}
}
