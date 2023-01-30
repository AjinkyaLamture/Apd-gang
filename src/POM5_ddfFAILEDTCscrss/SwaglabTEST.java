package POM5_ddfFAILEDTCscrss;
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
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;
import org.testng.internal.TestResult;

import POM3_DDF_TESTNG.Utilityclass;
import POM_DDF_TestNG.Swaglablogintest;

	public class SwaglabTEST extends BASECLASS	{
	
		Swaglablogin login;
		Swaglabhome home;
		 Swaglabmenu menu;
		 int TCID;
		 
		
		@BeforeClass
		 public void openbrowser() throws EncryptedDocumentException, IOException, InterruptedException
		{
		   initializebrowser();
		   
		   login = new Swaglablogin(driver);
		   home = new Swaglabhome(driver);
		   menu = new Swaglabmenu(driver);
		}
		
		   @BeforeMethod
		   public void opentobrowser() throws InterruptedException, EncryptedDocumentException, IOException
		   {
			  login.inpSwaglabusername(UTILITYCLASS.READdataFrmPF("UN"));
			  Thread.sleep(2000);
			  login.inpSwaglabpassword(UTILITYCLASS.READdataFrmPF("PWD"));
			  Thread.sleep(2000);
			  login.clickonlogin();
			  Thread.sleep(3000);
		   }
		  
		   @Test
		   public void verifylogo() throws InterruptedException, EncryptedDocumentException, IOException
		   {
			  boolean result1 =home.inpverifylogo();
			  Assert.assertTrue(result1,"failed -");
			  Thread.sleep(3000);
			  
			  TCID=101;
			  
//			 home.addtocart();
//			 Thread.sleep(1000);
//			home.remove(Utilityclass.GetTD(0, 2));  
//			Thread.sleep(1000);
		   }
		   
		   @AfterMethod
		   public void openmenu(ITestResult s1) throws InterruptedException, IOException
		   {
			if(s1.getStatus()==ITestResult.FAILURE)
			   {
				   UTILITYCLASS.captureSS(driver, TCID);
			   }
			   
			   home.inpopenmenu();
	
			}
		   @AfterClass
		   public void Close() throws InterruptedException
		   {
			   menu.logout();
			   Thread.sleep(500);
			   driver.close();
		   }
}