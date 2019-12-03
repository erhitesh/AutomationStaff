package programmingTest;

public class PrintPrimeSeries {

	public static void main(String args[]) {
		int p, n = 10;
		for (int i = 2; i < n; i++) {

			p = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0)
					p = 1;
			}
			if (p == 0) {
				System.out.println("Prime Number series..> " + i);
			}
		}
	}

}
