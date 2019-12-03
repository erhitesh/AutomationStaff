package com.test.eclipse;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class XLSXFormat {
	
	static Workbook workbook;
	static Sheet sheet;
	static Row rowData;
	static Cell cellData;
	static int rowCount = 0;
	static int cellCount = 0;

	public static ArrayList<Object> getSheetData(String fileLocation) {
		ArrayList<Object> list = new ArrayList<>();
		try {
			FileInputStream fis = new FileInputStream(new File(fileLocation));
			workbook = WorkbookFactory.create(new File(fileLocation));
			sheet = workbook.getSheetAt(0);
			rowCount = sheet.getLastRowNum();
			for (int k = 0; k <= cellCount; k++) {
				for (int i = 1; i <= rowCount; i++) {
					ArrayList<Object> sheetValues = new ArrayList<Object>();
					rowData = sheet.getRow(i);
					cellCount = rowData.getLastCellNum();
					sheetValues.add(sheet.getRow(i).getCell(k));
					list.add(sheetValues);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public static void main(String args[]) throws IOException {
		List<Object> data = getSheetData("/Users/kiwitech/Downloads/order_excel.xls");
		System.out.println(data);
		// for (int i = 0; i < data.size(); i++) {
		// System.out.println(data.get(i));
		// }
	}

}
