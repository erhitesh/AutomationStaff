package Test;

public class OperatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String firstName = "bhardwaj";

		String lastName = "Bhardwaj";

		int a = 3;
		int b = 5;
		String actualResult = (firstName.equalsIgnoreCase(lastName)) ? (a < b ? "Hitesh" : "Bhardwaj") : lastName;
		System.out.println("*****************************actualResult*********" + actualResult);

	}

}
