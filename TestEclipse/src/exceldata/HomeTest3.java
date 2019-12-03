package exceldata;

import java.io.IOException;

import org.testng.annotations.Test;

public class HomeTest3 {
	 @Test(priority=0)
	  public void test1() {
		  System.out.println("Test1");
	  }
	  
	  @Test(priority=1)
	  public void test2() {
		  System.out.println("Test2");
	  }
	  
	  @Test(priority=2)
	  public void test3() throws IOException {
		  System.out.println("Test3");
		  throw new IOException();
	  }
	  
	  @Test(priority=3)
	  public void test4() {
		  System.out.println("Test4");
	  }
	  
	  @Test(priority=4)
	  public void test5() {
		  System.out.println("Test5");
	  }
}
