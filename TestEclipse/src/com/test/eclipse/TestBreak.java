package com.test.eclipse;

import java.util.ArrayList;
import java.util.List;

public class TestBreak {
	
	
	public static List<String> getListData() {
		List<String> deleteddata = new ArrayList<>();
		deleteddata.add("Hi");
		deleteddata.add("Hitesh");
		deleteddata.add("Bhardwaj");
		deleteddata.add("99");
		
		List<String> updateList = new ArrayList<>();
		updateList.add("@#");
		updateList.add("44");
		updateList.add("77");
		updateList.add("&&");
		
		List<String> alldata = new ArrayList<>();
		alldata.add("1");
		alldata.add("3");
		alldata.add("6");
		alldata.add("9");
		alldata.add("Hi");
		alldata.add("Hitesh");
		alldata.add("Bhardwaj");
		alldata.add("sharma");
		alldata.add("rohit");
		alldata.add("ram");
		alldata.add("10");
		//System.out.println("Data After deletion..."+alldata+"Size.."+alldata.size());
		for (int i = 0; i < deleteddata.size(); i++) {
			for (int j = 0; j < alldata.size(); j++) {
				//System.out.println(deleteddata.get(i));
				if (alldata.contains(deleteddata.get(i))) {
					int k = alldata.indexOf(deleteddata.get(i));
					System.out.println(k);
					alldata.remove(k);
					alldata.add(k, updateList.get(i));
					break;
				}
//				if (alldata.get(j).equalsIgnoreCase(deleteddata.get(i))){
//					alldata.remove(j);
//					alldata.a
//					break;
//				}
			}
		}
		//System.out.println("Data After deletion..."+alldata+"Size.."+alldata.size());
		return alldata;
	}
	
	public static void main(String args[]) {
		System.out.println(getListData());
	}

}
