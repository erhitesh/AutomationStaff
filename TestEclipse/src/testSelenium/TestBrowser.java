package testSelenium;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestBrowser {
	
//	@Test
//	public void test() {
//		HashMap<String, Object> chromePref = new HashMap<>();
//		chromePref.put("", "");
//		ChromeOptions options = new ChromeOptions();
//	
//		DesiredCapabilities capability = new DesiredCapabilities();
//		capability.setCapability(ChromeOptions.CAPABILITY, chromePref);
//		ChromeDriver driver = new ChromeDriver();
//	}
	
	public static void main(String args[]) {
		WebDriver driver = null;
		System.setProperty("webdriver.gecko.driver", "C:\\Automation_Data\\jar\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		//cap.setCapability("marionette", true);
		try {
			driver = new RemoteWebDriver(new URL("http://127.0.0.1:5566/wd/hub"), cap);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		driver.get("http://google.com");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
	}

}
