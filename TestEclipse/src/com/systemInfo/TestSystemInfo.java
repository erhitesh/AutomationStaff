package com.systemInfo;

public class TestSystemInfo {

	public static void main(String args[]) {
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getenv("UserNameFortesting"));
		System.out.println(System.getProperties());
		System.out.println(System.getenv("JAVA_HOME"));
	}
}
