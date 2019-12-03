package com.restAssuredTestCases;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasXPath;
import static org.hamcrest.Matchers.is;

import java.io.IOException;
import java.io.InputStream;

import org.testng.annotations.Test;

import com.base.TestBase;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;


public class GroovyFunctionTest extends TestBase {
	
	@Test
	public void testXpathUsingAbsolute() {
		httpRequest.get("/10").then().body(hasXPath("/CUSTOMER/CITY[contains(text(),'Dallas')]"));
	}
	
	@Test
	public void testXpathUsingRelative() {
		httpRequest.get("/10").then().body(hasXPath("//*[contains(text(),'Dallas')]"));
	}
	
	@Test
	public void testXpath() {
		httpRequest.get("/10").then().body("CUSTOMER.ID", containsString("10"), "CUSTOMER.FIRSTNAME", equalTo("Sue")).log().all();
	}
	
	@Test
	public void testXpathUsingText() {
		httpRequest.get("/10").then().body("CUSTOMER.text()", equalTo("10SueFuller135 Upland Pl.Dallas"));
	}
	
	// Using another url for
	@Test
	public void testWithoutRoot() {
		httpRequest.get().then().body("RestResponse.result.name", is("Italy"))
				.body("RestResponse.result.alpha2_code", is("IT")).body("RestResponse.result.alpha3_code", is("ITA"));
	}

	@Test
	public void testWithRoot() {
		httpRequest.get().then().rootPath("RestResponse.result").body("name", is("Italy")).body("alpha2_code", is("IT"))
				.body("alpha3_code", is("ITA"));
	}
	
	@Test
	public void testDetachRoot() {
		httpRequest.get().then().rootPath("RestResponse.result").body("name", is("Italy")).body("alpha2_code", is("IT"))
				.detachRootPath("result").body("result.alpha3_code", is("ITA"));
	}
	
	@Test
	public void testGetResponseAsString() {
		String responseAsString = httpRequest.get().asString();
		System.out.println("Response As String:\n\n" + responseAsString);
	}
	
	@Test
	public void testGetResponseAsInputStream() throws IOException {
		InputStream responseAsInputStream = httpRequest.get().asInputStream();
		System.out.println("Stream Length " + responseAsInputStream.toString().length());
		responseAsInputStream.close();
	}
	
	@Test
	public void testGetResponseAsByteArray() {
		byte [] byteArr = httpRequest.get().asByteArray();
		System.out.println("Byte Array Length " + byteArr.length);
	}
	
	@Test
	public void testExtractDetailUsinXpath() {
		RestAssured.baseURI = "http://jsonplaceholder.typicode.com/photos";
		httpRequest = RestAssured.given();
		
		String href = httpRequest.get("/1").then().contentType(ContentType.JSON).body("albumId", equalTo(1)).extract().path("url");
		System.out.println("Href....." + href);
	}
	
	@Test
	public void testExtractDetailInOneLine() {
		RestAssured.baseURI = "http://jsonplaceholder.typicode.com/photos";
		httpRequest = RestAssured.given();
		
		String thumbnailUrl = httpRequest.get("/1").path("thumbnailUrl");
		System.out.println("Fetched thumbnailUrl...." + thumbnailUrl);
		
		//type 2
		String thumbnailUrl2 = httpRequest.get("/1").andReturn().jsonPath().getString("thumbnailUrl");
		System.out.println("Fetched thumbnailUrl...." + thumbnailUrl2);
	}
}
