package com.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOperation {
	
	public String path;
	public FileInputStream fis = null;
	public FileOutputStream fos = null;
	
	private XSSFWorkbook workBook = null;
	private XSSFSheet sheet = null;
	private XSSFRow row = null;
	private XSSFCell cell = null;
	
	public ExcelOperation(String path) {
		this.path = path;
		try {
			fis = new FileInputStream(path);
			try {
				workBook = new XSSFWorkbook(fis);
			} catch (IOException e) {
				e.printStackTrace();
			}
			sheet = workBook.getSheetAt(0);
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public int getRowCount(int rowIndex) {
		return sheet.getLastRowNum();
	}
	
	public boolean setCellData(String sheetName, String colName, int rowNumber, String data) {
		try {
			fis = new FileInputStream(path);
			workBook = new XSSFWorkbook(fis);
			if (rowNumber <= 0)
				return false;
			int index = workBook.getSheetIndex(sheetName);
			int colNum = -1;
			if (index == -1)
				return false;
			
			sheet = workBook.getSheetAt(index);
			
			row = sheet.getRow(0);
			
			for (int i = 0; i < row.getLastCellNum(); i++) {
				if (row.getCell(i).getStringCellValue().trim().equals(colName))
					colNum = i;
			}
		}catch(Exception e) {
			
		}
		return false;
	}

	
	public String getCellData(String sheetName, String colName, int rowNumber) {
		String data = "0";
		
		return data;
	}
	
	public static void main(String args[]) {
		
	}
}
