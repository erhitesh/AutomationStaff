package com.testng;

import org.testng.annotations.*;

public class MyTestClass2 extends TestAnnotations {

//	@Parameters({"writer","date"})
//	@Test
//	public void myTestMethod3(@Optional("Hitesh")String writer1, int date1) {
//		System.out.println("myTestMethod3"+"writerName..."+writer1+" Date value..."+date1);
//	}

	@Test
	public void myTestMethod2() {
		System.out.println("myTestMethod2");
	}
}
