package qsp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class P88 {
	
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		
		int rowCount=wb.getSheet("CreateCustomer").getLastRowNum();
		for(int i=0;i<rowCount;i++) {
			String name=wb.getSheet("CreateCustomer").getRow(i).getCell(1).getStringCellValue();
			String branch=wb.getSheet("CreateCustomer").getRow(i+1).getCell(2).getStringCellValue();
			System.out.println((i+1)+") "+name+"--->"+branch);
		}
				                                                 
	}
}