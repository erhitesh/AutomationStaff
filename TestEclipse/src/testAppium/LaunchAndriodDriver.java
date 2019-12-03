package testAppium;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.HideKeyboardStrategy;
import io.appium.java_client.remote.MobileCapabilityType;

public class LaunchAndriodDriver {

	// Global Variable Declaration
	static String deviceCommand = "C:\\Automation_Data\\Automation\\Android-sdk\\platform-tools\\adb devices";
	static String packageCommand = "C:\\Automation_Data\\Automation\\Android-sdk\\build-tools\\27.0.3\\aapt dump badging "
			+ System.getProperty("user.dir") + File.separator +  "src\\testAppium\\MakeMyTrip.apk";
	static String deviceVersionCommand = "C:\\Automation_Data\\Automation\\Android-sdk\\platform-tools\\adb shell getprop | grep build.version.release";

	/* Get Device Name */
	public static String getDeviceName() {
		String DeviceName = "Could not find device!!";
		Runtime rt = Runtime.getRuntime();
		StringBuffer buffer = new StringBuffer();
		try {
			Process proc = rt.exec(deviceCommand);
			BufferedReader stdInput = new BufferedReader(new InputStreamReader(proc.getInputStream()));
			String s;
			while ((s = stdInput.readLine()) != null) {
				buffer.append(s);
				DeviceName = buffer.toString().replaceAll("List of devices attached", "").replaceAll("device", "")
						.trim();
			}
			System.out.println("Device Name is : " + DeviceName);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return DeviceName;
	}

	/* Get Package Name */
	public static String getAppPackageName() {
		String packageName = "Could not find package name!!";
		Runtime rt = Runtime.getRuntime();
		try {
			Process proc = rt.exec(packageCommand);
			BufferedReader stdInput = new BufferedReader(new InputStreamReader(proc.getInputStream()));
			String s;
			while ((s = stdInput.readLine()) != null) {
				if (s.contains("package: name")) {
					Pattern pattern = Pattern.compile("'(.*?)'");
					Matcher matcher = pattern.matcher(s);
					if (matcher.find()) {
						packageName = matcher.group(1);
						// System.out.println(matcher.group(1));
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("App Package Name..." + packageName);
		return packageName;
	}

	/* Get Activity Name */
	public static String getAppActivityName() {
		String appActivityName = "Could not find activity!!";
		Runtime rt = Runtime.getRuntime();
		try {
			Process proc = rt.exec(packageCommand);
			BufferedReader stdInput = new BufferedReader(new InputStreamReader(proc.getInputStream()));
			String s;
			while ((s = stdInput.readLine()) != null) {
				if (s.contains("launchable-activity: name")) {
					Pattern pattern = Pattern.compile("'(.*?)'");
					Matcher matcher = pattern.matcher(s);
					if (matcher.find())
						appActivityName = matcher.group(1);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("App Activity Name..." + appActivityName);
		return appActivityName;
	}

	/* Get Android Device Name. */
	public static String getDeviceVersion() {
		String androidDeviceVersion = "Could not find version!!";
		Runtime rt = Runtime.getRuntime();
		try {
			Process proc = rt.exec(deviceVersionCommand);
			BufferedReader stdInput = new BufferedReader(new InputStreamReader(proc.getInputStream()));
			String s = stdInput.readLine();
			androidDeviceVersion = s.replaceFirst("[ro.build.version.release]: [7.0]", "");
			// System.out.println("Android Version..."+"[ro.build.version.release]:
			// [7.0]".concat("7"));
			if (androidDeviceVersion.contains("8.0")) {
				androidDeviceVersion = "Oreo";
			} else if (androidDeviceVersion.contains("7.0")) {
				androidDeviceVersion = "Nougat";
			} else if (androidDeviceVersion.contains("6")) {
				androidDeviceVersion = "Marsmallow";
			} else if (androidDeviceVersion.contains("5")) {
				androidDeviceVersion = "Lollipop";
			} else if (androidDeviceVersion.contains("4.4")) {
				androidDeviceVersion = "Kitkat";
			} else if (androidDeviceVersion.contains("4.1") || androidDeviceVersion.contains("4.2")
					|| androidDeviceVersion.contains("4.3")) {
				androidDeviceVersion = "Jelly Bean";
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Device Version..." + androidDeviceVersion);
		return androidDeviceVersion;
	}

	public static DesiredCapabilities getDesiredCapabilities() {
		String appPath = "/Users/kiwitech/Desktop/Automation/TestEclipse/src/testAppium/MakeMyTrip.apk";
		DesiredCapabilities cap = new DesiredCapabilities();
		try {
			cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.APPIUM);
			cap.setCapability(CapabilityType.PLATFORM, Platform.ANDROID);
			cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");
			cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.makemytrip");
			cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.mmt.travel.app.home.ui.SplashActivity");
			// cap.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
			cap.setCapability(MobileCapabilityType.NO_RESET, true);
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "ZY223BPR52");
			cap.setCapability(MobileCapabilityType.APP, appPath);
		} catch (Exception e) {
		}
		return cap;
	}

	public static void main(String args[]) {
		try {
			//System.out.println("Appium Start Loading...............");
			getDeviceName();
			getAppPackageName();
			getAppActivityName();
			getDeviceVersion();
			 AndroidDriver<MobileElement> androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), getDesiredCapabilities());
			 androidDriver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
			 // Home Screen
			 MobileElement loginBtn = androidDriver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.makemytrip:id/btn_signin\").instance(0)"));
			androidDriver.findElement(MobileBy.AndroidUIAutomator(""));
			 loginBtn.click();
			 androidDriver.hideKeyboard();
			 
			 IOSDriver<MobileElement> iosDriver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), getDesiredCapabilities());
			 iosDriver.hideKeyboard(HideKeyboardStrategy.PRESS_KEY,"Done");
			 iosDriver.hideKeyboard(HideKeyboardStrategy.TAP_OUTSIDE, "true");
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
