package collectionPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MapTest {

	public static List<String> getList1() {
		List<String> list = new ArrayList<>();
		list.add("Hi11");
		list.add("Hi12");
		list.add("Hi121");
		list.add("Hi13");
		list.add("Hi14");
		list.add("Hi15");
		list.add("Hi16");
		return list;
	}
	
	public static List<String> getZipCode() {
		List<String> list = new ArrayList<>();
		list.add("11");
		list.add("12");
		list.add("12");
		list.add("13");
		list.add("14");
		list.add("15");
		list.add("16");
		return list;
	}

	public static HashMap<String, String> getNameWithZip() {
		HashMap<String, String> info = new LinkedHashMap<>();
		for (int i = 0; i < getList1().size(); i++) {
			info.put(getList1().get(i), getZipCode().get(i));
		}
		return info;
	}
	
	public static List<String> getList2() {
		List<String> list = new ArrayList<>();
		list.add("Hi21");
		list.add("Hi22");
		list.add("Hi23");
		return list;
	}

	public static List<String> getList3() {
		List<String> list = new ArrayList<>();
		list.add("Hi31");
		list.add("Hi32");
		list.add("Hi33");
		return list;
	}

	public static List<String> getList4() {
		List<String> list = new ArrayList<>();
		list.add("Hi41");
		list.add("Hi42");
		list.add("Hi43");
		return list;
	}

	public static HashMap<String, List<String>> getInfo() {
		HashMap<String, List<String>> allergiesInfo = new HashMap<>();
		allergiesInfo.put("A", getList1());
		allergiesInfo.put("B", getList2());
		allergiesInfo.put("C", getList3());
		allergiesInfo.put("D", getList4());
		return allergiesInfo;
	}
	
	public static HashMap<Integer, String> getMapInfo() {
		HashMap<Integer, String> info = new LinkedHashMap<>();
		info.put(1, "HITESH");
		info.put(2, "BHARDWAJ");
		info.put(2, "SHARMA");
		info.put(4, "HARITASH");
		info.put(5, "PAN");
		return info;
	}

	public static void main(String args[]) {
//		HashMap<String, List<String>> ll = getInfo();
//		List<String> list = new ArrayList<>();
//		int i = 0;
//		for (Map.Entry<String, List<String>> map : ll.entrySet()) {
//			System.out.println(ll.size());
//
//			if (map.getValue().contains("Hi45") && map.getValue().contains("Hi42") && map.getValue().contains("Hi43")) {
//				list.add("Ok");
//			} else {
//				if (ll.size()-1 == i) {
//					list.add("Not Ok");
//				}
//			}
//			i++;
//			System.err.println("Value of I.." + i);
//		}
//
//		System.out.println(list);
		HashMap<String, String> data = new LinkedHashMap<>();
		HashMap<String, String> info = getNameWithZip();
		System.out.println(info);
		for (Map.Entry<String, String> map : info.entrySet()) {
			if (map.getValue().equalsIgnoreCase("12")) 
				data.put(map.getKey(), map.getValue());
		}
		System.out.println(data);
	}

}
