package collectionPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class ListPro {
	
	public static List<String> checkContainsMethod1() {
		List<String> list1 = new ArrayList<>();
		list1.add("AAA");
		list1.add("B");
		list1.add("C");
		list1.add("DD");

		return list1;
	}
	
	public static List<String> checkContainsMethod2() {
		List<String> list1 = new ArrayList<>();
		list1.add("fff");
		list1.add("g");
		list1.add("h");
		list1.add("DD");

		return list1;
	}
	
	public static List<String> checkContainsMethod3() {
		List<String> list1 = new ArrayList<>();
		list1.add("BBB");
		list1.add("B");
		list1.add("C");
		list1.add("DD");

		return list1;
	}
	
	public static HashMap<String, List<String>> getList() {
		HashMap<String, List<String>> info = new LinkedHashMap<>();
		//List<String> info = new ArrayList<>();
		info.put(checkContainsMethod1().get(0), checkContainsMethod1());
		info.put(checkContainsMethod2().get(0), checkContainsMethod2());
		info.put(checkContainsMethod3().get(0), checkContainsMethod3());
		
		return info;
	}
	
	public static List<String> checkContains() {
		List<String> list1 = new ArrayList<>();
		list1.add("Dr. Bwellbfbddcgbfhdjetester Doctor");
		list1.add("Dr. Bwellbfbddcdjdaijhtester Doctor");
		list1.add("Dr. Bwellbfbddcedjibbdtester Doctor");
		list1.add("Dr. Bwellbfbddcdggjfihtester Doctor");
		list1.add("Dr. Bwellbfbddcfefhjcctester Doctor");

		return list1;
	}
	
	public static String getMiddleName(String doctorName) {
		String middleName = "";
		if (doctorName.contains(" ")) {
			middleName = doctorName.substring(doctorName.indexOf(" ") + 1, doctorName.length());
			if (middleName.contains(" "))
				middleName = middleName.substring(0, middleName.indexOf(" "));
		}
		
		return middleName;
	}
	
	public static void main(String args[]) {
		for (int i = 0; i < checkContains().size(); i++) {
			System.out.println(checkContains().get(i).contains(getMiddleName("Dr. Bwellbfbddcdggjfihtester Doctor")));
			if (checkContains().get(i).contains(getMiddleName("Dr. Bwellbfbddcdggjfihtester Doctor"))) {
				System.out.println("Index.."+checkContains().get(i).indexOf(getMiddleName("Dr. Bwellbfbddcedjibbdtester Doctor")));
			}
		}
	}

}
