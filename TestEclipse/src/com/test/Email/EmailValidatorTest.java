package com.test.Email;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmailValidatorTest {

	private EmailValidator emailValidator;

	@DataProvider
	public Object[][] ValidEmailProvider() {
		return new Object[][] { { new String[] { "mkyong@yahoo.com",
			"mkyong-100@yahoo.com", "mkyong.100@yahoo.com",
			"mkyong111@mkyong.com", "mkyong-100@mkyong.net",
			"mkyong.100@mkyong.com.au", "mkyong@1.com",
			"mkyong@gmail.com.com", "mkyong+100@gmail.com",
			"mkyong-100@yahoo-test.com" } } };
	}

	@DataProvider
	public Object[][] InvalidEmailProvider() {
		return new Object[][] { { new String[] { "qatest@yopmail.", "mkyong", "mkyong@.com.my",
			"mkyong123@gmail.a", "mkyong123@.com", "mkyong123@.com.com",
			".mkyong@mkyong.com", "mkyong()*@gmail.com", "mkyong@%*.com",
			"mkyong..2002@gmail.com", "mkyong.@gmail.com",
			"mkyong@mkyong@gmail.com", "mkyong@gmail.com.1a" } } };
	}

	// DataProvider With Method Specific.
	@DataProvider(name="DataSetForValidEmailFormat")
	public Object[][] DataForEmailValidation(Method methodName) {
		Object[][] obj = null;
		if (methodName.equals("ValidEmailTest"))
			obj = ValidEmailProvider();
		else
			obj = InvalidEmailProvider();
		return obj;
	}
	
	@Test(dataProvider = "ValidEmailProvider", dependsOnMethods="testEmailValidation")
	public void ValidEmailTest(String[] Email) {
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< Valid Mail Validation Test >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		for (String temp : Email) {
			boolean valid = EmailValidator.mailValidator(temp);
			System.out.println("Email is valid : " + temp + " , " + valid);
			Assert.assertEquals(valid, true);
		}
	}

	@Test(dataProvider = "InvalidEmailProvider", dependsOnMethods = "ValidEmailTest")
	public void InValidEmailTest(String[] Email) {
		for (String temp : Email) {
			boolean valid = EmailValidator.mailValidator(temp);
			System.out.println("Email is valid : " + temp + " , " + valid);
			Assert.assertEquals(valid, false);
		}
	}
	
	@Test(dataProvider="DataSetForValidEmailFormat")
	public void testEmailValidation(String emailList[]) {
		for (String string : emailList) {
			boolean status = EmailValidator.mailValidator(string);
			System.out.println("Email "+string+" Status..."+status);
		}
	}
	
}
