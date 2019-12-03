package arrayprograms;

public class ArrayTest {

	public static void getRowData() {
		int[][] arr = { { 1, 0, 0 }, { 0, 1, 0 }, { 1, 1, 1 } };//new int[2][3];//
		System.out.println(arr.length);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}

	public static void main(String[] args) {

		getRowData();

	}

}
