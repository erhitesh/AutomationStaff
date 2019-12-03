package testSelenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GridHubNodePro {
	
	WebDriver driver;
	
	@BeforeMethod
	//@Parameters({"browsername"})
	public void setUp(/*String browserName*/) throws MalformedURLException {
		driver = new RemoteWebDriver(new URL("http://localhost:5566/wd/hub"), DesiredCapabilities.firefox());
//		if (browserName.equalsIgnoreCase("firefox"))
//			driver = new FirefoxDriver();
//		else if (browserName.equalsIgnoreCase("chrome")) {
//			System.setProperty("webdriver.chrome.driver", "");
//		}
	}
	
	@Test
	public void test1() {
		driver.get("http://google.com");
	}
	
	@Test
	public void test2() {
		driver.get("http://facebook.com");
	}
	

}
