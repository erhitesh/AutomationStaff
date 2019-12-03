package testSelenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRetryAnalyser {
	
	@Test(retryAnalyzer=testSelenium.ITestRetryAnalyser.class)
	public void testAssertion() {
		Assert.assertEquals("hitesh", "hitesh");
	}

	
	@Test(retryAnalyzer=testSelenium.ITestRetryAnalyser.class)
	public void testAssertion1() {
		Assert.assertEquals(true, false);
	}
}
