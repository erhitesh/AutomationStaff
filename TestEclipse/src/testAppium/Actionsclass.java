package testAppium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Actionsclass {

	static WebDriver driver;

	public static void main(String aths[]) throws MalformedURLException, InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/kiwitech/Desktop/Automation/firefoxdata/geckodriver");
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:5566/wd/hub"), DesiredCapabilities.firefox());
		driver.get("https://accounts.google.com/signup");
		// Element definitions for FirstName and LastName
		WebElement txtFName = driver.findElement(By.id("FirstName"));
		WebElement txtLName = driver.findElement(By.id("LastName"));
		txtFName.sendKeys("webdriver");
		// Create an object for Actions Class
		Actions a = new Actions(driver);
		// select the value which is typed in FirstName field
		a.sendKeys(txtFName, Keys.chord(Keys.COMMAND, "a"));
		// Performing copy action using CTRl+C
		Thread.sleep(2000);
		a.sendKeys(Keys.COMMAND, "c");
		
		Thread.sleep(2000);
		// Performing paste action using CTRL+V in LastName field
		txtLName.click();
		a.sendKeys(txtLName,Keys.COMMAND, "v").build().perform();
		Thread.sleep(2000);
		

//		System.out.println("Message...."+((JavascriptExecutor)driver).executeScript("return document.getElementById('FirstName').value;"));
//		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
//		StringSelection str = new StringSelection((String)((JavascriptExecutor)driver).executeScript("return document.getElementById('FirstName').value;"));
//		clipboard.setContents(str, null );
//		
//		txtLName.click();
//		txtLName.sendKeys(Keys.chord(Keys.COMMAND, "v"));
	}
}
