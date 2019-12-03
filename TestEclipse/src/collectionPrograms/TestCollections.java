package collectionPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class TestCollections {

	public static HashMap<String, String> map1() {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("A", "Amit");
		hm.put("B", "Vijay");
		hm.put("C", "Rahul");

		return hm;
	}

	public static HashMap<String, String> map2() {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("A", "Amit");
		hm.put("A", "Vijay");
		hm.put("C", "Rahul");

		return hm;
	}

	public static List<String> IndexRelated1() {
		List<String> list1 = new ArrayList<>();
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("D");

		return list1;
	}
	
	public static List<String> IndexRelated111() {
		List<String> list1 = new ArrayList<>();
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("DD");

		return list1;
	}

	public static List<String> IndexRelated2() {
		List<String> list1 = new ArrayList<>();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		list1.add("4");

		return list1;
	}
	
	public static List<String> IndexRelated222() {
		List<String> list1 = new ArrayList<>();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		list1.add("422");

		return list1;
	}

	public static List<String> IndexRelated3() {
		List<String> list1 = new ArrayList<>();
		list1.add("Hi");
		list1.add("Hello");
		list1.add("Hey");
		list1.add("What");

		return list1;
	}
	
	public static HashMap<Integer, String> info() {
		HashMap<Integer, String> bin = new LinkedHashMap<>();
		for (int i = 0; i < IndexRelated3().size(); i++) {
			bin.put(i, IndexRelated3().get(i));
		}
		
		return bin;
	}
	
	public static List<String> IndexRelated333() {
		List<String> list1 = new ArrayList<>();
		list1.add("Hi");
		list1.add("Hello");
		list1.add("Hey");
		list1.add("Whatasdas");

		return list1;
	}

	public static List<String> IndexRelated() {
		List<String> list1 = new ArrayList<>();
		list1.add("Hitesh");
		list1.add("Bhardwaj");
		list1.add("Sharma");
		list1.add("Test");

		return list1;
	}
	
	public static List<String> IndexRelated11() {
		List<String> list1 = new ArrayList<>();
		list1.add("Hitesh");
		list1.add("Bhardwaj");
		list1.add("Rahul");
		list1.add("Test");

		return list1;
	}

	public static HashMap<String, List<String>> getMapInfo() {
		HashMap<String, List<String>> map = new LinkedHashMap<>();
		String info = "";
		for (int i = 0; i < IndexRelated().size(); i++) {
			info = IndexRelated1().get(i) + " " + IndexRelated2().get(i) + " " + IndexRelated3().get(i);
			// System.out.println(info);
			map.put(IndexRelated().get(i), Arrays.asList(info.split(" ")));
		}

		return map;
	}
	
	public static HashMap<String, List<String>> getMapInfo11() {
		HashMap<String, List<String>> map = new LinkedHashMap<>();
		String info = "";
		for (int i = 0; i < IndexRelated11().size(); i++) {
			info = IndexRelated111().get(i) + " " + IndexRelated222().get(i) + " " + IndexRelated333().get(i);
			// System.out.println(info);
			map.put(IndexRelated11().get(i), Arrays.asList(info.split(" ")));
		}

		return map;
	}

	public void timeRelated() {
		/*
		 * String yy = new SimpleDateFormat("yyyy").format(new Date()); String
		 * str = "Created on:  19 May 2017; Updated on:  25 May 2017";
		 * System.out.println(str.indexOf("Updated on:"));
		 * System.out.println(str.substring(str.indexOf(':')+2,
		 * str.indexOf(';')).trim());
		 * System.out.println(str.substring(str.indexOf("Updated on:"),
		 * str.length()).replace("Updated on:", "").trim());
		 * 
		 * String str3 = "Time: 01:00 AM - 03:30 AM"; String start =
		 * str.substring(str.indexOf("Time:"), str3.indexOf('-')); String str1 =
		 * "12:30 am"; if (str1.length()==7) str1 = "0"+str1;
		 */
	}

	public static void main(String args[]) {
//		HashMap<String, List<String>> list = getMapInfo();
//		HashMap<String, List<String>> list11 = getMapInfo11();
//		for (Map.Entry<String, List<String>> map : list.entrySet()) {
//			if (list11.containsKey(map.getKey()) && list11.containsValue(map.getValue())) {
//				System.out.println("map Key.."+map.getKey()+"Map values.."+map.getValue());
//			}
//		}

//		String type = "A";
//		String status = "1";
//		String severity = "Hi";
//		for (Map.Entry<String, List<String>> map : list.entrySet()) {
//			// System.out.println(map.getValue());
//			if (map.getValue().contains(type) && map.getValue().contains(status) && map.getValue().contains(severity)) {
//				ll.add(map.getKey());
//				System.out.println("Matched");
//			}
//		}

		//System.out.println(ll);
		// for (int i = 0; i < list.size() ;i ++) {
		// if (list.get(set.toArray()[i]).contains(list1.get(i)) &&
		// list.get(set.toArray()[i]).contains(list2.get(i)) &&
		// list.get(set.toArray()[i]).contains(list3.get(i))) {
		// //System.out.println("value of I..."+i);
		// ll.add(list.entrySet().toArray()[i].toString().substring(0,
		// list.entrySet().toArray()[i].toString().indexOf("=")));
		// }
		// }

		/*
		 * List<Object> obj = new ArrayList<>(); List<Object> obj1 = new
		 * ArrayList<>(); List<String> list = new ArrayList<>(); List<String>
		 * list5 = new ArrayList<>(); list5.addAll(list1); list5.addAll(list2);
		 * obj1.add(list5); obj.add(list1); obj.add(list2); obj.add(list3);
		 * obj.add(list4); list.addAll(list1); list.addAll(list2);
		 * obj.add(list); for (int i = 0; i < obj.size(); i++) { List<String>
		 * data = (List<String>)obj.get(i); List<String> data1 = (List<String>)
		 * obj1.get(i); System.out.println("Array.."+data+"\n"+"Array.."+data1);
		 * for (int j = 0; j < data.size(); j++) {
		 * System.out.println(data.get(j).equalsIgnoreCase(data1.get(j))); } }
		 */
		// System.out.println("Max number..."+Collections.max(list)
		// +"Index..."+list.indexOf(Collections.max(list)));
		
/*		HashMap<Integer, String> va = info();
		Collection<String> ii = va.values();
		List<String> ss = new ArrayList<>();
		ss.addAll(ii);
		System.out.println(ss);
		for (Map.Entry<Integer, String> v : va.entrySet()) {
			if (v.getValue().equalsIgnoreCase("Hey")) {
				System.out.println("pok");
				break;
			}
		}
		System.out.println(va);*/
		
		HashMap<String, String> info = new LinkedHashMap<>();
		
		for (String string : map1().keySet()) {
			if (map2().containsKey(string))
				info.put(map1().get(string), map2().get(string));
		}
		System.out.println(info);
	}
}
