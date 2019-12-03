package com.test.Websites;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Screenshot {

	private static Screenshot obj;

	private Screenshot() {

	}

	public static Screenshot getInstance() {
		if (obj == null)
			obj = new Screenshot();
		return obj;
	}

	WebDriver driver;

	@Test(priority = 1)
	public void testScreenShot1() {
		System.setProperty("webdriver.gecko.driver", "/Users/kiwitech/Desktop/Automation/firefoxdata/geckodriver");
		driver = new FirefoxDriver();
		driver.get("http://google.co.in");
		System.out.println("Ok");

	}

	@Test
	public void testScreenShot2() {
		Assert.assertEquals(true, false);
	}

	@Test(dependsOnMethods = "testScreenShot2")
	public void testScreenShot3() {
		driver = new FirefoxDriver();
		driver.get("http://google.co.in");
		System.out.println("Ok");

	}

	public void takesScreenShot(ITestResult result) {
		String locationOfScreenshot = "";
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		if (ITestResult.SUCCESS == result.getStatus())
			locationOfScreenshot = "Pass";
		else if (ITestResult.FAILURE == result.getStatus())
			locationOfScreenshot = "Fail";
		else if (ITestResult.SKIP == result.getStatus())
			locationOfScreenshot = "Skip";
		try {
			FileUtils.copyFile(file, new File("/Users/kiwitech/Desktop/Automation/TestEclipse/Screen/"
					+ locationOfScreenshot + "/" + result.getMethod().getMethodName()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@AfterMethod
	public void tearDown(ITestResult result) {
		takesScreenShot(result);
	}
}
