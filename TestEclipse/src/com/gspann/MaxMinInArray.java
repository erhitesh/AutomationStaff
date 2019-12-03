package com.gspann;

import java.io.IOException;

public class MaxMinInArray {
	
	public static void findMaxMinAndSum(int arr[]) {
		int max = 0,min=arr[0],sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
			if (arr[i] > max)
				max = arr[i];
			if (arr[i] < min)
				min = arr[i];
		}
		System.out.println("Max.."+max+"\n"+"Min.."+min+"\n"+"Sum.."+sum);
	}
	
	public static void main(String args[]) throws IOException {
		int arr[] = {2,4,1,3,5,8,9,13};
		findMaxMinAndSum(arr);
	}

}
