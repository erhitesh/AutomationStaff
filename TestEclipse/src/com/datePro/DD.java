package com.datePro;

import java.text.DateFormatSymbols;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DD {

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

	public static String getMonthIndexBasedOnValue(String monthName) {
		String monthIndexValue = "";
		LinkedHashMap<String, String> list = getMonthValueInDifferentFormat("shortform");
		for (Map.Entry<String, String> map : list.entrySet()) {
			if (map.getValue().equalsIgnoreCase(monthName)) {
				monthIndexValue = map.getKey();
				break;
			}
		}

		return monthIndexValue;
	}

	public static String getMonthValueBasedOnIndex(String formatType, String indexValue) {
		String value = "";
		HashMap<String, String> info = getMonthValueInDifferentFormat(formatType);
		if (indexValue.length()<=1)
			indexValue = "0"+indexValue;
		value = info.get(indexValue);
		return value;
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
	public static void main(String args[]) {
		System.out.println(getMonthValueBasedOnIndex("shortform", "02"));
	}

}
