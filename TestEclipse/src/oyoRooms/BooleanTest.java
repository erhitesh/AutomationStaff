package oyoRooms;

public class BooleanTest {
	void start() {
		boolean b1 = false;
		boolean b2 = fix(b1);

		System.out.println(b1 + " " + b2);
	}

	boolean fix(boolean b3) {
		b3 = true;
		return b3;
	}

	public static void main(String args[]) {
		BooleanTest bt = new BooleanTest();
		bt.start();
	}
}
