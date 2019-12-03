package com.test.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TermCountInArray {
	
	public static void main(String args[]) {
		
		List<String> info = new ArrayList<>();
		info.add("1");
		info.add("1");
		info.add("1");
		info.add("1");
		info.add("3");
		info.add("3");
		info.add("2");
		info.add("4");
		info.add("4");
		info.add("10");
		info.add("14");
		info.add("11");
		int count = 0;
//		for (String string : info) {
//			if (string.equalsIgnoreCase("1"))
//				count++;
//		}
//		System.out.println("Count Value..."+count);
		
		String da = "Dr Qwaeswda Ds";
		System.out.println(Arrays.asList(da.split(" ")).get(1));
	}

}
