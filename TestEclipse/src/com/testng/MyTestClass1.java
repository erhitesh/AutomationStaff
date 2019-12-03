package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class MyTestClass1 extends TestAnnotations {
//	@Parameters({"writer","date"})
//	@Test
//	public void myTestMethod1(String writer1, String date1) {
//		System.out.println("myTestMethod1"+" <...writerName...> "+writer1+" Date value..."+date1);
//	}

	private WebDriver driver;
	String firefoxDriverLocation = "C:\\Automation_Data\\jar\\geckodriver-v0.19.1-win64\\geckodriver.exe";
	
	@Test
	public void myTestMethod1() {
		System.setProperty("webdriver.gecko.driver", firefoxDriverLocation);
		driver = new FirefoxDriver();
		driver.get("https://google.co.in");
		System.out.println("Title.."+driver.getTitle());
	}
	
	@Test
	public void myTestMethod2() {
		System.setProperty("webdriver.gecko.driver", firefoxDriverLocation);
		driver = new FirefoxDriver();
		driver.get("https://google.co.in");
		System.out.println("Current Url.."+driver.getCurrentUrl());
	}
	
	@Test
	public void myTestMethod3() {
		System.setProperty("webdriver.gecko.driver", firefoxDriverLocation);
		driver = new FirefoxDriver();
		driver.get("https://google.co.in");
	}
	
	@Test
	public void myTestMethod4() {
		System.setProperty("webdriver.gecko.driver", firefoxDriverLocation);
		driver = new FirefoxDriver();
		driver.get("https://google.co.in");
		System.out.println("Page Source.."+driver.getPageSource());
	}
	
	@Test
	public void myTestMethod5() {
		System.setProperty("webdriver.gecko.driver", firefoxDriverLocation);
		driver = new FirefoxDriver();
		driver.get("https://google.co.in");
		System.out.println("Anchor Tage Lists.."+driver.findElements(By.tagName("a")).size());
	}
	
	@Test
	public void myTestMethod6() {
		System.setProperty("webdriver.gecko.driver", firefoxDriverLocation);
		driver = new FirefoxDriver();
		driver.get("https://google.co.in");
		System.out.println("H1 Header Tage Lists.."+driver.findElements(By.tagName("h1")).size());
	}
}
