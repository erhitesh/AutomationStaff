package com.test.Websites;

import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestWeb {

	static WebDriver driver;

//	@BeforeClass
//	public void setUp() {
//		System.setProperty("webdriver.chrome.driver",
//				"/Users/kiwitech/Desktop/Automation/chromedriver/LatestChromeDriver");
//		driver = new ChromeDriver();
//		Toolkit tool = Toolkit.getDefaultToolkit();
//		int height = (int )tool.getScreenSize().getHeight();
//		int width = (int )tool.getScreenSize().getWidth();
//		driver.manage().window().setSize(new Dimension(width, height));
//		driver.manage().window().maximize();
//		driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
//		
//
//	}
//
//	@Test(enabled=false)
//	public void testWeb() {
//		try {
//			List<WebElement> trs = driver.findElements(By.xpath("//tbody//tr"));
//			for (int i = 0; i < trs.size(); i++) {
//				List<WebElement> tds = trs.get(0).findElements(By.xpath("//td"));
//				for (int j = 0; j < tds.size(); j++) {
//					if (tds.get(j).getText().equalsIgnoreCase("Dubai")) {
//						System.out.println(tds.get(j).getText()+"\n"+tds.indexOf(tds.get(j).getText()));
//						break;
//					}
//				}
//			}
//		} catch (Exception e) {
//
//		}
//
//	}
//	
	@Test
	public void testWeb1() {
		try {
//			List<String> listBefore = new ArrayList<>(driver.getWindowHandles());
//			System.out.println("Window handles...."+listBefore.size());
//			WebElement element = driver.findElement(By.id("button1"));
//			element.click();
//			Thread.sleep(2000);
//			List<String> listAfter = new ArrayList<>(driver.getWindowHandles());
//			System.out.println("Window handles...."+listAfter.size());
			
			
			System.setProperty("webdriver.chrome.driver",
					"/Users/kiwitech/Desktop/Automation/chromedriver/LatestChromeDriver");
			driver = new ChromeDriver();
			Toolkit tool = Toolkit.getDefaultToolkit();
			int height = (int )tool.getScreenSize().getHeight();
			int width = (int )tool.getScreenSize().getWidth();
			driver.manage().window().setSize(new Dimension(width, height));
			driver.manage().window().maximize();
			driver.get("http://demo.guru99.com/selenium/upload/");
			RemoteWebElement element = (RemoteWebElement)driver.findElement(By.id("uploadfile_0"));
			String imageLoca = "/Users/kiwitech/Desktop/Automation/TestEclipse/src/com/test/Websites/Doctor1.jpg";
			
			element.setFileDetector(new LocalFileDetector());
			element.sendKeys(imageLoca);
			element.click();
			Thread.sleep(2000);
			int index = 1;
			System.out.println("Xpath..."+By.xpath("//select[starts-with(@id,'disease"+index+"')]"));
			
		}catch(Exception e) {
			
		}
	}

//	@AfterClass
//	public void tearDown() {
//		if (driver != null)
//			driver.close();
//	}
//	
//	public static List<String> getWindowHandles() {
//		List<String> list = new ArrayList<>();
//		try {
//			list = new ArrayList<>(driver.getWindowHandles());
//		}catch(Exception e) {
//			
//		}
//		
//		return list;
//	}
//	
//	public static void switchWindowHandles(int handle) {
//		try {
//			List<String> listBefore = getWindowHandles();
//			driver.switchTo().window(listBefore.get(handle));
//		}catch(Exception e) {
//			
//		}
//	}
//	
//	public static void main(String args[]) {
//
//		try {
//			
//			System.setProperty("webdriver.chrome.driver",
//					"/Users/kiwitech/Desktop/Automation/chromedriver/LatestChromeDriver");
//			driver = new ChromeDriver();
//			Toolkit tool = Toolkit.getDefaultToolkit();
//			int height = (int )tool.getScreenSize().getHeight();
//			int width = (int )tool.getScreenSize().getWidth();
//			driver.manage().window().setSize(new Dimension(width, height));
//			driver.manage().window().maximize();
//			driver.get("http://demo.guru99.com/selenium/upload/");
//			RemoteWebElement element = (RemoteWebElement)driver.findElement(By.id("uploadfile_0"));
//			String imageLoca = "";
//			
//			element.setFileDetector(new LocalFileDetector());
//			element.sendKeys(imageLoca);
//			element.click();
//			Thread.sleep(2000);
//		
//		}catch(Exception e) {
//			
//		}
//	}

	@AfterMethod
	public void takeScreenShot(ITestResult result) {
		if (ITestResult.SUCCESS == result.getStatus()) {
			
			File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(file, new File("/Users/kiwitech/Desktop/Automation/TestEclipse/Screen/"+result.getMethod().getMethodName()+".png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
