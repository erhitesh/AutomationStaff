package com.test.string;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringTest {

	public static String getCurrentYearValue() {
		String monthValue = "";
		String date = "05/08/2017";
		try {
			monthValue = new SimpleDateFormat("MMMM").format(new Date());
		} catch (Exception e) {}

		return monthValue;
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
		/*
		 * String str =
		 * "Annual, Berry, Biennial, Bulb, Conifer, Deciduous, Evergreen, Fruit, Grass, Groundcover, Herb, Heirloom, Houseplant, Hybrid, Perennial, Shrub, Succulent, Tree, Tropical, Vine, Woody Ornamental, Herbaceous, Vegetable, Native to North America, Rhizome, Semi-evergreen, Water Plant"
		 * ; List<String> data = Arrays.asList(str.split(",")); for (int i = 0;
		 * i < data.size(); i++) { System.out.println(data.get(i).trim()); }
		 */

		/*
		 * String date = ""; date = new SimpleDateFormat("MMM").format(new
		 * Date()); System.out.println(date);
		 */
		// List<String> monthList;
		// String monthValues =
		// "January,February,March,April,May,June,July,August,September,October,November,December";
		// monthList = new ArrayList<>(Arrays.asList(monthValues.split(",")));
		// for (String str : monthList) {
		// System.out.println("Momth value in three letter..."+str.substring(0,
		// 3));
		// }
		// String str = "Mayasd";
		// if (str.length() > 3) {
		// System.out.println("Month Value..."+str.substring(0, 3));
		// }
		// else
		// System.out.println("Month Value..."+str);
		// System.out.println("Current Year Value.."+getCurrentYearValue());
//		String name = "QA Tester";
//		System.out.println(name.substring(0, name.indexOf(" ")).length());
//		System.out.println(name.substring(name.indexOf(" ")+1));
//		System.out.println("asdnaksdnf ");
		
		//System.err.println("Dr Bwellbfaggihhafahftester Doctor".length());
		
		
		System.out.println(getValueFromDate("01/01/2018", "year"));
		
	}
}
