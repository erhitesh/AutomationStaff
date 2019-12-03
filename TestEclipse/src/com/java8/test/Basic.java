package com.java8.test;

public class Basic {
	
	public int mul(int a)
	{
		int b=a*a;
		return b;
	}

	public void sum (int a, int b)
	{
		int c= a+b;
		System.out.println(c);
	}
	
	
	public int cube (int a, int b)
	{
		int c= a*b;
		System.out.println(c);
		return c;
	}
	
	
	public static void main(String[] args) {
		int x;
		int y;
		int a=5;
		
		Basic ob2 = new Basic();
	      x=ob2.mul(5)	;
	      System.out.println("Value of X..."+x);
	      y = ob2.cube(x, a);
	      System.out.println("Value of Y..."+y);
	      ob2.sum(x, y);
	}
}
