package testAppium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LaunchAppium {
	
	// Global Variable Declaration
	private static Process process;
	//private static String appiumCommand = "/Applications/Appium.app/Contents/Resources/node/bin/node" + " /Applications/Appium.app/Contents/Resources/node_modules/appium/build/lib/main.js";
	private static String appiumCommand = "/usr/local/bin/node" + " /usr/local/lib/node_modules/appium/build/lib/appium.js"; // appium which is install through command
	
	static Runtime runtime;
	public static void startAppium() {
		 runtime = Runtime.getRuntime();
		try {
			process = runtime.exec(appiumCommand);
			Thread.sleep(8000l);
			if (process != null) 
				System.out.println("Appium Server starting...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void stopAppium() {
		if (process!=null)
			process.destroy();
		System.out.println("Appium Server stop");
	}
	
	public static void main(String args[]) throws IOException {
		StringBuffer buffer = new StringBuffer();
		startAppium();
		System.out.println("Hello Appium...");
		
		process = runtime.exec("ping -c 3 google.com");
		BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
		
		String line = "";
		while ((line = br.readLine())!= null)
			buffer.append(line+"\n");
		
		System.out.println(buffer);
		//stopAppium();
	}

}
