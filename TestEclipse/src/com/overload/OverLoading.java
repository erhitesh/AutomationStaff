package com.overload;

public class OverLoading {
	
	public int getSum(int a, int b) {
		return (a+b);
	}
	
	public float getSum(float a, float b) {
		return (a+b);
	}
	
	public int getSum(int a, int b, int c) {
		return (a+b+c);
	}
	
	public static void main(String args[]) {
		OverLoading over = new OverLoading();
		over.getSum(1, 1);
	}

}
