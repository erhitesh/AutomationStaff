package com.tSystems;

class Building {
	public Building() {
		System.out.println("Geek-Building");
	}
	
	public Building(String name){
		this();
		System.out.println("Geek Building String Constructor..."+name);
	}
}

public class House extends Building {
	public House() {
		System.out.println("Geek House");
	}
	
	public House(String name) {
		this();
		System.out.println("Geek House String Constructor.."+name);
	}
	
	public static void main(String args[]) {
		new House("Geek");
	}
}
