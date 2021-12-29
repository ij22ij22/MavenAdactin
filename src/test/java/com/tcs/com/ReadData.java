package com.tcs.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		File f = new File("C:\\Users\\tagit\\eclipse-workspace\\Maven\\src\\test\\java\\com\\tcs\\com");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
//read sheet data from data
		
		Sheet sheetAt = wb.getSheetAt(0);
		int row_size = sheetAt.getphysicalNumberOfRows();
		// get data using loops
		
		for (int i = 0; i < row_size; i++) {
			Row row = sheetAt.getRow(i);

			
			int cell_size = row.getPhysicalNumberOfCells();
			for (j = 0; j < cell_size; j++) {
				Cell cell = row.getCell(j);
				CellType = celltype = cell.getCellType();
			
				
					if (CellType.equals(CellType.STRING)) {
						String stringCellValue = cell.getStringCellValue();
						System.out.println(stringCellValue);
					}
					
					else if (CellType.equals(CellType.NUMERIC)) {
										double numericellValue = cell.getNumericCellValue();
										int value = (int) numericellValue;
										System.out.println(value);
					}
			}
		}
	}
}
