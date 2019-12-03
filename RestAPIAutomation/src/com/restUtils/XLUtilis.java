package com.restUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLUtilis {
	
	public static FileInputStream fis;
	public static FileOutputStream fos;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	
	public static XSSFSheet getSheetInstance(String xlFile, String xlSheet) {
		try {
			fis = new FileInputStream(new File(xlFile));
			workbook = new XSSFWorkbook(fis);
			sheet = (xlSheet.isEmpty()) ? workbook.getSheetAt(0) : workbook.getSheet(xlSheet);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e){}
		
		return sheet;
		
		
	}
	
	public static int getRowCount(String xlFile, String xlSheet) {
		int rowCount = 0;
		try {
			sheet = getSheetInstance(xlFile, xlSheet);
			rowCount = sheet.getLastRowNum();
			workbook.close();
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return rowCount;
	}

	public static int getCellCount(String xlFile, String xlSheet, int rowNum) {
		int cellCount = 0;
		try {
			sheet = getSheetInstance(xlFile, xlSheet);
			row = sheet.getRow(rowNum);
			cellCount = row.getLastCellNum();
			workbook.close();
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return cellCount;
	}
	
	public static String getCellData(String xlFile, String xlSheet, int rowNum, int colNum) {
		String cellData = "";
		try {
			sheet = getSheetInstance(xlFile, xlSheet);
			row = sheet.getRow(rowNum);
			cell = row.getCell(colNum);
			
			DataFormatter formatter = new DataFormatter();
			cellData = formatter.formatCellValue(cell);
			workbook.close();
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return cellData;
	}
	
	public static void setCellData(String xlFile, String xlSheet, int rowNum, int colNum, String cellData) {
		try {
			sheet = getSheetInstance(xlFile, xlSheet);
			row = sheet.getRow(rowNum);
			cell = row.getCell(colNum);
			cell.setCellValue(cellData);
			fos  = new FileOutputStream(xlFile);
			workbook.write(fos);
			workbook.close();
			fis.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		System.out.println(getRowCount(GlobalParam.CURRENT_PROJECT_PATH + "\\LoginData.xlsx", ""));
	}

}
