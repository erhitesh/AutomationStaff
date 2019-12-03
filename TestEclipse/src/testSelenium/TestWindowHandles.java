package testSelenium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestWindowHandles {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {

		System.setProperty("webdriver.chrome.driver", "/Users/kiwitech/Desktop/Automation/chromedriver/chromedriverlatest");
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:5566/wd/hub"), DesiredCapabilities.chrome());
		driver.manage().window().maximize();
		driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);

		// window handle value of original window
		String orginalHandle = driver.getWindowHandle();
		System.out.println("The orginal window handle value is -  " + orginalHandle);

		// open new window
		WebElement newMessageWindow = driver.findElement(By.xpath("//button[contains(text(),'New Message Window')]"));
		Point point = newMessageWindow.getLocation();
		Dimension dim = newMessageWindow.getSize();
		driver.manage().window().setSize(new Dimension(dim.getHeight(), dim.getWidth()));
		newMessageWindow.click();
		Thread.sleep(2000);

		// Set<String> handlesName = driver.getWindowHandles();
		// System.out.println("Total window handles are - " +handlesName);

		List<String> handles = new ArrayList<>(driver.getWindowHandles());
		System.out.println("handles count..."+handles.size());
		
		driver.switchTo().window(handles.get(handles.size()-1));
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);
		handles = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(handles.get(handles.size()-1));
		String title = driver.getTitle();
		System.out.println("Subwindow title " + title);
		
//		for (String newHandle : driver.getWindowHandles()) {
//			
//			if (!orginalHandle.equalsIgnoreCase(newHandle)) {
//				System.out.println("New window handle valus is 1111" +newHandle);
//				driver.switchTo().window(newHandle);
//				Thread.sleep(2000);
////				String title = driver.getTitle();
////				System.out.println("Subwindow title " + title);
//				break;
//			}
//
//		}
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(orginalHandle);
		Thread.sleep(2000);
		
		String title1 = driver.getTitle();
		System.out.println("Mainwindow title " + title1);


	}

}
