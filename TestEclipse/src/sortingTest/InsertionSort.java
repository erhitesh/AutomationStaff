package sortingTest;

public class InsertionSort {
	
	
	public static int [] getInsertion(int arr[]) {
		int temp;
		for (int i = 1; i < arr.length; i++){
			for (int j = i; j > 0; j--){
				if (arr[j] < arr[j-1]){
				temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
				}
			}	
		}
		return arr;
	}
	
	
	public static void main(String args[]) {
		int test[] = {4, 12, 1, 3, 5, 11,6};
		int result[] = getInsertion(test);
		for (int i : result){
			System.out.print(i);
			System.out.print(" ");
		}
		
	}

}
