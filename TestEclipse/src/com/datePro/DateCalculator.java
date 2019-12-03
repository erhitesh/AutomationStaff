package com.datePro;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateCalculator {
	
	public static long ageDiff(String oldAge) {
		long diff = 0;
		try {
			LocalDate currentDate = LocalDate.parse("02/27/2018",DateTimeFormatter.ofPattern("MM/dd/yyyy"));//LocalDate.now();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
			LocalDate olderAge = LocalDate.parse(oldAge, formatter);
			diff = ChronoUnit.DAYS.between(olderAge, currentDate);
		}catch(Exception e) {}
		
		return diff;
	}
	
	public static void main(String args[]) throws ParseException {
		/*Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		cal1.set(1990, 5, 9);
		cal2.set(2017, 10, 24);
		long diffInMilliS1 = cal1.getTimeInMillis();
		long diffInMilliS2 = cal2.getTimeInMillis();
		long diffInMilis = (diffInMilliS2 - diffInMilliS1);
		long days = diffInMilis/(1000*60*60*24);
		System.out.println("Years.."+days/365);*/
		
		System.out.println(ageDiff("12/27/2017"));
//		cal1.setTime(new SimpleDateFormat("MM/dd/yyyy").parse("10/24/2017"));
//		Date date = cal1.getTime();
//		System.out.println(date);
	}

}
