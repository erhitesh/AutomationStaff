package com.tSystems;

public class TestStaticBlock {
	static int num;
	static String mystr;
	public TestStaticBlock() {
		num = 100;
		mystr = "Constructor";
	}
	
	static {
		System.out.println("Static Block 1");
		num = 68;
		mystr = "Block1";
	}	static {
		System.out.println("Static Block 2");
		num = 98;
		mystr = "Block2";
	}
	public static void main(String args[]) {
		TestStaticBlock test = new TestStaticBlock();
		System.out.println(TestStaticBlock.num);
		System.out.println(TestStaticBlock.mystr);
	}
}
