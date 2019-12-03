package testSelenium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;


public class WinCon {

	
	@Test(priority=0)
	public void windowHandling() throws InterruptedException, MalformedURLException {
		System.setProperty("webdriver.gecko.driver", "C:\\Automation_Data\\jar\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.firefox());
		driver.manage().window().maximize();
		driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		// window handle value of original window
		String orginalHandle = driver.getWindowHandle();
		System.out.println("The orginal window handle value is -  " + orginalHandle);

		// open new window
		WebElement newMessageWindow = driver.findElement(By.xpath("//button[contains(text(),'New Browser Window')]"));
		newMessageWindow.click();
		Thread.sleep(2000);
		List<String> handles = new ArrayList<>(driver.getWindowHandles());
		System.out.println("handles count..." + handles.size());

		driver.switchTo().window(handles.get(handles.size() - 1));
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println("Subwindow title " + title);
		driver.close();
		Thread.sleep(2000);
		handles = new ArrayList<>(driver.getWindowHandles());
		System.out.println("After Close Window handles count..." + handles.size());
		driver.switchTo().window(handles.get(handles.size() - 1));
		Thread.sleep(2000);
		String title1 = driver.getTitle();
		System.out.println("Mainwindow title " + title1);
		// Context CLick
		driver.get("http://medialize.github.io/jQuery-contextMenu/demo.html");
		Thread.sleep(2000);
		WebElement element=driver.findElement(By.cssSelector(".context-menu-one.btn.btn-neutral"));
		Actions action = new Actions(driver).contextClick(element);
		action.build().perform();
		Thread.sleep(2000);
//		WebElement quitElement = driver.findElement(By.cssSelector(".context-menu-item.context-menu-icon.context-menu-icon-edit.context-menu-hover.context-menu-visible>span"));
//		System.out.println("quitElement status.."+quitElement.isDisplayed()+"\n"+"Quit Element Enable..."+quitElement.isEnabled());
		((JavascriptExecutor)driver).executeScript("document.getElementsByClassName('context-menu-item context-menu-icon context-menu-icon-edit')[0].click();");
		Alert alert=driver.switchTo().alert();
        String textEdit = alert.getText();
        System.out.println("Alert Text..."+textEdit);
        alert.accept();
	}
}
