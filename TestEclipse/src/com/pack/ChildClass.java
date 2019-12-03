package com.pack;

class Parent {
	
	public Parent() {
		System.out.println("Parent default");
	}
	
	public Parent(String arga) {
		System.out.println("Parent Para......"+arga);
	}
	
}

public class ChildClass extends Parent {
	
	public ChildClass(String str, int number) {
		System.out.println("Child String Value..."+str+"\n"+"Child Int Value..."+number);
	}

	
//	public ChildClass() {
//		System.out.println(" Child Default");
//	}

	public static void main(String args[]) {

		Parent p = new ChildClass("sdmasld", 12);
	}

}
