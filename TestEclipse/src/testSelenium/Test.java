package testSelenium;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test {

	public static void main(String args[]) {
		try {
//			DesiredCapabilities cap = DesiredCapabilities.chrome();
//			cap.setCapability(CapabilityType.PLATFORM, Platform.WINDOWS);
			System.setProperty("webdriver.chrome.driver",
					"C:\\Automation_Data\\jar\\chromedriver_win32\\chromedriver.exe");
			System.out.println("Hello Tester");
			WebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:5566/wd/hub"),DesiredCapabilities.chrome());
			driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
			driver.manage().window().maximize();
			driver.get("http://google.com");
			System.out.println("Hello Tester");
		} catch (Exception e) {
		}
	}
}
