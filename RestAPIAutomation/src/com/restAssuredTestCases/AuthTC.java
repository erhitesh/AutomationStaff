package com.restAssuredTestCases;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.base.TestBase;

import io.restassured.http.Method;
import io.restassured.response.Response;


public class AuthTC extends TestBase {

	@SuppressWarnings("unchecked")
	@Test
	public void getWeatherDetail() {
		// Body Data
		JSONObject obj = new JSONObject();
		obj.put("username", "admin");
		obj.put("password", "password123");
		// Add Header
		httpRequest.header("Content-Type", "application/json");

		// Add jsonData to body
		httpRequest.body(obj.toJSONString());
		Response response = httpRequest.request(Method.POST, "/auth");
		System.out.println("Response " + response);
		String token = response.jsonPath().get("token");
		System.out.println("Auth Token  " + token);

	}
}
