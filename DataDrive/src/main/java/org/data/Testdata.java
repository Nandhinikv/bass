package org.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Testdata {
	

	public static void main(String[] args, int rownum) throws Exception {
		File f=new File("C:\\Users\\Win-UEFI\\eclipse-workspace\\DataDriven\\tstdata\\work.xlsl.xlsx");	
		
	  FileInputStream inputstream=new FileInputStream(f);
	  Workbook sheet=new XSSFWorkbook(inputstream);
	  
		Sheet sheet1 = sheet.getSheetAt(0);
		for (int i = 0; i < rownum; i++) {
			Row row = sheet1.getRow(1);
			System.out.println(i);
		}
	
	  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
