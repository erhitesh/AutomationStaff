package collectionPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class UniqueData {
	
	static String list11 = "Test1,Test2,Test3,Test4,Test5,Test6,Test7,Test8,Test9,Test10";
	static String list22 = "Test1,Test3,Test5,Test7";
	
	public static List<String> getUniqueDataFromLists() {
		List<String> list1 = new ArrayList<>(Arrays.asList(list11.split(",")));
		List<String> list2 = new ArrayList<>(Arrays.asList(list22.split(",")));
		try {
			System.out.println("Before "+list1);
			for (int i = 0; i < list1.size(); i++) {
				if (list1.contains(list2.get(i))) {
					list1.remove(list1.get(i));
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("After "+list1);
		return list1;
	}
	
	public static void main(String args[]) {
		List<String> list1 = new ArrayList<>(Arrays.asList(list11.split(",")));
		List<String> list2 = new ArrayList<>(Arrays.asList(list22.split(",")));
		System.out.println(list1.removeAll(list2));
		System.out.println("After "+list1);
	}

}
