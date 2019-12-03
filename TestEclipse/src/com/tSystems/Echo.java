package com.tSystems;

abstract class Vibrate {
	static String s = "-";
	Vibrate() {
		s+= "V";
	}
}

public class Echo extends Vibrate {
	public Echo() {
		this(7);
		s+="e";
	}
	
	Echo(int numver){
		s+="e2";
	}
	
	public static void main(String args[]) {
		System.out.println("Made"+s+" ");
	}
	
	static {
		Echo e = new Echo();
		System.out.println("block"+s+" ");
	}
}
