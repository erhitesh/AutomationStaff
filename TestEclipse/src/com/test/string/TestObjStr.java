package com.test.string;

public class TestObjStr {
	
	public void show(String str) {
		System.out.println("Hello String..."+str);
	}
	
	public void show(Object obj) {
		System.out.println("Hello Object..."+obj);
	}
	
	public static void main(String args[]) {
		TestObjStr obj = new TestObjStr();
		//obj.show("sdad");
		obj.show(null);
	}

}
