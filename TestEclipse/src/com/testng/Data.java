package com.testng;

import org.testng.annotations.DataProvider;

public class Data {

	@DataProvider(name="tett")
	public static Object[][] dp() {
		return new Object[][] { { 1, "Hitesh" },
			{ 2, "bhardwaj" }};
	}
}
