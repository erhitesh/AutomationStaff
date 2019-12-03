package com.restAssuredTestCases;

import java.io.File;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.github.fge.jsonschema.SchemaVersion;
import com.github.fge.jsonschema.cfg.ValidationConfiguration;
import com.github.fge.jsonschema.main.JsonSchemaFactory;
import com.restUtils.GlobalParam;

import io.restassured.http.ContentType;

public class SchemaValidatorTest extends TestBase {

	@Test
	public void testJsonSchemaValidatorForComment() {
		String jsonForCommentFileLocation = GlobalParam.CURRENT_PROJECT_PATH + GlobalParam.slash + "JsonSchema"
				+ GlobalParam.slash + "JsonSchemaValidatorForComment.json";

		JsonSchemaFactory schemaFactory = JsonSchemaFactory.newBuilder()
				.setValidationConfiguration(
						ValidationConfiguration.newBuilder().setDefaultVersion(SchemaVersion.DRAFTV4).freeze())
				.freeze();

		response = httpRequest.when().contentType(ContentType.JSON).accept(ContentType.JSON).queryParam("postId", "1")
				.get("/comments").then().assertThat()
				.body(matchesJsonSchema(new File(jsonForCommentFileLocation)).using(schemaFactory)).extract()
				.response();
		
		System.out.println("Json Schema Validator Response Status " + response.statusCode());
	}
}
