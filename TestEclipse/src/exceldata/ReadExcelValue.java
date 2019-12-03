package exceldata;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * 
 * @author thinksysuser
 *
 *         Read & write value from excel sheet.
 */
public class ReadExcelValue {
	public static String file_locationForRead = "src\\Excel\\JavaExcelSheet.xlsx";
	public static String file_locationForWrite = "src\\Excel\\JavaExcelSheet.xlsx";

	public static String sheet_name = "Address";

	public static void readValue() {

		List<XSSFCell> sheetdata = new ArrayList<XSSFCell>();
		try {
			FileInputStream fileinput = new FileInputStream(new File(file_locationForRead));

			// Create Instance of workbook

			XSSFWorkbook workbook = new XSSFWorkbook(fileinput);

			// Get Sheet Name by following ways.

			XSSFSheet sheet = workbook.getSheetAt(0);
			// XSSFSheet sheet = workbook.getSheet(sheet_name);

			Iterator<Row> rows = sheet.rowIterator();
			while (rows.hasNext()) {
				XSSFRow row = (XSSFRow) rows.next();
				System.out.println("");

				List<XSSFCell> data = new ArrayList<XSSFCell>();

				Iterator<Cell> cells = row.cellIterator();
				while (cells.hasNext()) {
					XSSFCell cell = (XSSFCell) cells.next();

					switch (cell.getCellType()) {
					case Cell.CELL_TYPE_STRING:
						System.out.print(cell.getStringCellValue() + "    ");
						break;

					case Cell.CELL_TYPE_NUMERIC:
						System.out.print(cell.getNumericCellValue() + "    ");
						break;

					default:
						System.out.println("Blank cell value:");
					}
					data.add(cell);
				}
				sheetdata.addAll(data);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	// public static void writeValue(){
	// try{
	// FileInputStream fileinput = new FileInputStream(new
	// File(file_locationForWrite));
	//
	// // Create Instance of workbook
	//
	// XSSFWorkbook workbook = new XSSFWorkbook(fileinput);
	//
	// // Get Sheet Name by following ways.
	//
	// XSSFSheet sheet = workbook.getSheetAt(0);
	//
	// Row header = sheet.createRow(0);
	//
	// header.createCell(0).setCellValue("Name");
	// header.createCell(1).setCellValue("Pincode");
	// header.createCell(2).setCellValue("Mobile");
	// header.createCell(3).setCellValue("Address1");
	// System.out.println("\n");
	// System.out.println("Hitesh Sheet Headers are created.");
	//
	//
	// }
	// catch(Exception e){
	// System.out.println(e.getMessage());
	// }
	// }

	public static void main(String args[]) {

		readValue();

		// writeValue();

	}
}
