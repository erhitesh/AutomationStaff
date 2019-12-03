package testSelenium;

import java.net.URL;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDropDown {
	
	public static void main(String args[]) {
		WebDriver driver = null;
		System.setProperty("webdriver.gecko.driver", "C:\\Automation_Data\\jar\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Automation_Data\\jar\\chromedriver_win32\\chromedriver.exe");
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		cap.setCapability(CapabilityType.BROWSER_VERSION, "59.0.1");
		//cap.setCapability("marionette", true);
		try {
			driver = new RemoteWebDriver(new URL("http://localhost:5566/wd/hub"), cap);
			driver.get("https://www.facebook.com/");
			Thread.sleep(10000);
			WebElement fname = driver.findElement(By.name("firstname"));
			fname.click();
			fname.sendKeys("ACT");
			
			// Last Name
			WebElement sname = driver.findElement(By.name("lastname"));
			sname.click();
			sname.sendKeys("kiwi");
			// Mobile 
			WebElement mobile = driver.findElement(By.name("reg_email__"));
			mobile.sendKeys("1234567890");
			// password
			WebElement password = driver.findElement(By.name("reg_passwd__"));
			password.sendKeys("qewqwerew");
			//gendar
			Random random = new Random();
			int number = random.nextInt(2);
			WebElement sex = driver.findElement(By.xpath("(//input[@name='sex'])["+number+"]"));
			sex.click();
			
			
			WebElement element = driver.findElement(By.id("user_date_of_birth_2i"));
			Select select = new Select(element);
			System.out.println("Month Values..."+select.getOptions().get(1).getText());
			select.selectByIndex(2);
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
