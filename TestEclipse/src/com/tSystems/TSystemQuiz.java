package com.tSystems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class TSystemQuiz {
	
	public static void hashSetRelated() {
		HashSet<String> hash = new HashSet<>();
		hash.add("Game");
		hash.add("On");
		hash.add("Game");
		hash.add("GameOnGame");
		System.out.println("HashSet Data..."+hash);
	}
	
	public static void listOperations() {
		List<String> hash = new ArrayList<>();
		hash.add("Game");
		hash.add("On");
		hash.add("Game");
		hash.add("GOG");
		hash.add("GameOnGame");
		
		List<String> list = new ArrayList<>();
		list.add("Game");
		hash.removeAll(list);
		System.out.println("List Data..."+hash);
	}
	
//	public int getData() {
//		return 0;
//	}
//	
//	public long getData() {
//		return 1;
//	}
	
	public static void main(String args[]) {
		hashSetRelated();
		listOperations();
	}

}
