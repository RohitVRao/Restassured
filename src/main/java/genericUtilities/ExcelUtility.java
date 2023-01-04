package genericUtilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;


public class ExcelUtility 
{

	

	
	
	public String getDataFromExcel(String SheetName, int rowindex, int columnindex) throws Throwable
	{
		FileInputStream fis = new FileInputStream("./src/test/resources/restassured.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(SheetName);
		
			String ex = sh.getRow(rowindex).getCell(columnindex).getStringCellValue();
		    
		
	
	     return ex;
  }
	
	


}
