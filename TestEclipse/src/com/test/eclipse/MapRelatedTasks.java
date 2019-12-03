package com.test.eclipse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapRelatedTasks {
	
	public static List<String> randomCityName() {
		List<String> list = new ArrayList<>();
		list.add("New York");
		list.add("Denver");
		list.add("Los Angeles");
		list.add("Boston");
		list.add("Austin");
		
		return list;
	}
	
	public static String getZipCode(String cityName) {
		HashMap<String, String> mapList = new HashMap<>();
		mapList.put("New York", "10001");
		mapList.put("Denver", "80014");
		mapList.put("Los Angeles", "90001");
		mapList.put("Boston", "01841");
		mapList.put("Austin", "73301");
		
		return mapList.get(cityName);

}
	
	public static void main(String args[]) {
		List<String> list = randomCityName();
		System.out.println("asdnasn");
		System.out.println(list.indexOf("New York"));
		//System.out.println("ng-untouched ng-valid ng-dirty ng-valid-parse ng-not-empty".contains("ng-not-empty"));
	}
}
