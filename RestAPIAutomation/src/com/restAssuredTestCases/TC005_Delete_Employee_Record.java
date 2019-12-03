package com.restAssuredTestCases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.restAssuredData.PropertyOperations;
import com.restUtils.RestUtils;

import io.restassured.http.Method;

/**
 * @author Hitesh Bhardwaj
 *
 */
public class TC005_Delete_Employee_Record extends TestBase {

	String empName = RestUtils.empName();
	String empAge = RestUtils.empAge();
	String empSalary = RestUtils.empSalary();

	@BeforeClass
	public void createEmployee() {
		logger.info("************************* Started TC005_Put_Employee_Record ************************");
		
		empId = PropertyOperations.getPropertyValue("Configuration/Employee", "empId");
		response = httpRequest.request(Method.DELETE, "/delete/" + empId);
	}

	@Test(priority = 10)
	public void checkResponseBody() {
		logger.info("******************  Checking Response Body **************");
		logger.info(response.getBody().asString());

		Assert.assertTrue(response.getBody().asString().contains("Successfully! deleted Records"));
		Assert.assertEquals(response.getBody().asString().contains(empAge), true);
		Assert.assertEquals(response.getBody().asString().contains(empSalary), true);
	}

	@Test(priority = 20)
	public void checkStatusCode() {
		logger.info("******************  Checking Status Code **************");
		int statusCode = response.getStatusCode();
		logger.info("Status Code ==>" + statusCode);
		Assert.assertEquals(statusCode, 200, "Error Message both status code not matched...");
	}

	@Test(priority = 30)
	public void checkResponseTime() {
		logger.info("******************  Checking Response Time **************");
		long responseTime = response.getTime();
		logger.info("Response Time is ==>" + responseTime);

		if (responseTime > 2000) {
			logger.warn("Response Time is greater than 2000");
		}

		Assert.assertTrue(responseTime > 3000);
	}

	@Test(priority = 40)
	public void checkStatusLine() {
		logger.info("******************  Checking Status Line **************");
		String statusLine = response.getStatusLine();
		logger.info("Status Line is ==>" + statusLine);

		Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
	}

	@Test(priority = 50)
	public void checkContentType() {
		logger.info("******************  Checking Content Type **************");
		String contentType = response.getHeader("Content-Type");
		logger.info("Content Type is ==>" + contentType);

		Assert.assertEquals(contentType, "text/html; charset=UTF-8");
	}

	@AfterClass
	public void tearDown() {
		logger.info("************************* Finished TC001_Get_All_Employees **********************");
	}
}
