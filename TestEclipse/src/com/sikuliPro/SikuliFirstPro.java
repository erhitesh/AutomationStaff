package com.sikuliPro;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.sikuli.basics.Settings;
import org.sikuli.script.App;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliFirstPro {
	
	// Global Variable Declaration
	static String baseUrl = "http://google.com";
	static Screen screenObj;
	//static String filePath = "";
	//static Pattern patternImg;
	
	public static String getImageLocation(String imageName) {
		String imageLoc = "";
		try {
			imageLoc = System.getProperty("user.dir")+"/Images/"+imageName+".png";
		}catch(Exception e) {
			e.printStackTrace();
		}
		return imageLoc;
	}
	
	public static Pattern getPatternInstance(String imageName) {
		Pattern pattern;
		pattern = new Pattern(imageName);
		return pattern;
	}
	
	public static int imageCount() {
		int count = 0;
		
		return count;
	}
	
	public static void main(String args[]) throws MalformedURLException, FindFailed, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/kiwitech/Desktop/Automation/firefoxdata/geckodriver");
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:5566/wd/hub"), DesiredCapabilities.firefox());
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		
		// Get Screen Class Object
		screenObj = new Screen();
		Settings.setShowActions(true);
//		// Add An Image
//		Pattern googleImageSrc = getPatternInstance(getImageLocation("Google_Image_Src"));
//		//Wait 10ms for image 
//		screenObj.wait(googleImageSrc, 10);
//		// Click On Image Btn
//		screenObj.doubleClick(googleImageSrc);
//		System.out.println("No. Of Screens.."+screenObj.getNumberScreens());	
		
//		driver.get(baseUrl);
		screenObj.wait(10);
		Pattern googleSearchBar = getPatternInstance(getImageLocation("Google_Search_Bar"));
		App.open("Safari");
		screenObj.wait(10);
		screenObj.wait(googleSearchBar,10);
		screenObj.click(googleSearchBar);
		screenObj.highlight();
		screenObj.type(googleSearchBar, "Hello Sikuli");
		
		Pattern googleSearchBtn = getPatternInstance(getImageLocation("Google_Search_Btn"));
		screenObj.click(googleSearchBtn);
		screenObj.click(googleSearchBtn);
		screenObj.wait(10);
		
		driver.quit();
		
		App.open("Safari");
		screenObj.wait(10);
		App.close("Safari");
	}

}
