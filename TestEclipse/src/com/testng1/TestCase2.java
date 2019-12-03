package com.testng1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase2 {
	private static final WebElement element = null;
	WebDriver driver;
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suitw");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suitw");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before test");
	}

	@AfterTest
	public void afterTEst() {
		System.out.println("After Test");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Classs");
	}

	
	@BeforeMethod
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation_Data\\jar\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//div[@class='desktop-userIconsContainer']"));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		WebElement element1 = driver.findElement(By.xpath("//a[text()='login']"));
		action.moveToElement(element1);
		action.click();
		action.perform();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sunny123.tyagi@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("paradise");
		driver.findElement(By.xpath("//button[@class='login-login-button']")).click();
	}

	@Test
	public void booking() {
		List<WebElement> list = driver.findElements(By.name(""));
		WebElement searchBar = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		searchBar.click();
		searchBar.sendKeys("Condom");
//	   driver.findElement(By.xpath("//img[@alt ='Timberland Men Tan Brown AF 6IN PREM Solid Leather High-Top Flat Boots']")).click();
//	   driver.findElement(By.xpath("//p[text()='9.5']")).click();
//	   driver.findElement(By.xpath("//button[@class='pdp-add-to-bag pdp-button']")).click();
//	   driver.findElement(By.xpath("//a[@class='pdp-goToCart pdp-add-to-bag pdp-button']")).click();

	}

	@AfterMethod
	public void testcaseStatus(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			System.out.println("Taks Screenshot.....");
		}
	}

	@AfterTest
	public void closebrowser() {
		//driver.quit();
	}
}
