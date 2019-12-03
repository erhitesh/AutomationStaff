package com.restAssuredTestCases;

import java.util.List;

import org.testng.annotations.Test;

import com.base.TestBase;
import com.restAssuredAPI.Photo;

public class ResponseAsList extends TestBase {

	@Test
	void fetchValuesAsList() {
		System.out.println("**********************************************************************************");
		System.out.println("***********                    New Test Case Started******************************");
		System.out.println("***********                    New Test Case Started******************************");
		System.out.println("***********                    New Test Case Started******************************");
		System.out.println("***********                    New Test Case Started******************************");
		System.out.println("***********                    New Test Case Started******************************");
		System.out.println("**********************************************************************************");
	}

	@Test
	public void testFetchValueAsList() {
		List<String> responseList = httpRequest.get().then().extract().body().jsonPath().get("title");

		for (String string : responseList) {
			System.out.println("! URL " + string);
		}
	}

	@Test
	public void testFetchValueAsClass() {
		List<Photo> responseList = httpRequest.get().then().extract().body().jsonPath().getList(".", Photo.class);
		System.out.println("Url size ... " + responseList.size());
		for (Photo photo : responseList) {
			System.out.println("AlbumbId " + photo.albumId + " ! Id " + photo.id + " ! Title " + photo.title + " ! Url "
					+ photo.url + " ! AlbumbId " + photo.albumId);
		}
	}
}
