package com.test.eclipse;

import java.util.ArrayList;
import java.util.List;

public class CollectionConceptsExm {
	
	public static List<String> randomCityName() {
		List<String> list = new ArrayList<>();
		list.add("New York");
		list.add("Denver");
		list.add("Los Angeles");
		list.add("Boston");
		list.add("Austin");
		
		return list;
	}
	
	public static void main(String args[]) {
		System.out.println(randomCityName());
	}

}
