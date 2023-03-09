package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDriven {
	
	/*
	 * This Method is a generic method for reading the data from the Property File
	 * @author Swetha H R
	 * @param key
	 * @return String
	 * @throws IOException
	 */
	public String getPropertyData(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./data/commonData.property");
		Properties p=new Properties();
		p.load(fis);
		String data=p.getProperty(key);
		return data;
	}   
	
	/*
	 * This is a method to read the data from Excel File
	 * @author Swetha H R
	 * @param sheetName
	 * @param row
	 * @param cell
	 * @return String
	 * @throws IOException
	 * @throws EncryptedDocumentException
	 */
	public String readExcelData(String sheetName, int row, int cell) throws IOException, EncryptedDocumentException{
		FileInputStream fis= new FileInputStream("./data/testScript.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		String data=wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		return data;		
	}
	
	/*
	 * This is a generic method for writing the data into Excel File
	 * @author Swetha H R
	 * @param sheetName
	 * @param row
	 * @param cell
	 * @param data
	 * @throws IOException
	 * @throws EncryptedDocumentException
	 */
	public void writeExcelData(String sheetName,int row, int cell, String data) throws IOException, EncryptedDocumentException{
		FileInputStream fis=new FileInputStream("./data/testScript.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		wb.getSheet(sheetName).getRow(row).getCell(cell).setCellValue(data);
		FileOutputStream fos=new FileOutputStream("./data/testScript.slxs");
		wb.write(fos);
		wb.close();
	}
	
	
}
