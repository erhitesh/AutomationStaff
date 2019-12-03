package com.test.string;

import java.util.ArrayList;
import java.util.List;

public class SubString {
	public static String getTextFromPara() {
		String txt = "";
		String para = "When setting up your account, you must enter the registration code iLnXj8 on the same screen where you enter your name and birthdate. Without entering this code you won't be able to access the app, so don't forget!";
		txt = para.substring(para.indexOf("code ")+5, para.indexOf(" on"));
		return txt;
	}
	
	public static String getText() {
		String txt = "";
		String para = "Please log in to your app and visit the payments section of Settings. Enter the following registration code 2bbaP3, and your accounts will be linked. Once complete, you'll only be charged for a single account! You'll also be a part of each other's Health Tribe, and can help one another better manage all aspects of your health. ";

		txt = para.substring(para.indexOf("code ")+5, para.indexOf(","));
		return txt;
	}
	
	public static void countSpaces() {
		String name = "Hi Hello adnasd";
		System.out.println(name.length() - name.replaceAll(" " , "").length());
	}
	
	public static void SpaceIndex() {
		String name = "Hi Hello adnasd";
//		for (int i = 0; i < name.length(); i++) {
//			
//		}
		System.out.println("Index value..."+name.indexOf(" "));
	}
	
	public static String getDoctorMiddleName(String doctorName) {
		String middleName = "";
		try {
			if (doctorName.contains(" ")) {
				middleName = doctorName.substring(doctorName.indexOf(" ") + 1, doctorName.length());
				if (middleName.contains(" "))
					middleName = middleName.substring(0, middleName.indexOf(" "));
			}
		} catch (Exception e) {
		}
		return middleName;
	}
	
	public static List<String> checkContainsMethod() {
		List<String> list1 = new ArrayList<>();
		list1.add(getDoctorMiddleName("Dr. CYNTHIA DEKLOTZ"));
		list1.add(getDoctorMiddleName("Dr. Sharma DEKLOTZ"));
		list1.add(getDoctorMiddleName("Dr. Bhardwaj DEKLOTZ"));
		list1.add(getDoctorMiddleName("Dr. Hitesh DEKLOTZ"));

		return list1;
	}
	
	public static void main(String args[]) {
/*		String name = "Prescriber: Dr Bwellbfaajhbaehdea Doctor";
		name = name.substring(name.indexOf(":")+1, name.length());
		System.out.println("Dr Bwellbfacjfcjaidjj Doctor".toLowerCase().contains("bwellbfacjfcjaidjj"));
		System.out.println("Text..."+"\n"+getTextFromPara()+".."+"hi");*/
		/*String para = "hello,hitesh,bhardwaj";
		List<String> info = new ArrayList<>();
		info = Arrays.asList(para.split(","));
		para = info.get(new Random().nextInt(info.size()));
		System.out.println(para);*/
//		
//		String date = "10/12/2017";
//		String valueFor = "";
//		valueFor = date.substring(date.indexOf("/")+1, date.indexOf("/")+3);
//		System.out.println("Value.."+valueFor);
		
		System.out.println(getTextFromPara().length());

	}

}
