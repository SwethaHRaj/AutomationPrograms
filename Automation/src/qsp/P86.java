package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class P86 {
	
	public static void main(String[] args) throws IOException,EncryptedDocumentException {
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		String data=wb.getSheet("CreateCustomer").getRow(3).getCell(1).getStringCellValue();
		System.out.println(data);
	}
}