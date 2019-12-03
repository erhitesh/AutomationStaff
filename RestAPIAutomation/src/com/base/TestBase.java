package com.base;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.enums.ContentTypeEnum;
import com.google.protobuf.Method;
import com.restUtils.PropertyOperations;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;


public class TestBase {
	public String empId = "";
	public Logger logger;
	public static JsonPath path;
	public static WebDriver driver;
	public static RequestSpecification httpRequest;
	public static Response response;
	public static ResponseBody<?> responseBody;

	public RequestSpecification getSpec(Enum<?> contentType, Method method, String path, Object... pathParams) {
		RequestSpecification spec = (RequestSpecification) new RequestSpecBuilder();

		switch ((ContentTypeEnum) contentType) {
		case JSON:
			spec.contentType(ContentType.JSON);
			break;
		case XML:
			spec.contentType(ContentType.XML);
			break;
		case URLENC:
			spec.contentType(ContentType.URLENC);
			break;
		case BINARY:
			spec.contentType(ContentType.URLENC);
			break;
		default:
			break;
		}

		switch ((ContentTypeEnum) contentType) {
		case JSON:
			spec.accept(ContentType.JSON);
			break;
		case XML:
			spec.accept(ContentType.XML);
			break;
		default:
			break;
		}

		return spec;
	}

	@BeforeTest
	@Parameters("apiUrl")
	public void setUp(String apiUrl) {
		logger = Logger.getLogger("RestAssuredApiTesting");
		PropertyConfigurator.configure("log4j.properties");
		// Log Level
		logger.setLevel(Level.DEBUG);
		RestAssured.baseURI = PropertyOperations.getPropertyData("Environment", apiUrl);
		httpRequest = RestAssured.given();
	}

	@AfterTest
	public void tearDown() {
		RestAssured.reset();
	}
}
