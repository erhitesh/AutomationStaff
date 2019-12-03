package programmingTest;

public class IntegerFormating {
	
	public static void main(String args[]) {
		
	int i = 12347;
	
	System.out.format("%7d\n", i);  // the output will be padded on the left.
	System.out.format("%-7d\n", i);  // the output will be padded on the right.\
	
	System.out.format("%09d\n", i);  // The output will be padded on the left with zeroes.
	
	
	String s = String.format("%-12.4f%.8f", 12.23429837482, 9.10777);

	 System.out.println(s);
	
	}

}
