package com.java8.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Properties;
import org.apache.commons.lang3.RandomStringUtils;

public class PropertiesTest {

	public static List<String> getDataFromProperties(List<String> fetchData) {
		//String info = "";
		InputStream reader = null;
		List<String> values = new ArrayList<>();
		try {
			//FileReader reader = new FileReader("");
			reader = new FileInputStream("/Users/kiwitech/Desktop/pro.properties");
			Properties pro = new Properties();
			try {
				pro.load(reader);
				for (int i = 0; i < fetchData.size(); i++)
					values.add(pro.getProperty(fetchData.get(i)));
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			if (reader != null)
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		System.out.println(values);
		return values;
	}

	public static void storeDataInPropertiesFiles(List<String> storeData) {
		OutputStream writer = null;
		Properties pro;
		//String randomValue = "";
		try {
			writer = new FileOutputStream("Info.properties");
			pro = new Properties();
			for (int i = 0; i < storeData.size(); i++)
				pro.setProperty(storeData.get(i), RandomStringUtils.randomAlphanumeric(10));
			pro.store(writer, "User Info");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (writer != null)
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		System.out.println("Data Insert Successfully");
	}
	
	public static HashMap<String, String> getSystemInfo() {
		HashMap<String, String> info = new LinkedHashMap<>();
		Properties prop = System.getProperties();
//		Set set = prop.entrySet();
//		Iterator itr = set.iterator();
//		while (itr.hasNext()) {
//			Map.Entry<String, String> map = (Map.Entry<String, String>) itr.next();
//			System.out.println(""+map.getKey()+"......................"+map.getValue());
//			
//		}
		
//		for (Map.Entry<String, String> map : prop.entrySet()) {
//			
//		}
		
		return info;
	}

	public static void main(String arga[]) {
		String data = "userName password";
		List<String> getData = new ArrayList<>(Arrays.asList(data.split(" ")));
		getDataFromProperties(getData);
		storeDataInPropertiesFiles(getData);
//		getSystemInfo();
	}

}
