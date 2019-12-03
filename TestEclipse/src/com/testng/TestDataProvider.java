package com.testng;

import org.testng.annotations.Test;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class TestDataProvider {

	/*
	 * @Test(dataProvider = "tett", dataProviderClass=Data.class) public void
	 * testData(Integer aa, String name) { System.out.println("Integer Value.."
	 * +aa+" Name Value..."+name); }
	 */

	/*
	 * @Test(dataProvider="Test") public void testDataProvider(String name,
	 * String address) {
	 * System.out.println("Name.."+name+"\n"+"Address.."+address); }
	 * 
	 * 
	 * @DataProvider(name="Test") public Object[][] dataProvider() { return new
	 * Object[][] { {"Hitesh", "Noida"}, {"Rahul", "Ghaziabad"} }; }
	 */

	@DataProvider() // (name = "testing")
	public Object[][] dp() {
		return new Object[][] { new Object[] { 1, "SameClass" }, new Object[] { 2, "Tester" }, };
	}

	@Test(dataProvider = "dp")
	public void testIntegerValue(int number, String name) {
		System.out.println("Integer Value.." + number + "abdajkbdaiksdhahsdaioskhd" + name);
	}

	// @Test(dataProvider = "TestDataDifferent")
	// public void testIntegerValue(int number) {
	// System.out.println("Integer Value.." + number);
	// }

	// @Test(dataProvider = "TestDataDifferent")
	// public void testStringValue(String number) {
	// System.out.println("String Value.." + number);
	// }
	//
	@DataProvider(name = "TestDataDifferent")
	public Object[][] testDataWithDifferent(Method m) {
		Object[][] object = null;
		if (m.getName().equalsIgnoreCase("testStringValue")) {
			object = new Object[][] { { "Name" }, { "Address" } };
		} else if (m.getName().equalsIgnoreCase("testIntegerValue")) {
			object = new Object[][] { { 1 }, { 2 } };
		}

		return object;
	}
}
