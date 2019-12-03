package com.arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayPro {
	
	public static int getFirstMissingNumberArray(int arr[]) {
		int missingNo = 0;
		int number = arr.length+1;
		int sumOfActualArrNumber = number*(number+1)/2;
		int sumOfMissingArrNumber = 0;
		for (int i = 0; i < arr.length; i++)
			sumOfMissingArrNumber += arr[i];
		
		missingNo = (sumOfActualArrNumber - sumOfMissingArrNumber);
		
		return missingNo;
	}
	
	public static List<Integer> getFirstTwoMissingNumberFromArray(int arr[]) {
		List<Integer> missingNumberList = new ArrayList<>();
		int number = arr.length+2;
		int sumOfActualArr = 0;
		int productOfActualArr = 1;
		int sumOfMissingArr = 0;
		int productOfMissingArr = 1;
		
		int finalSum = 0;
		int finalProduct = 1;
		
		int firstTerm = 0;
		int secondTerm = 0;
		
		// Sum of Actual Array
		sumOfActualArr = (number+1)*number/2;
		
		// Product of Actual Array;
		for (int i = 1; i <= number; i++)
			productOfActualArr *= i;
		
		// Sum Of Missing Array
		for (int i = 0; i < arr.length; i++)
			sumOfMissingArr += arr[i];
		
		// Product of Missing Array;
		for (int j = 0; j < arr.length; j++) 
			productOfMissingArr *= arr[j];
		
		finalSum = (sumOfActualArr - sumOfMissingArr);
		
		finalProduct = productOfActualArr/productOfMissingArr;
		
		int finalSubtract = (int) Math.sqrt((finalSum * finalSum) - (4*finalProduct));
		
		firstTerm = (finalSum - finalSubtract)/2;
		secondTerm = finalSum - firstTerm;
		missingNumberList.add(firstTerm);
		missingNumberList.add(secondTerm);
		
		return missingNumberList;
	}
	
	public static void main(String args[]) {
		int arr[] = {1,2,3};
		//System.out.println("Missing Number is .."+getFirstMissingNumberArray(arr));;
		List<Integer> list = getFirstTwoMissingNumberFromArray(arr);
		System.out.println("First term..."+list.get(0)+"\n"+"Second term.."+list.get(1));
	}
}
