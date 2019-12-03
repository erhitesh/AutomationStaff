package com.datePro;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class VerifySystemTime {
	
	public static long getTimeBasedOnFormat(String format) {
		long l = 0l;
		try {
			LocalTime time = LocalTime.now();
			if (format.equalsIgnoreCase("minute"))
				l = time.getMinute();
			else if (format.equalsIgnoreCase("hour"))
				l = time.getHour();
			else if (format.equalsIgnoreCase("second"))
				l = time.getSecond();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return l;
	}
	
	public static String getTimeInSpecificFormat() {
		String dueDate = "";
		Calendar calender = new GregorianCalendar();
		Date date = new Date();
		calender.setTime(date);
		calender.add(Calendar.MINUTE, 6);
		Date newDate = calender.getTime();
		SimpleDateFormat format = new SimpleDateFormat("hh:mm a");
		dueDate = format.format(newDate);
		
		return dueDate;
	}
	
	public static void main(String args[]) throws InterruptedException {
		long l1 = getTimeBasedOnFormat("second");
		Thread.sleep(5000);
		long l2 = getTimeBasedOnFormat("second");
		System.out.println("L1...."+l1+"<<<<<<>>>>>>>>L2."+l2);
		
		
		System.out.println("getTimeInSpecificFormat"+getTimeInSpecificFormat());
	}

}
