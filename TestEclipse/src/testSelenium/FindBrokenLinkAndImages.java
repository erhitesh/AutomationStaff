package testSelenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;


public class FindBrokenLinkAndImages {

	static WebDriver driver = null;

	public static String isLinkBroken(String linkUrl) {
		String response = "";
		try {
			URL url = new URL(linkUrl);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setConnectTimeout(3000);
			connection.connect();
			if (connection.getResponseCode() == 200)
				System.out.println("Response Code For valid Tag & Image Src.." + connection.getResponseMessage());
			else if (connection.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND)
				System.out.println("Invalid.."+
						linkUrl + " - " + connection.getResponseMessage() + " - " + HttpURLConnection.HTTP_NOT_FOUND);
			connection.disconnect();
		} catch (IOException e) {
		}
		return response;
	}

	public static List<WebElement> getAnchorAndImgList() {
		List<WebElement> linkList = new ArrayList<>();
		try {
			linkList = driver.findElements(By.tagName("a"));
			//linkList.addAll(driver.findElements(By.tagName("img")));
		} catch (Exception e) {}

		return linkList;
	}

	@Test
	public void findBrokenLinks() {
		LoggingPreferences logPreferences = new LoggingPreferences();
		logPreferences.enable(LogType.BROWSER, Level.OFF);
		logPreferences.enable(LogType.CLIENT, Level.OFF);
		logPreferences.enable(LogType.DRIVER, Level.OFF);
		logPreferences.enable(LogType.PERFORMANCE, Level.OFF);
		logPreferences.enable(LogType.PROFILER, Level.OFF);
		logPreferences.enable(LogType.SERVER, Level.OFF);
		System.setProperty("webdriver.gecko.driver", "/Users/kiwitech/Desktop/Automation/firefoxdata/geckodriver");
		//System.setProperty("webdriver.chrome.driver", "/Users/kiwitech/Desktop/Automation/chromedriver/chromedriverlatest");
		DesiredCapabilities cap = DesiredCapabilities.firefox();

//		cap.setCapability("marionette", true);
		cap.setCapability(CapabilityType.LOGGING_PREFS, logPreferences);
		try {
			driver = new RemoteWebDriver(new URL("http://127.0.0.1:5566/wd/hub"), cap);
			driver.manage().deleteAllCookies();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		System.out.println("Chrome Driver Loading......");
		driver.get("https://myntra.com");
		System.out.println("No Of Links are..." + getAnchorAndImgList().size());
		List<WebElement> linksList = getAnchorAndImgList();
		for (int i = 0; i < linksList.size(); i++) {
			String url = linksList.get(i).getAttribute("href");
			isLinkBroken(url);
		}
	}

}
