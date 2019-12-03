package factorialProgram;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class factorialPro {

	public static int factorialWithoutRec(int number) {
		int sum = 1;
		if (number == 0 || number == 1)
			return 1;
		else
			for (int i = 1; i <= number; i++)
				sum = sum * i;
		return sum;
	}

	public static int factorialTest(int number) {
		if (number == 0 || number == 1) {
			return 1;
		} else {
			return (number * factorialTest(number - 1));
		}
	}

	public static void main(String args[]) {
		try {
			System.out.println("ENTER NUMBER TO FIND OUT FACTORIAL");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int number = Integer.parseInt(br.readLine());
			System.out.println(factorialTest(number));
			System.out.println(factorialWithoutRec(number));
			// System.out.println("Enter the number for find out factorial number..>...");
			// System.out.println("factorial output....> "
			// +factorialTest(Integer.parseInt(new BufferedReader(new
			// InputStreamReader(System.in)).readLine())));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
