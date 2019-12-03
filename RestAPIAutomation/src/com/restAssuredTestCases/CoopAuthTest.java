package com.restAssuredTestCases;

import org.apache.commons.lang3.StringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.TestBase;

public class CoopAuthTest extends TestBase {

	// Global Variable Declaration
	private String clientId = "Testing_Coop_Test";
	private String clientSecret = "b550787d053841a13c250b2a5c4e6277";
	private String userName = "bhardwajhitesh2@rediffmail.com";
	private String password = "bhardwaj*#1458";
	private String accessToken = StringUtils.EMPTY;
	private String message = StringUtils.EMPTY;
	private String userId = StringUtils.EMPTY;

	@Test(priority = 0)
	public void getAccessTokenUsingClientCredentialGrant() {
		response = httpRequest
				.params("grant_type", "client_credentials", "client_id", clientId, "client_secret", clientSecret).when()
				.post("/token").then().extract().response();
		accessToken = response.jsonPath().getString("access_token");
		logger.info("Response " + response.asString());
	}

	@Test(enabled = false)
	public void getAccessTokenUsingAuthorization() {
		response = httpRequest
				.params("grant_type", "authorization_code", "client_id", clientId, "client_secret", clientSecret).when()
				.get("/authorize").then().extract().response();

		logger.info("Response " + response.asString());
	}

	@Test
	void getUserId() {
		response = httpRequest.auth().oauth2(accessToken).when().get("/api/me").then().extract().response();
		userId = response.jsonPath().getString("id");
		logger.info("User Id " + userId);
		Assert.assertTrue(userId.contains("593"), "Error Message!! User Id response does not contain the User user Id");
	}
}
