package com.test.eclipse;

import java.util.Random;

public class TestJava {

//
//	public static String getRandomNumber() {
//		String number = "";
//		try {
//			RandomStringUtils rs =new RandomStringUtils();
//			number = rs.randomNumeric(10);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//
//		return number;
//	}
//
//	public static String getRandomNumber(int numberLength) {
//		String randomNumberAsString = "";
//		try {
//			randomNumberAsString = RandomStringUtils.randomNumeric(numberLength);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		return randomNumberAsString;
//	}
//
//	public static List<String> getWindowHandles(WebDriver driver ) {
//		List<String> handles = null;
//		try {
//			handles = new ArrayList<>(driver.getWindowHandles());
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//
//		return handles;
//	}
//
//	public static List<Object>/*Map<List<String>, HashMap<List<Integer>, List<String>>>*/ getList() {
//		List<Object> li = new ArrayList<>();
//		List<String> title = new ArrayList<String>();
//		title.add("Hitesh");
//		title.add("Bhardwaj");
//		title.add("Sharma");
//
//		li.add(title);
//
//		List<Integer> number = new ArrayList<Integer>();
//		number.add(1);
//		number.add(10);
//		number.add(5);
//
//		li.add(number);
//
//		List<String> str = new ArrayList<String>();
//		str.add("Sign");
//		str.add("Tag");
//		str.add("Sign with hole");
//
//		li.add(str);
//
//		
//		/*HashMap<String, Integer> plantquantity = new HashMap<>();
//		plantquantity.put("Hitesh", 12);
//		plantquantity.put("bhardwaj", 123);
//		
//		HashMap<String, String> plantsign = new HashMap<>();
//		plantsign.put("Hitesh", "sign");
//		plantsign.put("bhardwaj", "tag");
//		
//		li.add(plantquantity);
//		li.add(plantsign);*/
//		
//
//		HashMap<List<String>, List<Integer>> planttitlewithquantity = new HashMap<>();
//		planttitlewithquantity.put(title, number);
//		HashMap<List<String>, List<String>> planttitlewithsign = new HashMap<>();
//		planttitlewithsign.put(title, str);
//
//		li.add(planttitlewithquantity);
//		li.add(planttitlewithsign);
//
//		return li;
//	}

	public static int getRandomInteger(int maxRange) { // ##U
		int result = 0;
		try {
			Random t = new Random();
			result = t.nextInt(maxRange);
		} catch (Exception e) {
		}
		return result;
	}

//	public static Map<String, Float> getAdditionalTagWithPrice() {
//		HashMap<String, Float> list = new HashMap<>();
//		try {
//			list.put("Black Aluminum Stack", 6.25f);
//			list.put("Stack", 4.50f);
//			list.put("Tree Hardware", 1.50f);
//		}catch(Exception e) {
//
//		}
//
//		return list;
//	}
//	
//	public static String getRandomData() {
//		String result = null;
//		try {
//			result = "" + System.currentTimeMillis();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return result;
//	}
//	
//	public static String getRandomString() {
//		String finalValue = null;
//		try {
//			String result = getRandomData();
//			char[] ch = result.toCharArray();
//			finalValue = "";
//			for (char c : ch) {
//				int temp = 97 + Character.getNumericValue(c);
//				finalValue = finalValue.concat(Character.toString((char) temp));
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return finalValue;
//	}
	
	public static int getRandomIntegerBtRange(int minRange, int maxRange) { // ##U
		int result = 0;
		try {
			Random t = new Random();
			result = t.nextInt(maxRange - minRange) + minRange;
		} catch (Exception e) {
		}
		return result;
	}


	public static void main(String args[]) throws InterruptedException {
		/*	String str = "100 %                                                                                                             "
				+ "Complete";
		System.out.println(str);
		System.out.println(str.substring(0, str.indexOf('C')));*/
//		
//		List<Object> data = getList();
//		
//		HashMap<List<String>, List<Integer>> titleWithQuantity = (HashMap<List<String>, List<Integer>>) data.get(0);
//		System.out.println(titleWithQuantity.get("Hitesh"));
		
//		HashMap<String, Integer> list = new HashMap<>();
//		list.put("hitesh", null);
//		list.put("bhardwaj", null);
//		System.out.println(list);
		
//		String str = " Subtotal : $12.25 ";  
//		System.out.println(str.substring(str.indexOf('$')+1, str.length())+"hite");
//		System.out.println(str.trim());
//		String strTrim = str.trim();
//		System.out.println(strTrim.substring(strTrim.indexOf('$')+1, strTrim.length())+"hite");
		//System.out.println(str.substring(str.indexOf('$')+1, str.length()).replace(" ", "")+"hite");
		
		for (int i = 0; i < 500; i++) {
			System.err.println(getRandomIntegerBtRange(100, 6000));
		}
	}

}
