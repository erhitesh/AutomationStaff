package testSelenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DifferentWaysToRefreshWebPage {

	WebDriver driver;
	
	@Test
	public void testRefreshWays() {
		try {
			System.setProperty("webdriver.chrome.driver",
					"/Users/kiwitech/Desktop/Automation/chromedriver/chromedriver3");
			driver = new ChromeDriver();
			driver.get("http://google.co.in");
			Thread.sleep(5000);
			
/*			//Refresh by navigate refresh method
			driver.navigate().refresh();
			Thread.sleep(5000);*/
			
/*			// refresh page by navigate to method
			driver.navigate().to(driver.getCurrentUrl());
			Thread.sleep(5000);*/
			
/*			//refresh page get method
			driver.get(driver.getCurrentUrl());
			Thread.sleep(5000);*/
			
/*			//refresh page by sendKeys method
			driver.findElement(By.id("lst-ib")).sendKeys(Keys.F5);
			Thread.sleep(5000);*/
			
			// by javascript
			((JavascriptExecutor)driver).executeScript("history.go(0)");
			driver.quit();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
