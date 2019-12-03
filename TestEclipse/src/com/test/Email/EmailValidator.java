package com.test.Email;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {

	private static Pattern pattern;
	private static Matcher matcher;
	private static String emailPatternRegex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	public static boolean mailValidator(String userMailId) {
		boolean mailStatus = false;
		try {
			pattern = Pattern.compile(emailPatternRegex);
			matcher = pattern.matcher(userMailId);
			mailStatus = matcher.matches();
		}catch(Exception e) {}
		
		return mailStatus;
	}
	
	public static void main(String args[]) {
		System.out.println(mailValidator("-hitesh@gmail.com"));
	}

}
