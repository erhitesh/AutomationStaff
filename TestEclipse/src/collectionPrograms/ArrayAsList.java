package collectionPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayAsList {

	public static void arrayAsArrayList() {
		ArrayList<String> al = new ArrayList<String>();
		// Adding the elements to the array list class
		al.add("Hitesh");
		al.add("Aryan");
		al.add("Ravi");
		al.add(1, "Shekhpur Mam");
		// get the seconds element from arraylist.
		System.out.println(al.get(1));
		System.out.println("Using Iterator interface....");
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
		System.out.println(itr.next());
		}
		System.out.println("Using for for loop...");
		for (String obj : al) {
			System.out.println(obj);
		}
	}

	public static void arrayListAsList() {
		List<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("Hi");
		list.add("Jonny");
		System.out.println("ArrayList as list");
		System.out.println(list);
		System.out.println(list.get(0));
	}
	
	public static void linkedListAsList(){
		List<String> list = new LinkedList<String>();
		list.add("Hello");
		list.add("Hi");
		list.add("Gaddar");
		System.out.println("LinkedList as list");
		System.out.println(list);
		System.out.println(list.get(0));
	}

	public static void main(String[] args) {
		
		arrayAsArrayList();
		arrayListAsList();
		linkedListAsList();

	}

}
