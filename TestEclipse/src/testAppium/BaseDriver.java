package testAppium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseDriver {
	
	public AndroidDriver<WebElement> driver;
	
	public BaseDriver() {
		try {
			driver = new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), getCapabilities());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public DesiredCapabilities getCapabilities() {
		String appPath = "C:\\Automation_Data\\WSPhoton\\TestEclipse\\src\\testAppium\\MakeMyTrip.apk";
		DesiredCapabilities cap = new DesiredCapabilities();
		try {
			cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.APPIUM);
			cap.setCapability(CapabilityType.PLATFORM, Platform.ANDROID);
			cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
			cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.makemytrip");
			cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.mmt.travel.app.home.ui.SplashActivity");
			// cap.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
			cap.setCapability(MobileCapabilityType.NO_RESET, true);
			//cap.setCapability(MobileCapabilityType.FULL_RESET, true);
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
			cap.setCapability(MobileCapabilityType.APP, appPath);
		}catch (Exception e) {}
		
		return cap;
	}
	
	public AndroidDriver<WebElement> getAndroidDriver() {
		if (driver == null) {
			try {
				driver = new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), getCapabilities());
				return driver;
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}else
			return driver;
		
		return driver;
	}

}
