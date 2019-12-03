package testSelenium;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ITestRetryAnalyser implements IRetryAnalyzer {

	int minRetryCount = 0;
	int maxRetryCount = 3;
	
	@Override
	public boolean retry(ITestResult result) {
		if (!result.isSuccess()) {
			if (minRetryCount < maxRetryCount) {
				System.out.println("Testcase Name..."+result.getTestName());
				minRetryCount++;
				result.setStatus(ITestResult.FAILURE);
				return true;
			}
		}
		else
			result.setStatus(ITestResult.SUCCESS);
		return false;
	}

}
