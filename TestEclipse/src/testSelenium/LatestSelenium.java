package testSelenium;


import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LatestSelenium {
	
	public static void analyzeLogs(WebDriver driver) {
		for (LogEntry entries : driver.manage().logs().get(LogType.DRIVER).getAll())
			System.out.println("Entries..."+entries);
	}
	
	public static void main(String args[]) {
		WebDriver driver = null;
		DesiredCapabilities capability = null;
		ChromeOptions options = null;
		try {
			if (args[0].equalsIgnoreCase("ff")) {
				capability = DesiredCapabilities.firefox();
			}else if(args[0].equalsIgnoreCase("ch")) {
				capability = DesiredCapabilities.chrome();
				capability.setCapability(CapabilityType.PLATFORM, Platform.MAC);
				LoggingPreferences logPrefs = new LoggingPreferences();
			    logPrefs.enable(LogType.DRIVER, Level.OFF);
			    capability.setCapability(CapabilityType.LOGGING_PREFS, logPrefs);
				options = new ChromeOptions();
				options.addArguments("disable-infobars");
				capability.setCapability(ChromeOptions.CAPABILITY, options);
			}
			driver = new RemoteWebDriver(new URL("http://127.0.0.1:5566/wd/hub"), capability);
//			HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
//			chromePrefs.put("profile.default_content_settings.popups", 0);
//			ChromeOptions options = new ChromeOptions();
//			options.setExperimentalOption("prefs", chromePrefs);
		} catch (Exception e) {}
		System.out.println(driver.manage().logs().getAvailableLogTypes());
		driver.get("https://google.co.in");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		WebElement element = driver.findElement(By.id("lst-ib"));
		element.sendKeys("Hitesh","Bhardwaj", "asdjaskodfj", "asndkasnf");
		analyzeLogs(driver);
		
		
		if (driver!=null)
			driver.quit();
		
//		String str = "Up to $100 off your first Meal Delivery from Jimmy's Famous Meals!";
//		System.out.println("//h3[contains(text(),\""+str+"\")]");
		//>>>>>>>>>>>>>>>>>>>>  Jquery >>>>>>>>>>.
		/*
		 * String jquery = "'#hplogo'"; ((JavascriptExecutor)
		 * driver).executeScript("$('pane1').hide(300);"); boolean title =
		 * (boolean) ((JavascriptExecutor)driver).executeScript(
		 * "return jQuery.active;");//( "return window.jQuery("
		 * +jquery+").getAttribute('title');"); System.out.println("Title :"
		 * +title);
		 */
	}
}
