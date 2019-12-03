//package com.api;
//
//import java.io.IOException;
//import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.util.Scanner;
//
//import org.testng.annotations.Test;
//
//import org.json.JSONArray;
//import org.json.JSONException;
//import org.json.JSONObject;
//
//
//public class APITesting {
//	
//	@Test
//	public void testApi() throws JSONException {
//		String urlData = "http://maps.googleapis.com/maps/api/geocode/json?address=chicago&sensor=false";
//		try {
//			URL url = new URL(urlData);
//			HttpURLConnection con = (HttpURLConnection) url.openConnection();
//			con.setRequestMethod("GET");
//			con.setRequestProperty("Accept", "application/json");
//			
//			if (con.getResponseCode()  != 200)
//				throw new RuntimeException("HTTP Response Code..."+con.getResponseCode());
//			
//			Scanner scan = new Scanner(url.openStream());
//			String entireResponse = new String();
//			while (scan.hasNext())
//			entireResponse += scan.nextLine();
//			System.out.println("Response : "+entireResponse);
//			scan.close();
//			
////			JSONObject obj = new JsonObject(entireResponse);
////			
//			JSONObject obj = new JSONObject(entireResponse );
//			String responseCode = obj.getString("status");
//			System.out.println("status : " + responseCode);
//			JSONArray arr = obj.getJSONArray("results");
//			for (int i = 0; i < arr.length(); i++) {
//			String placeid = arr.getJSONObject(i).getString("place_id");
//			System.out.println("Place id : " + placeid);
//			String formatAddress = arr.getJSONObject(i).getString(
//			"formatted_address");
//			System.out.println("Address : " + formatAddress);
//			//validating Address as per the requirement
//			if(formatAddress.equalsIgnoreCase("Chicago, IL, USA"))
//			{
//			System.out.println("Address is as Expected");
//			}
//			else
//			{
//			System.out.println("Address is not as Expected");
//			}
//			}
//			con.disconnect();
//			} catch (MalformedURLException e) {
//			e.printStackTrace();
//			} catch (IOException e) {
//			e.printStackTrace();
//			}
//	}
//
//}
