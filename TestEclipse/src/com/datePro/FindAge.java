package com.datePro;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FindAge {
	
	
	
	public static void main(String args[]) throws ParseException {
	
//		String dat = "12/27/2017";
//		String month = dat.substring(0, dat.indexOf("/"));
//		System.out.println("previouDate"+"\n"+month);
		//LocalDate previouDate = LocalDate.of(Integer.parseInt(dat.substring(6, dat.length())), Month., 1); 
		//System.out.println("previouDate"+"\n"+previouDate);
//		SimpleDateFormat simple = new SimpleDateFormat("dd-MM-yyyy");
//		LocalDate currentDate = LocalDate.now();
//		System.out.println("Current Date .."+currentDate);
//		long dayDiff = ChronoUnit.DAYS.between(previouDate, currentDate);
//		long monthDiff = ChronoUnit.MONTHS.between(previouDate, currentDate);
//		long yearDif = ChronoUnit.YEARS.between(previouDate, currentDate);
//		System.out.println(yearDif);	

//		DateFormatSymbols symbol = new DateFormatSymbols();
//		String monthsList[] = symbol.getMonths();
//		String value = monthsList[11].toUpperCase();
//		
//		System.out.println(monthsList[12].toUpperCase());
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		String replaceSlash = "12/28/2017".replaceAll("/", "-");
		LocalDate local = LocalDate.parse("12/28/2017", formatter);
		System.out.println("Local Date..."+local);
		
//		Date sampleDate = new SimpleDateFormat("yyyy-MM-dd").parse("12/28/2017".replaceAll("/", "-"));
//		System.out.println("sampleDate"+sampleDate);
//		
//		LocalDate local = sampleDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//		System.out.println("local....."+"\n"+local);
//		
//		LocalDate previouDate = LocalDate.of(Integer.parseInt(dat.substring(6, dat.length())), 1, 1); 
//		System.out.println("previouDate"+previouDate);
		}

}
