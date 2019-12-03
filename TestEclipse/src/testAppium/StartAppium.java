package testAppium;
import java.io.IOException;
import java.net.ServerSocket;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.gargoylesoftware.htmlunit.javascript.configuration.BrowserName;

import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;


public class StartAppium {
	
	private AppiumDriverLocalService service;
	private AppiumServiceBuilder builder;
	private DesiredCapabilities cap;
	
	public void startAppium() {
		cap = new DesiredCapabilities();
		// cap.setCapability(CapabilityType.BROWSER_NAME, BrowserName.CHROME);
		cap.setCapability("noReset", "false");
		
		builder = new AppiumServiceBuilder();
		builder.withIPAddress("127.0.0.1");
		builder.usingPort(4723);
		builder.withCapabilities(cap);
		builder.withArgument(GeneralServerFlag.SESSION_OVERRIDE);
		builder.withArgument(GeneralServerFlag.LOG_LEVEL, "error");
		
		service = AppiumDriverLocalService.buildService(builder);
		service.start();
	}
	
	public void stopAppium() {
		service.stop();
	}
	
	public boolean checkIfServerAlreadyRunning(int port) {
		boolean isServerRunning = false;
		ServerSocket serverSocket;
		try {
			serverSocket = new ServerSocket(port);
			serverSocket.close();
		}catch(IOException e) {
			isServerRunning = true;
		}finally {
			serverSocket = null;
		}
		return isServerRunning;
	}
	
	public static void main(String arga[]) {
		int port = 4723;
		StartAppium start = new StartAppium();
		if (!start.checkIfServerAlreadyRunning(port)) {
			start.startAppium();
			System.out.println("Hello Appium");
			start.stopAppium();
		}
	}

}
