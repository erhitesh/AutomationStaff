package fileOperation;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryRelatedPro {
	
	public static String file_location = "D:\\";
	
	public static Path path = Paths.get("Error.png");
	public static File fileop = new File("D:\\");
	
	
	public static void main(){
		System.out.println("Path Value..>"+path);
		System.out.println("Image Absolute Location..>"+path.toAbsolutePath());
		
		
		if(fileop.isDirectory()){
			System.out.println("Return Value..True");
		}
		else{
			System.out.println("Return Value..False");
		}
		
	}

	public static void main(String args[]){
		main();
		// move file to another directory.
		File folder1 = new File(file_location+"Hitesh\\Bhardwwaj1");
		
		if(folder1.renameTo(new File(file_location+"ScreenShot"+folder1.getName()))){
			System.out.println("File is moved..");
		}
		else {
			System.out.println("File is not moved.");
		}
		
		// ceate directory ....
		makeDirectory("D:\\Hitesh\\Thinksys\\c9010535\\Hello\\Java\\Testing\\Automation");
		
	}
	/**
	 * This method is used to check if directory is exist.
	 * No need to create directory.
	 * else create directory.
	 * @param directoryName Directory Name you want to create.
	 */
	public static void makeDirectory(String directoryName){
		
		File dir = new File(directoryName);
		if(dir.exists()){
			System.out.println("Directory found.");
		}
		else{
			// if you want to create multiple directory use 'mkdirs' as Hitesh\\Thinksys\\Java\\Program\\Hello\\Testing use dir.mkdirs
			//dir.mkdir(); // for single directory create.
			dir.mkdirs();
			System.out.println("Directory is being created.");
		}
		
	}
}
