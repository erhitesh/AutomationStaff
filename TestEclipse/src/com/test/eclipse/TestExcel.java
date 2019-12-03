package com.test.eclipse;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestExcel {

	static Workbook workbook;
	static Sheet sheet;
	static Row rowData;
	static Cell cellData;
	static int rowCount = 0;
	static int cellCount = 0;
	
	public static List<String> getSheetData(String fileLocation, String columnName) {
		List<String> list = new ArrayList<>();
		try {
			FileInputStream fis = new FileInputStream(new File(fileLocation));
			Workbook wb = WorkbookFactory.create(fis);
		    Sheet sheet = wb.getSheetAt(0);

		    for (int j=1; j< sheet.getLastRowNum()+1; j++) {
		    	int cellValue = 0;
		        Row row = sheet.getRow(j);
		        if (columnName.equalsIgnoreCase("quantity"))
		        	cellValue = 0;
		        else if (columnName.equalsIgnoreCase("product"))
		        	cellValue = 1;
		        else if (columnName.equalsIgnoreCase("template"))
		        	cellValue = 2;
		        else if (columnName.equalsIgnoreCase("line1"))
		        	cellValue = 3;
		        else if (columnName.equalsIgnoreCase("line2"))
		        	cellValue = 4;
		        else if (columnName.equalsIgnoreCase("line3"))
		        	cellValue = 5;
		        else if (columnName.equalsIgnoreCase("line4"))
		        	cellValue = 6;
		        else if (columnName.equalsIgnoreCase("Plant URL"))
		        	cellValue = 7;
		        else if (columnName.equalsIgnoreCase("Plant Id"))
		        	cellValue = 8;
		        Cell cell = row.getCell(cellValue); 
		        list.add(cell.toString());
		    }
			}catch(Exception e) {
				e.printStackTrace();
			}
		return list;
	}
	
	public static void main(String args[]) {
		List<String> data = new ArrayList<>();
		data.add("quantity");
		data.add("product");
		data.add("template");
		data.add("line1");
		data.add("line2");
		data.add("line3");
		data.add("line4");
		data.add("Plant URL");
		data.add("Plant Id");
		for (int i = 0; i < data.size(); i++) {
			List<String> list = getSheetData("/Users/kiwitech/Downloads/order_excel.xls", data.get(i));
			System.out.println(list);
		}
		
	}
}
