package com.gspann;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class FindLargestNumberFromMo {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int arrSize, max;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number of elements in the array:");
		arrSize = Integer.parseInt(br.readLine());
		int arr[] = new int[arrSize];
		System.out.println("Enter elements of array:");
		for (int i = 0; i < arrSize; i++)
			arr[i] = Integer.parseInt(br.readLine());
		max = arr[0];
		for (int i = 0; i < arrSize; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		System.out.println("Maximum value:" + max);
	}
}
