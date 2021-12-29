package com.tcs.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("creating a sheet");
		File f = new File  ("C:\\Users\\tagit\\eclipse-workspace\\Maven\\jaga.xlsx");
		FileInputStream	 fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet createsheet = wb.createSheet("jaga");
		Row createrow= ((org.apache.poi.ss.usermodel.Sheet) createsheet).createRow(0);
		Cell createcell = createRow.createcell(0);
		createcell.setCellValue("user Data");
		wb.getSheet("jaga").getRow(0).createCell(1).setCellValue("User Password");
		wb.getSheet("jaga").createRow(1).createCell(0).setCellValue("JANU");		
		wb.getSheet("jaga").getRow(1).createCell(1).setCellValue("123aaa");
		FileOutputStream fos= new FileOutputStream(f);
		wb.write(fos);
		wb.close();
		System.out.println("datasheet created");
		
		

	}

}
