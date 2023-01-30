package POM5_ddfFAILEDTCscrss;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class UTILITYCLASS
{
	public static String GetTD(int rollindex, int collindex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Anmol\\Documents\\frameworks xl sheet\\AJ@.xlsx");
        Sheet sh = WorkbookFactory.create(file).getSheet("AJ");
        
        String value = sh.getRow(rollindex).getCell(collindex).getStringCellValue();
        return value;
        
	}
	public static void captureSS(WebDriver driver , int TCID) throws IOException
	{
		
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File desc = new File("C:\\Users\\Anmol\\Pictures\\Screenshots\\AJINKYA4" +TCID+ ".png");
	    FileHandler.copy(src, desc);
	}
	
	public static String READdataFrmPF(String key) throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Anmol\\eclipse-workspace\\workspace\\selenium\\PROPERTYFILE.properties");
		Properties prop = new Properties();
		prop.load(file);
		
		 String value = prop.getProperty(key);
		 return value;
		
	}
}
        
 