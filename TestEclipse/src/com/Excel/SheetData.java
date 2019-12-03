package com.Excel;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SheetData {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static XSSFRow row;
	static XSSFCell cell;
	static int rowCount = 0;
	static int cellCount = 0;

	public static List<Object> getExcelSheetData() {
		ArrayList<Object> list = new ArrayList<>();
		try {
			FileInputStream file = new FileInputStream(new File("C:\\Automation_Data\\WSPhoton\\TestEclipse\\src\\com\\Excel\\Sheet.xlsx"));
			workbook = new XSSFWorkbook(file);
			sheet = workbook.getSheetAt(0);
			rowCount = sheet.getLastRowNum();
			for (int i = 1; i < rowCount; i++) {
				ArrayList<String> sheetValues = new ArrayList<String>();
				row = sheet.getRow(i);
				cellCount = row.getLastCellNum();
				for (int j = 0; j < cellCount; j++) {
					sheetValues.add(sheet.getRow(i).getCell(j).getStringCellValue());
					/*
					 * switch (cell.getCellType()) { case Cell.CELL_TYPE_STRING:
					 * sheetValues.add(sheet.getRow(i).getCell(j).
					 * getStringCellValue()); case Cell.CELL_TYPE_BOOLEAN:
					 * sheetValues.add(sheet.getRow(i).getCell(j).
					 * getBooleanCellValue()); case Cell.CELL_TYPE_NUMERIC:
					 * sheetValues.add(sheet.getRow(i).getCell(j).
					 * getNumericCellValue()); case Cell.CELL_TYPE_BLANK:
					 * sheetValues.add(sheet.getRow(i).getCell(j).
					 * getErrorCellValue()); default: break; } }
					 */
				}
				list.add(sheetValues);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public static void main(String args[]) {
		List<Object> obj = getExcelSheetData();
		List<String> info = (List<String>)obj.get(0);
		System.out.println("Info..."+info);
		for (int i = 0; i < getExcelSheetData().size(); i++) {
			System.out.println("Sheet Row Number .." + i + "<<<<<Values>>>>>>>>     " + getExcelSheetData().get(i));
		}
	}
}