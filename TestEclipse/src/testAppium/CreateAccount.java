package testAppium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class CreateAccount extends BaseDriver {
	
	AndroidDriver<WebElement> driver = getAndroidDriver();
	
	By create = By.id("com.makemytrip:id/tvSignup");
	By firstName = By.id("com.makemytrip:id/txtInpLyt_signup_first_name");
	By lastName = By.id("com.makemytrip:id/edt_txt_signup_last_name");
	By number = By.id("com.makemytrip:id/edt_txt_signup_phone_number");
	By profileBtn = By.id("com.makemytrip:id/my_profile_icon");
	
	
	public void clickOnCreateButton() {
		WebElement ee = driver.findElement(create);
		ee.click();
	}
	
	public void enterFirstName() {
		//System.out.println(driver.findElement(create).isDisplayed());
		WebElement first = driver.findElement(firstName);
		first.click();
		first.sendKeys("hello");
	}
	
	public void lastName() {
		WebElement first = driver.findElement(lastName);
		first.click();
		first.sendKeys("hello");
	}
	
	public void waitObject() {
		
	}
	
	public void clickOnProfileBtn() {
		driver.findElement(profileBtn).click();
	}
	
	public void action() {
		clickOnCreateButton();
		enterFirstName();
		lastName();
	}
}
