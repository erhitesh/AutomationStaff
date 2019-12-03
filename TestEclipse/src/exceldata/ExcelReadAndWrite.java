package exceldata;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadAndWrite {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static XSSFRow row;
	static XSSFCell cell;
	static String file_location = "C:\\Users\\sony\\Desktop\\EmpData.xlsx";
	static String sheet_name = "sheet1";
	public static void readData(String filLocation, String sheetName) throws IOException{
		
		FileInputStream fis = new FileInputStream(new File(filLocation));
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheetAt(0);
		int rowLength = sheet.getLastRowNum();
		for(int i = 0; i <= rowLength; i++){
			row = sheet.getRow(i);
			int cellLength = row.getLastCellNum();
			for(int j = 0; j < cellLength; j++){
				cell = row.getCell(j);
				if(Cell.CELL_TYPE_NUMERIC == cell.getCellType()){
					System.out.print(" "+cell.getNumericCellValue());
				}
				else if(Cell.CELL_TYPE_STRING == cell.getCellType()){
					System.out.print(" "+cell.getStringCellValue());
				}
				
				else if(Cell.CELL_TYPE_BOOLEAN == cell.getCellType()){
					System.out.print(" "+cell.getBooleanCellValue());
				}
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) throws IOException {
		readData(file_location, sheet_name);

	}

}
