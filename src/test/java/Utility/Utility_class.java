package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility_class {
	
	public static String getData(int rowindex,int colindex) throws Throwable {
		
	
	FileInputStream fle=new FileInputStream("D:\\SP Eclipse\\Automation\\zerodha.xlsx");
	   Sheet sh = WorkbookFactory.create(fle).getSheet("Sheet1");
	  String data = sh.getRow(rowindex).getCell(colindex).getStringCellValue();
	  return data;
	  
}
}