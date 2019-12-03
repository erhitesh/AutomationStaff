package fileOperation;

import java.io.File;
import java.io.IOException;

public class Path {

	public static void pathTest(File file) throws IOException{
		System.out.println("***********Path************"+file.getPath());
		System.out.println("Total space"+file.getTotalSpace());
		System.out.println("Total Reusable space"+file.getUsableSpace());
		System.out.println();
		System.out.println("***********AbsolutePath************"+file.getAbsolutePath());
		System.out.println();
		try{
			System.out.println("***********CanonicalPath************"+file.getCanonicalPath());
			System.out.println();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
	
	public static void createFile() throws IOException{
		File file = File.createTempFile("Hello Tester", ".temp");
		System.out.println("Path"+file.getPath());
		if(file.canRead() && file.canExecute() && file.canWrite()){
			System.out.println("****************Read, Write & Execute ******************");
		}
		else{
			System.out.println("Read Write execute opertion not perform");
		}
		
		if(file.delete()){
			System.out.println("File deleted");
			
		}
		
		File file1 = File.createTempFile("Hello Hitesh", ".jpg", new File("D://"));
		System.out.println("Path"+file1.getPath());
		
		
		
		if(file1.delete()){
			System.out.println("File deleted");
			
		}
				
	}
	
	public static void main(String[] args) throws IOException {
		File child = new File("../../java.txt");
		pathTest(child);
		
		File parent = child.getParentFile();
		pathTest(parent);
		
		createFile();
	
	}
	
	
}
