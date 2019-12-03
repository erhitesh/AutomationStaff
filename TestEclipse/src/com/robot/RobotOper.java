package com.robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class RobotOper {
	
//	private static WebDriver driver;
//	private static WebElement element;
	private static Robot robot;
	private static final int SPEED = 300;
	
	public static void executeCommand(int [] commandsArray) {
		try {
			robot = new Robot();
		}catch(AWTException e) {
			e.printStackTrace();
		}robot.mouseWheel(-50);
		for (int i = 0; i < commandsArray.length; i++) {
			robot.delay(SPEED);
			robot.keyPress(commandsArray[i]);
			robot.keyRelease(commandsArray[i]);
			
			robot.delay(SPEED);
		}
	}
	
	public static void main(String args[]) throws InterruptedException{
//		try {
//			System.setProperty("webdriver.gecko.driver", "/Users/kiwitech/Desktop/Automation/firefoxdata/geckodriver");
//			DesiredCapabilities capability = DesiredCapabilities.firefox();
//			try {
//				driver = new RemoteWebDriver(new URL("http://localhost:5566/wd/hub"), capability);
//				driver.get("http://spreadsheetpage.com/index.php/file/C35/P10");
//				element = driver.findElement(By.xpath("//ul//li//b[contains(text(),'Down')]/..//a"));
//				element.click();
//				Thread.sleep(3000);
//			} catch (MalformedURLException e) {
//				e.printStackTrace();
//			}
//			Robot robot = new Robot();
//			robot.keyPress(KeyEvent.VK_DOWN);
//			robot.delay(2000);
//			//Thread.sleep(3000);
//			robot.keyRelease(KeyEvent.VK_DOWN);
//			robot.keyPress(KeyEvent.VK_TAB);
//			robot.delay(3000);
//			robot.keyPress(KeyEvent.VK_ENTER);
//			robot.delay(2000);
//			robot.keyRelease(KeyEvent.VK_TAB);
//			robot.keyRelease(KeyEvent.VK_ENTER);
//			driver.quit();
//		} catch (AWTException e) {
//			e.printStackTrace();
//		}
		
//		robot.keyPress(KeyEvent.VK_UP);
//		robot.mouseMove(210, 451);
//		robot.mousePress(InputEvent.BUTTON2_DOWN_MASK);
//		robot.mouseRelease(InputEvent.BUTTON2_DOWN_MASK);
		
		// Commands Array
		int [] openFinder = {KeyEvent.VK_CONTROL, KeyEvent.VK_SPACE};
		int [] openTerminal = {KeyEvent.VK_T, KeyEvent.VK_E, KeyEvent.VK_X, KeyEvent.VK_T, KeyEvent.VK_M, KeyEvent.VK_A, KeyEvent.VK_T, KeyEvent.VK_E, KeyEvent.VK_ENTER};
		executeCommand(openFinder);
		//executeCommand(openTerminal);
	}

}
