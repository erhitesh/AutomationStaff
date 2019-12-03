package testSelenium;

public class ArrayTest {
	
	
	public static void twoDimensionArr() {
		int aa[][] = {{1, 3, 4}, {1, 3, 4}};
		int bb[][] = {{1, 3, 4}, {1, 3, 4}};
		int cc[][] = new int[2][3];
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				cc[i][j] = aa[i][j]+bb[i][j];
				System.out.print(cc[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String args[]) {
		
		int aa[] = new int[10];
		int ar[] = {1, 2, 3};
		aa[0] = 11;
		
		for (int in : ar) {
			//System.out.println("Value..."+in);
		}
		
		//System.out.println("Array Class Name..."+ar.getClass().getName());
		
		twoDimensionArr();
		
	}

}
