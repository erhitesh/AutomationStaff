package testSelenium;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebDriverTest {
	
	public static void main(String args[]) throws InterruptedException {
		WebDriver driver = null;
		try {
			System.setProperty("webdriver.gecko.driver", "C:\\Automation_Data\\jar\\geckodriver-v0.19.1-win64\\geckodriver.exe");
			DesiredCapabilities capability = DesiredCapabilities.firefox();
			//capability.setCapability("marionette", true);
//			HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
//			chromePrefs.put("profile.default_content_settings.popups", 0);
//			ChromeOptions options = new ChromeOptions();
//			options.setExperimentalOption("prefs", chromePrefs);
//			System.setProperty("webdriver.chrome.driver",
//					"/Users/kiwitech/Desktop/Automation/chromedriver/chromedriver3");
			driver = new RemoteWebDriver(new URL("http://127.0.0.1:5566/wd/hub"), capability);
		} catch (Exception e) {
			//e.printStackTrace();
		}
		driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
//		Point point = driver.findElement(By.xpath("//a[text()='Men']")).getLocation();
//		System.out.println("X.."+point.getX()+"\n"+"Y.."+point.getY());
//		Dimension dimension = driver.findElement(By.xpath("//a[text()='Men']")).getSize();
//		System.out.println("Width.."+dimension.getWidth()+"\n"+"Height.."+dimension.getHeight());
		driver.manage().window().fullscreen();
		/*
		 * String jquery = "'#hplogo'"; ((JavascriptExecutor)
		 * driver).executeScript("$('pane1').hide(300);"); boolean title =
		 * (boolean) ((JavascriptExecutor)driver).executeScript(
		 * "return jQuery.active;");//( "return window.jQuery("
		 * +jquery+").getAttribute('title');"); System.out.println("Title :"
		 * +title);
		 */

//		List<WebElement> rows = driver.findElements(By.id("sdlms"));
//		for (int i = 0 ; i < rows.size(); i++) {
//			List<WebElement> columns = rows.get(i).findElements(By.id("dsd"));
//			for (int j = 0; j < columns.size(); j++) {
//				if (columns.get(j).getAttribute("title").equalsIgnoreCase("Diwali") ||columns.get(j).getAttribute("title").equalsIgnoreCase("Holi") ) {
//					System.out.println("It's a holiday");
//				}
//			}
//		}
	
		
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.xpath("//button[text()='Confirm Pop up']"));
		System.out.println("Display..."+element.isDisplayed()+"\n"+"Enabled..."+element.isEnabled());
		element.click();
		Thread.sleep(5000);
		driver.quit();
	}

}
