package com.Garbage;

public class GarbageCollection {
	
	public static void main(String args[]) {
		GarbageCollection garbage = new GarbageCollection();
		garbage = null;
		
		GarbageCollection garbage1 = new GarbageCollection();
		GarbageCollection garbage2 = new GarbageCollection();
		garbage2 = garbage1;
		
		new GarbageCollection();
		
		System.gc();
	}

	@Override
	protected void finalize() throws Throwable {
		//super.finalize();
		System.out.println("Grabage Collection Perform By Jvm by calling System.gc");
	}

}
