package testSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsOpe {
	
	public void waitForceFully(int timeOutsInSeconds) {
		try {
			Thread.sleep(timeOutsInSeconds);
		}catch(Exception e) {
		}	
	}
	
	@Test
	public void rightClick() throws InterruptedException {
     System.setProperty("webdriver.gecko.driver", "C:\\Automation_Data\\jar\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver", "/Users/kiwitech/Desktop/Automation/chromedriver/chromedriverlatest");
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
        driver.get("https://myntra.com/");
        WebElement R1= driver.findElement(By.xpath("//a[@data-group='women']"));
        Actions builder = new Actions(driver);
        builder.moveToElement(R1);
        waitForceFully(5);
        builder.contextClick(R1).sendKeys(Keys.DOWN);
        builder.contextClick(R1).sendKeys(Keys.DOWN);
        builder.sendKeys(Keys.ENTER);
        waitForceFully(2);
        builder.build().perform();
        waitForceFully(2);
        System.out.println("Window Handle..."+driver.getWindowHandles().size());
	}

}
