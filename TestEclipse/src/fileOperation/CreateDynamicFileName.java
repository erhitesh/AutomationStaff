package fileOperation;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CreateDynamicFileName {
	
	public static String renamefile = "C:\\Hitesh\\"+new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date())+".txt";
	
	public static String file_directory = "C:\\Hitesh\\";
	
	
	public static File old_file = new File(file_directory+"Error.png");
	
	public static File rename_file = new File(renamefile);
	
	public static void main(String args[])throws IOException{
		
		System.out.println("Firstly check either new file is exists or not..");
		
		if(old_file.exists()){
			System.out.println("Absolute Path"+old_file.getAbsolutePath());
			System.out.println("File Exists rename it.");
			old_file.renameTo(rename_file);
		}
		else {
			System.out.println("Current Working Directory"+System.getProperty("user.dir"));
			System.out.println("Create new file");
			File new_file = new File(renamefile);
			new_file.createNewFile();
			
		}
		
		deleteFile();
	}
	
	public static void deleteFile(){
		if(old_file.exists()){
			System.out.println("Delete the exist file.");
			old_file.delete();
		}
		
		else{
			System.out.println("File not exists.");
		}
	}

}
