package com.testng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class RobotClass {
	
	
	public static void main(String args[]) {
		Robot robot;
		try {
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_RIGHT);
			robot.keyRelease(KeyEvent.VK_RIGHT);
		} catch (AWTException e) {
		}
	}

}
