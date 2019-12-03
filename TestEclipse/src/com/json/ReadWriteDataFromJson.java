package com.json;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * @author sony
 *
 */
public class ReadWriteDataFromJson {

	@SuppressWarnings("unchecked")
	public static void main(String args[]) throws IOException {
		System.out.println("Hello JSON...");
		
		// Creating JsonObject
		JSONObject object = new JSONObject();
		
		// putting data to json
		object.put("firstName", "Hitesh");
		object.put("lastName", "Bhardwaj");
		object.put("age", 29);
		
		// for address data create LinkedHashMap
		Map<Object, Object> m = new LinkedHashMap<>(5);
		m.put("HN", 59);
		m.put("Village", "Shekhpur Mam");
		m.put("Postal Code", 203203);
		m.put("District", "Bulandshahr");
		m.put("State", "U.P");
		
		// putting address to jsonobject
		object.put("address", m);
		
		// for phone number create jsonarray
		JSONArray arr = new JSONArray();
		
		m = new LinkedHashMap<>(2);
		m.put("type", "home");
		m.put("number", "212 555-1234");
		
		 // adding map to list 
		arr.add(m); 
		
		m = new LinkedHashMap<>(2);
		m.put("type", "fax");
		m.put("number", "212 555-1234");
		
		// again adding list to map
		arr.add(m);
		
		// putting phonenumber to jsonobject
		object.put("phoneNumber", arr);
		
		// Writing json to file
		PrintWriter pw = new PrintWriter("Person.json");
		pw.write(object.toString());
		System.out.println("Writing done....");
		
		// flush the object
		pw.flush();
		pw.close();
        
	}
}
