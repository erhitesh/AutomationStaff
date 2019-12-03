package com.test.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionTest {

	/* Global Variable Declaration */
	static Pattern pattern;
	static Matcher match;
	static String regexExpression = "";
	static String strMsg = "";


	/**
	 * This method is used to verify either enter message is valid or not.
	 * @param regexExpression : String type regular expression to test the given string.
	 * @param strMsg : String type
	 * @return : return the boolean value either true or false.
	 */
	public static boolean testRegularExpression(String regexExpression, String strMsg){
		boolean status = false;

		pattern = Pattern.compile(regexExpression);
		match = pattern.matcher(strMsg);
		status = match.matches();

		return status;
	}


	public static boolean testMobileNumber(){
		regexExpression = "(0|91)?[7-9][0-9]{9}";
		strMsg = "08956236541";

		return testRegularExpression(regexExpression, strMsg);
	}


	public static boolean testPinCode(){
		regexExpression = "[0-9]{6}";
		strMsg = "000001";

		return testRegularExpression(regexExpression, strMsg);
	}

	public static boolean testEmailId(String emailId){
		boolean status = false;
		regexExpression = "[a-zA-z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-z]+)+";
		//strMsg = "1234_bhardwaj.hitesh2@gmail.com";
		strMsg = emailId;
		status = testRegularExpression(regexExpression, strMsg);
		if (status){
			System.out.println("Email Id is valid Id...>"+strMsg);
		}
		else {
			System.out.println("Email Id is not valid Id.");
		}

		return status;
	}
	
	public static void getIdFromValue(String value) {
		regexExpression = "";
		strMsg = value;
		String msf = Pattern.compile(regexExpression).matcher(strMsg).group();
		System.out.println(msf);
	}

	public static void main(String args[]) {
//		System.err.println("Enter Email Id....");
//		String emailId = "";
//		try {
//			emailId = new BufferedReader(new InputStreamReader(System.in)).readLine().toString();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		System.out.println(testEmailId(emailId));
		getIdFromValue("id: 5968a6b5ed7f8f5182ead102");
	}
}
