package com.test.eclipse;

public class InssertionSort {
	
	public static int[] doInsertionSorting(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			int temp;
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j-1]) {
					temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
			
		}
		return arr;	 
	}
	
	public static void main(String args[]) {
		int [] intArr = {8, 2, 4, 3, 6, 1};
		int sortArr[] = doInsertionSorting(intArr);
		for (Integer in : sortArr) {
			System.out.print(in+" ");
		}

	}

}
