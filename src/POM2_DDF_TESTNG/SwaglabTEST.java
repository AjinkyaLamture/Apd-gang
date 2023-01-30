package POM2_DDF_TESTNG;

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

import POM_DDF_TestNG.Swaglablogintest;

public class SwaglabTEST
{
	WebDriver driver;
	Sheet sh;
	Swaglabloginpage login;
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
	    Thread.sleep(2000);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    
	    
	   login = new Swaglabloginpage(driver);
	   home = new Swaglabhomepage(driver);
	   menu = new Swaglabmenupage(driver);
	}
	
	   @BeforeMethod
	   public void opentobrowser() throws InterruptedException
	   {
		  login.inpSwaglabusername(sh.getRow(0).getCell(0).getStringCellValue());
		  Thread.sleep(2000);
		  login.inpSwaglabpassword(sh.getRow(0).getCell(1).getStringCellValue());
		  Thread.sleep(2000);
		  login.clickonlogin();
		  Thread.sleep(3000);
	   }
	  
	   @Test
	   public void verifylogo() throws InterruptedException
	   {
		  boolean result1 = home.inpverifylogo();
		  Assert.assertTrue(result1);
		  Thread.sleep(3000);
		 home.addtocart();
		 Thread.sleep(1000);
		home.remove(sh.getRow(0).getCell(2).getStringCellValue());  
		Thread.sleep(1000);
	   }
	   
	   @AfterMethod
	   public void openmenu() throws InterruptedException
	   {
		   home.inpopenmenu();
		   Thread.sleep(3000);
		}
	   @AfterClass
	   public void Close() throws InterruptedException
	   {
		   menu.logout();
		   Thread.sleep(3000);
		   driver.close();
	   }
	   
	   
	   
	}