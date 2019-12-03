package testAppium;

import org.testng.annotations.Test;

public class FirstTest {
	
	CreateAccount acc = new CreateAccount();
	
	@Test
	public void testHsjdh() {
		System.out.println("Hell");
	}
	
	@Test
	public void testBasic() {
		acc.clickOnProfileBtn();
	}

}
