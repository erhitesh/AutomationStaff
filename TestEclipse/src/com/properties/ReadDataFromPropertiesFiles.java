package com.properties;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ReadDataFromPropertiesFiles {
	
	public static Properties getPropertiesInstance() {
		return new Properties();
	}
	
	public static void getSystemInfo() {
		Properties p = System.getProperties();
		Set set = p.entrySet();
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry entry = (Map.Entry) itr.next();
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}

	public static String getPropertiesvalue(String propertyName) {
		String proValue = "";
		FileReader reader = null;
		Properties pro;
		try {
			reader = new FileReader(new File("C:\\Automation_Data\\WSPhoton\\TestEclipse\\src\\com\\properties\\db.properties"));
			pro = getPropertiesInstance();
			pro.load(reader);
			proValue = pro.getProperty(propertyName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Property value..."+proValue);
		return proValue;
	}
	
	
	public static void main(String[] args) throws Exception {
		System.out.println("System Info");
		getSystemInfo();
		System.out.println("Property Value based on Key.....");
		getPropertiesvalue("password");
	}

}
