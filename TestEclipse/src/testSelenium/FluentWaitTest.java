package testSelenium;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class FluentWaitTest {
	WebDriver driver;

	public void wait(int timeOutInSeconds, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * @param timeOutInSeconds
	 * @param element
	 */
	public void fleuntWaitWithFunction(int timeOutInSeconds, WebElement element) {

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeOutInSeconds))
				.pollingEvery(Duration.ofMillis(200))
				.ignoring(NoSuchElementException.class);

		/*wait.until(new Function<WebDriver, WebElement>() {
			@Override
			public WebElement apply(WebDriver t) {
				WebElement ele = null;
				if (element.isDisplayed())
					ele = element;
				return ele;
			}
		});*/
		
		wait.until(new Function<WebDriver, Boolean>() {
			@Override
			public Boolean apply(WebDriver t) {
				boolean isDisplayed = false;
				if (element.isDisplayed())
					isDisplayed = true;
				
				return isDisplayed;
			}
			
		});
	}

	@Test
	public void launchDriver() {
		System.setProperty("webdriver.chrome.driver", "/Users/kiwitech/Desktop/Automation/chromedriver/chromedriver3");
		driver = new ChromeDriver();
		driver.get("http://google.co.in");

	}
}
