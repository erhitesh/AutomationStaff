package programmingTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class StartAndEndTime {

	public static void findStartAndEndTime() throws InterruptedException {
		long start = TimeUnit.NANOSECONDS.toSeconds(System.nanoTime());
		//TimeUnit.MINUTES.toDays(System.)
		System.out.println("Start time is" + start + "seconds");
		Thread.sleep(5000);
		long end = TimeUnit.NANOSECONDS.toSeconds(System.nanoTime());
		System.out.println("End time is" + end + "seconds");
		System.out.println("StartAndEndTime.main()...> " + (end - start));
		
		System.out.println(System.currentTimeMillis());
	}

	public static void formatting() {
		// means converting date to string.
		Date date = new Date();
		SimpleDateFormat simple = new SimpleDateFormat("dd-MM-yyyy");
		String str_format = simple.format(date);
		System.out.println("Formatting.." + str_format);
	}

	public static void parsing() throws ParseException {
		// parsing means converting string to date
		String str_date = "21-10-2015";
		SimpleDateFormat simple = new SimpleDateFormat("dd-MM-yyyy");
		Date date = simple.parse(str_date);
		System.out.println("Parsing.." + date);
	}

	public static void main(String args[]) throws InterruptedException, ParseException {
    
		  findStartAndEndTime();
		  formatting();
		  parsing();
	}

}
