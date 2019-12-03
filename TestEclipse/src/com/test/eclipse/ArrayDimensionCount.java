package com.test.eclipse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ArrayDimensionCount {
	public static void main(String args[]) {
		HashMap<Integer, Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		int arr[][] = { { 1, 1, 0, 1 }, { 1, 0, 1, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 1) {
					count++;
				}
			}
			list.add(count);
			map.put(count, i);
		}
		System.out.println(map.get(Collections.max(list)));
	}

}
