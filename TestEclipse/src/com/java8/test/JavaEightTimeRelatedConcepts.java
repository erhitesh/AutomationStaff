package com.java8.test;

import java.time.Clock;
import java.time.LocalDate;
import java.time.ZoneId;

import com.enu.Enum;

public class JavaEightTimeRelatedConcepts {
	
	// LocalDate Class
	public static void main(String args[]) {
		LocalDate localWithNow = LocalDate.now();
		LocalDate localWithClock = LocalDate.now(Clock.systemDefaultZone());
		LocalDate localWithZoneId = LocalDate.now(ZoneId.systemDefault());
		System.out.println("Local Time Now..."+localWithNow);
		System.out.println("Local Time Clock..."+localWithClock);
		System.out.println("Local Time Zone..."+localWithZoneId);
		
		System.out.println(Enum.Name.getData());
	}

}
