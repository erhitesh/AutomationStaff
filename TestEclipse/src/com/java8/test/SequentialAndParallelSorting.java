package com.java8.test;

import java.util.Arrays;


public class SequentialAndParallelSorting {
	
	static int arr[] = {10, 1, 23, 100, 25, 2, 34, 7};
	static int startIndex = 0;
	static int endIndex = 0;

	// sorting by sort method
	public static void sortBySortMethod(int arr[]) {
		Arrays.sort(arr);
	}
	
	// sorting by parallelsort method
	public static void sortByParallelSortMethod(int arr[]) {
		Arrays.parallelSort(arr);
	}
	
	public static void sortArrayBetweenRange(int arr[], int start, int end) {
		Arrays.parallelSort(arr, start, end);
	}
	
	public static void main(String args[]) {
		System.out.println("Array Values...");
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k]+" ");
		}
//		System.out.println("Total Time Taken by Sort Array By Parallel Sorting...");
//		sortByParallelSortMethod(arr);
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]+" ");
//		}
		startIndex = Integer.parseInt(args[0]);
		endIndex = Integer.parseInt(args[1]);
		System.out.println("Start Index..."+startIndex+" End index..."+endIndex);
		System.out.println("\n");
		sortArrayBetweenRange(arr, startIndex, endIndex);
		//sortByParallelSortMethod(arr);
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]+" ");
		}
	}
}
