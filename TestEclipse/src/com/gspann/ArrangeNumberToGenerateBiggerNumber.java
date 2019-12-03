package com.gspann;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ArrangeNumberToGenerateBiggerNumber {
	
	static void printLargest(List<String> arr){
		Collections.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String X, String Y) {
				// first append Y at the end of X
				String XY = X + Y;
				String YX = Y + X;
				//System.out.println("Check Condition.."+XY.compareTo(YX)+"\n"+(XY.compareTo(YX)>0)+"\n"+(XY.compareTo(YX)>0 ? -1 : 1));
				return XY.compareTo(YX) > 0 ? -1 : 1;
			}
		});
		System.out.println("Array After Sorting.."+arr);
		Iterator<String> it = arr.iterator(); 
	    while(it.hasNext())
	        System.out.print(it.next());
	}
	
	public static void main(String args[]) {
//		Vector<String> arr = new Vector<>();
		List<String> arr = new ArrayList<>();
		arr.add("54");
        arr.add("546");
        arr.add("548");
        arr.add("60");
        System.out.println("Array Before Sorting.."+arr);
        System.out.println("Number Generated By Number Of Series..");
        printLargest(arr);
	}

}