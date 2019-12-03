package collectionPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapInterface {
	
	public static void usingForLoop(){
		HashMap<Integer, String> hash = new HashMap<Integer, String>();
		hash.put(0, "Hitesh");
		hash.put(2, "Hites");
		hash.put(1, "Hitesh");
		for(Map.Entry m : hash.entrySet()){
		System.out.println("Key "+m.getKey()+" Value "+m.getValue());
		}
	}
	public static void withoutLoop(){
		HashMap<Integer, String> hash = new HashMap<Integer, String>();
		hash.put(0, "Hitesh");
		hash.put(2, "Hitesh");
		hash.put(1, "Hitesh");
		hash.put(1, "Harsh");
		
		Set<Entry<Integer, String>> set = hash.entrySet();
		Iterator<Entry<Integer, String>> itr = set.iterator();
		while(itr.hasNext()){
		Map.Entry<Integer, String> map = itr.next();
			System.out.println("Without using loop  "+map);
		}
		
		String value = hash.get(2);
		System.out.println("At index 2 value is "+value);
	}

	public static void main(String[] args) {
		//usingForLoop();
		withoutLoop();
		
	}

}
