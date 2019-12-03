package programmingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RuntimePro {

	
	public static StringBuffer getDeviceName(){
		StringBuffer sb = null;
		try{
		 sb = new StringBuffer();
			Process p = Runtime.getRuntime().exec(new String[] {"C:\\Android\\sdk\\build-tools\\23.0.1\\aapt\\", "dump badging D:\\APK\\Naukari.apk"});// dump badging D:\\APK\\Naukari.apk");
		    p.waitFor();

		    BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));

		    String line = "";			
		    while ((line = reader.readLine())!= null) {
		
		    	if ( line.contentEquals("package: name"))
		    	sb.append(line);
		    }
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return sb;
	}
	
	public static void main(String[] args) {
		String device_name = getDeviceName().toString();
		System.out.println(device_name);
		//System.out.println(device_name.replaceAll("List of devices attached", "").replaceAll("device", ""));
			
	}
}