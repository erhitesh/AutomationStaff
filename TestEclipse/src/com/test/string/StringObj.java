package com.test.string;

public class StringObj {
	
	public static void main(String ats[]) {
		String str = "Hitesh";
		String st = "Hitesh";
		
		System.out.println("By Equals Method.."+str.equals(st)+"\n"+"By == Operators.."+(str==st));
		
		String s = str.concat("asdnka");
		System.out.println(s);
	}

}
