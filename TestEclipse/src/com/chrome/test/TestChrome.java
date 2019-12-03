package com.chrome.test;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestChrome {

	static WebDriver driver;

	public static void main(String args[]) {
		WebElement element;
		try {
			System.setProperty("webdriver.chrome.driver",
					"/Users/kiwitech/Desktop/Automation/chromedriver/chromedriver");
			ChromeOptions options = new ChromeOptions();
			/*options.addArguments("disable-infobars");
			options.addArguments("start-fullscreen");
			options.addArguments("--kiosk");
			for windows("--start-maximized");*/
			options.addArguments("--test-type");
			driver = new RemoteWebDriver(new URL("http://localhost:5566/wd/hub"), DesiredCapabilities.chrome());
			driver.get("http://google.com");
			System.out.println("Hello Tester....");
			element = driver.findElement(By.id("hplogo"));
			System.out.println(element.getAttribute("title") + "<<<<Style... " + element.getAttribute("style")
					+ "<<<<BackGround Color.." + element.getCssValue("background-color") + "<<<<Color"
					+ element.getCssValue("color"));
			driver.close();
//			driver = new HtmlUnitDriver();
//			driver.get("http://google.com");
//			System.out.println("Hello Tester....");
//			element = driver.findElement(By.id("hplogo"));
//			System.out.println(element.getAttribute("title") + "<<<<Style... " + element.getAttribute("style")
//					+ "<<<<BackGround Color.." + element.getCssValue("background-color") + "<<<<Color"
//					+ element.getCssValue("color"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
