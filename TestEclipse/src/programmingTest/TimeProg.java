package programmingTest;


import java.text.SimpleDateFormat;

public class TimeProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // By using Date class
//		Date date = new Date();
//		System.out.println("Current Date Value..>"+date);
//		
//		// Using system method
//		long millis = System.currentTimeMillis();
//		Date long_millis = new Date(millis);
//		System.out.println("Using current millis"+long_millis);
		
		
//		// Using sql
//		long millis = System.currentTimeMillis();
//		Date sql_date = new Date(millis);
//		System.out.println(sql_date);
		 
		// SimpleDateFormat method 
		long start_time = System.currentTimeMillis();
		String arr[] = {"y", "yy", "yyy", "yyyy", "D", "DD", "d", "dd", "M", "MM", "MMM", "m", "mm", "z"};
		String name_class = arr.getClass().getName();
		System.out.println(arr.getClass());
		//String name = clas.getName();
		System.out.println(name_class);
		System.out.println(arr.length);
		for(int i = 0; i<arr.length; i++){
			SimpleDateFormat simple = new SimpleDateFormat(arr[i]);
			String date = simple.format(new java.util.Date());
			System.out.println("Date value by simple date format...>"+date);
		}
		
		long end_time = System.currentTimeMillis();
		long diff = end_time - start_time;
		System.out.println("Different time between start time and end time..>"+diff);

	}

}
