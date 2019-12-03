package collectionPrograms;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertyRelatedPro {
	
	public static void getValueFromPropertyFile() {
		try{
		FileReader file = new FileReader(new File("D:\\Demo\\JavaProgramingTest\\src\\collectionPrograms\\data.properties"));
		Properties prop = new Properties();
		prop.load(file);
		
		System.out.println("UserName..>"+prop.getProperty("UserName"));
		System.out.println("UserPassword..>"+prop.getProperty("UserPassword"));
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void getAllSystemProperty() {
		try{
			Properties p=System.getProperties();  
			Set set=p.entrySet();  
			  
			Iterator itr=set.iterator();  
			while(itr.hasNext()){  
			Map.Entry entry=(Map.Entry)itr.next();  
			System.out.println(entry.getKey()+" = "+entry.getValue());  
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public static void writeDataToPropertyFile() {
		try{
			FileWriter file = new FileWriter("Hitesh.properties");
			Properties prop = new Properties();
			
			prop.setProperty("User..", "Aryan");
			prop.setProperty("password..", "noida123300");
			prop.setProperty("Address", "Shekhpur");
			
			prop.store(file, "This is property file...............");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public static void main(String args[]) {
//		getValueFromPropertyFile();
//		
//		getAllSystemProperty();
//		
		writeDataToPropertyFile();
	}

}
