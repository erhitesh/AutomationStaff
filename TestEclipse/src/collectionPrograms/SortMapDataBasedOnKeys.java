package collectionPrograms;

import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;


public class SortMapDataBasedOnKeys {
	
	public static void sortHashMapBasedOnKeys() {
		Map<String, Integer> hash = new HashMap<String, Integer>();
		hash.put("Dot", 4);
		hash.put("Hitesh", 5);
		hash.put("Bhardwaj", 2);
		hash.put("Carrot", 3);
		hash.put("Aryan", 1);
		System.out.println("HashMap Data Before Sorting..................");
		for (Map.Entry<String, Integer> map : hash.entrySet()) {
			System.out.println("Key" + map.getKey() + "Value=" + map.getValue());
		}

		System.out.println("HashMap Data After Sorting..................");
		Map<String, Integer> after = new TreeMap<>(hash);
		for (Map.Entry<String, Integer> map1 : after.entrySet()) {
			System.out.println("Key" + map1.getKey() + "Value=" + map1.getValue());
		}
	}
	
	public static void sortListBasedOnValue() {
		List<String> list = new ArrayList<>();
		list.add("Hitesh");
		list.add("Bhardwaj");
		list.add("Aryan");
		list.add("Wansh");
		list.add("Aditya");
		System.out.println("List Data Before Sorting..................");
		for (String str : list) {
			System.out.println(str);
		}
		
		System.out.println("List Data After Sorting..................");
		Collections.sort(list);
		for (String str : list) {
			System.out.println(str);
		}
		
		System.out.println("Reverse List Data After Sorting..................");
		Collections.reverse(list);
		for (String str : list) {
			System.out.println(str);
		}
	}
	
	public static void sortSetDataBasedOnValue() {
		Set<String> list = new HashSet<>();
		list.add("Hitesh");
		list.add("Bhardwaj");
		list.add("Aryan");
		list.add("Wansh");
		list.add("Aditya");
		System.out.println("Set Data Before Sorting..................");
		for (String str : list) {
			System.out.println(str);
		}
		
		System.out.println("List Data After Sorting..................");
		Set<String> list1 = new TreeSet<>(list);
		for (String str : list1) {
			System.out.println(str);
		}
		
	}
	
	public static void sortSetUsingComparator() {
		Set<Integer> random = new HashSet<>();
		for (int i = 0; i < 10; i++) {
			random.add((int)(Math.random()*100));
		}
		System.out.println("Set Data Before Sorting..................");
		System.out.println(random);
		System.out.println("Set Data After Sorting..................");
		Set<Integer> sorted = new TreeSet<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
		sorted.addAll(random);
		System.out.println(sorted);
		System.out.println("Sort Set Data In Descending order...");
		Set<Integer> sortedDes = new TreeSet<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		});
		sortedDes.addAll(random);
		System.out.println(sortedDes);
	}
	
	public static void main(String args[]) {
		//sortListBasedOnValue();
		//sortSetDataBasedOnValue();
		sortSetUsingComparator();
	}

}
