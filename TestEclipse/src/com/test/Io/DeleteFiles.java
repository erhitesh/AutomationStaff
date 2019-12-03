package com.test.Io;

import java.io.File;

public class DeleteFiles {
	
	public static void deleteFiles() {
		File file = new File("");
		File[] fileData = file.listFiles();
		for (int i = 0; i < fileData.length; i++) {
			if (fileData[i].exists())
				fileData[i].delete();
		}
		System.out.println(fileData.length);
	}
	
	
	public static void main(String args[]) {
		
		String name = "Hitesh";
		if (name.equalsIgnoreCase("Hitesh") || name.equalsIgnoreCase("asdnknd")) {
			System.err.println("admsalsmd");
		}
	}

}
