package com.Appium;

import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Platform;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.html5.Location;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.HasSettings;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.Setting;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.AndroidKeyMetastate;
// import io.appium.java_client.android.Connection;
import io.appium.java_client.android.StartsActivity;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class TestAppiumNewFunctions {

	private static AppiumDriver<MobileElement> driver;
	static MobileElement element;

	public static DesiredCapabilities getCapability() {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.APPIUM);
		cap.setCapability(CapabilityType.PLATFORM, Platform.ANDROID);
		cap.setCapability(CapabilityType.PLATFORM, Platform.ANDROID);
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0.1");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "");
		// Android.
		cap.setCapability(MobileCapabilityType.APP, "");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "");
		cap.setCapability(AndroidMobileCapabilityType.ANDROID_DEVICE_READY_TIMEOUT, "2000");

		// ios
//		cap.setCapability(IOSMobileCapabilityType.APP_NAME, "");
//		cap.setCapability(IOSMobileCapabilityType.PLATFORM, "ios");
//		cap.setCapability(MobileCapabilityType.UDID,"");

		return cap;
	}

	public static AppiumDriver<MobileElement> getDriverInstance() {
		driver = new AndroidDriver<>(getCapability());

		return driver;
	}

	public static void testClientJarsFn() {
		AndroidDriver<AndroidElement> driver = null;
		Location location = driver.location();
		double latitude = location.getLatitude();
		double longitude = location.getLongitude();
		driver.getOrientation();
		driver.rotate(ScreenOrientation.LANDSCAPE);
		LogEntries logEntries = driver.manage().logs().get("driver");
		Set<String> availableLogTypes = driver.manage().logs().getAvailableLogTypes();
		Map<String, Object> map = ((HasSettings) driver).getSettings();
		((HasSettings) driver).setSetting(Setting.WAIT_FOR_IDLE_TIMEOUT, Duration.ofSeconds(5));
		Map<String, Object> sessionDetails = driver.getSessionDetails();

		// Activity start
		driver.startActivity(new Activity("", ""));
		String currentActivity = driver.currentActivity();
		System.out.println("Current Activity ... " + currentActivity);
		String currentPackage = driver.getCurrentPackage();
		System.out.println("Package Name  ... " + currentPackage);
		((StartsActivity) driver).startActivity(new Activity("com.example", "ActivityName"));
		// open notification
		driver.openNotifications();
		Map<String, String> bars = driver.getSystemBars();
		String time = driver.getDeviceTime();
		TouchAction action = new TouchAction(driver);
		TouchActions act = new TouchActions(driver);
		act.perform();
		// pergormance data
		// List<List<Object>> performanceData = driver.getPerformanceData("packagename",
		// datatype, dataReadTimeout);//dataType cpuinfo
		List<String> performanceTypes = driver.getSupportedPerformanceDataTypes();
		// presskey
		driver.pressKeyCode(AndroidKeyCode.ENTER, AndroidKeyMetastate.META_CTRL_ON);
		// longpress
		driver.longPressKeyCode(AndroidKeyCode.HOME);
		boolean value = driver.isKeyboardShown();
		// app related
		driver.installApp("appPath");
		driver.launchApp();
		driver.installApp("appPath");
		driver.isAppInstalled("bundleId");
		driver.runAppInBackground(Duration.ofMillis(200));
		driver.closeApp();
		driver.resetApp();
		// driver.endTestCoverage(intent, path);
		// file
//		driver.pushFile(remotePath, file);
//		driver.pullFolder(remotePath)
		driver.lockDevice();
		// driver.shake();// ios
		driver.toggleLocationServices();
		Map<String, String> mapd = driver.getAppStringMap("language", "stringFile");
		// driver.setConnection(ConnectionState.AIRPLANE_MODE_MASK);
		// driver.getConnection();
		// driver.setConnection(Connection.WIFI);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().\"\n"
				+ "+\"scrollable(true)).scrollIntoView(new UiSelector().resourceId(\"resourceId\")"));
//		action.moveTo(element).waitAction(Duration.ofMillis(200)).press(element).release().perform();
//		action.moveTo(element).waitAction(Duration.ofMillis(200)).press(element).release().perform();

		MultiTouchAction multi = new MultiTouchAction(driver);
		multi.add(action).perform();
		// getDriverInstance().
		AndroidDriver<AndroidElement> dd = new AndroidDriver<>(getCapability());
		dd.hideKeyboard();
		dd.hideKeyboard();
		Dimension d = dd.findElement(By.id("")).getSize();
		d.getHeight();

	}

	public static void main(String args[]) {
		AppiumDriverLocalService service = AppiumDriverLocalService.buildDefaultService();
		service.start();
	}

}
