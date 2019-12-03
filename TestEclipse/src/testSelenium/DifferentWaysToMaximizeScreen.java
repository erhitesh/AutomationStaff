package testSelenium;

import java.awt.Toolkit;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class DifferentWaysToMaximizeScreen {

	// Webdriver
	static WebDriver driver;

	@BeforeMethod
	public void launchBrowser() {
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Automation_Data\\jar\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.gecko.drive", "C:\\Automation_Data\\jar\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		try {
			driver = new RemoteWebDriver(new URL("http://127.0.0.1:5566/wd/hub"), cap);
			driver.get("http://google.co.in");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	}
	
	@Test (priority=0)
	public void maximizeBrowserWithToolkit() {
		try {	
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			int Width = (int) toolkit.getScreenSize().getWidth();
			int Height = (int)toolkit.getScreenSize().getHeight();
			Dimension screenResolution = new Dimension(Width,Height); 
			driver.manage().window().setSize(screenResolution);
			Thread.sleep(4000);
			System.out.println("Title.."+driver.getTitle());	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority=1)
	public void maximizeBrowserWithWebdriverKeysMethods() { 
		try {	
			driver.findElement(By.xpath("//html")).sendKeys(Keys.F11);
			Thread.sleep(5000);
			System.out.println("Title.."+driver.getTitle());	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority=2)
	public void maximizeBrowserWithWebdriverMethod() { 
		try {		
			driver.manage().window().maximize();
			Thread.sleep(5000);
			System.out.println("Title.."+driver.getTitle());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority=3)
	public void maximizeBrowserWithSetDimensionSize() { 
		try {		
			driver.manage().window().setSize(new Dimension(1024, 768));
			Thread.sleep(5000);
			System.out.println("Title.."+driver.getTitle());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
//	@Test(priority=4)
//	public void maximizeBrowserWithSetDimensionChromeOptions() { 
//		try {		
//			driver.manage().window().setSize(new Dimension(1024, 768));
//			Thread.sleep(5000);
//			System.out.println("Title.."+driver.getTitle());
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
