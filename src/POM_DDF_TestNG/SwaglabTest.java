package POM_DDF_TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwaglabTest
{
	WebDriver driver;
	Sheet sh;
	Swaglablogintest login;
	Swaglabhomepage home;
	 Swaglabmenupage menu;
	
	
	
	@BeforeClass
	 public void openbrowser() throws EncryptedDocumentException, IOException, InterruptedException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Anmol\\Documents\\frameworks xl sheet\\AJ@.xlsx");
		sh = WorkbookFactory.create(file).getSheet("AJ");
		
	    driver = new ChromeDriver();
	    driver.get("https://www.saucedemo.com/");
	    Thread.sleep(2000);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    
	    
	   login = new Swaglablogintest(driver);
	   home = new Swaglabhomepage(driver);
	   menu = new Swaglabmenupage(driver);
	}
	
	   @BeforeMethod
	   public void opentobrowser() throws InterruptedException
	   {
		  login.inpSwaglabUsername(sh.getRow(0).getCell(0).getStringCellValue());
		  login.inpSwaglabpassword(sh.getRow(0).getCell(1).getStringCellValue());
		  login.inpSwaglablogin();
	   }
	  
	   @Test
	   public void verifylogo() throws InterruptedException
	   {
		  boolean result1 = home.inpSwaglabverifylogo();
		  Assert.assertTrue(result1);
	  }
	   
	   @AfterMethod
	   public void openmenu() throws InterruptedException
	   {
		   home.inpSwaglabopenmenu();
		}
	   @AfterClass
	   public void Closebrowser()
	   {
		   menu.inpSwaglablogout();
		   driver.close();
	   }
	   
	   
	   
	}