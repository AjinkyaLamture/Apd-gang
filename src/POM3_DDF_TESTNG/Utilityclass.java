package POM3_DDF_TESTNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utilityclass
{
	public static String GetTD(int rowindex, int collindex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Anmol\\Documents\\frameworks xl sheet\\AJ@.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("AJ"); 
		
		String value = sh.getRow(rowindex).getCell(collindex).getStringCellValue();
		return value;
		
	}
	
	public static void captureSS(WebDriver driver, int TCID) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File desc = new File("C:\\Users\\Anmol\\Pictures\\Screenshots\\TestCaseID"+TCID+".png");
		FileHandler.copy(src, desc);
	}

}
