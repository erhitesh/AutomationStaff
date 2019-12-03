package com.restAssuredTestCases;

import java.util.List;

import org.testng.annotations.Test;

import com.base.TestBase;
import com.restAssuredAPI.User;

import io.restassured.http.ContentType;


public class UserTestCase extends TestBase {

	@Test
	public void validateUserDataTestCase() {
		List<User> responseAsUserList = httpRequest.when().contentType(ContentType.JSON).accept(ContentType.JSON).get()
				.then().extract().body().jsonPath().getList(".", User.class);

		for (User user : responseAsUserList) {
			System.out.println("[ User Id " + user.getId() + " Name " + user.getName() + " Address Info " + "["
					+ user.getAddress().getCity() + " " + user.getAddress().getZipcode());
		}
	}
}
