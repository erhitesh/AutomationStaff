package programmingTest;

import java.util.Calendar;


public class CurrentDay {

	public static void main(String[] args) {
		
		
		
		Calendar cal = Calendar.getInstance();
		int month = cal.get(Calendar.MONTH);
		
		System.out.println("Current Month Value ..."+month);
		switch (month) {
		case 0: System.out.println("January");
		break;
		case 1: System.out.println("Ferbury");
		break;
		case 2: System.out.println("March");
		break;
		case 3: System.out.println("April");
		break;
		case 4: System.out.println("May");
		break;
		case 5: System.out.println("June");
		break;
		case 6: System.out.println("July");
		break;
		case 7: System.out.println("August");
		break;
		case 8: System.out.println("September");
		break;
		case 9: System.out.println("October");
		break;
		case 10: System.out.println("November");
		break;
		case 11: System.out.println("December");
		break;
		}
	
		/*
		int day = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("Current Day Value..");
        switch (day) {
        case 1: System.out.print("Sunday");
        break;
        case 2: System.out.print("Monday");
        break;
        case 3: System.out.print("Tueseday");
        break;
        case 4: System.out.print("Wednesday");
        break;
        case 5: System.out.print("Thursday");
        break;
        case 6: System.out.print("Friday");
        break;
        case 7: System.out.print("Saturday");
        break;
        		}
        */
		

	}

}
