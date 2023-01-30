package POM3_DDF_TESTNG;
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

	public class SwaglabTEST extends Baseclass
	{
		//WebDriver driver;
		
		Swaglabloginpage login;
		Swaglabhomepage home;
		 Swaglabmenupage menu;
		
		@BeforeClass
		 public void openbrowser() throws EncryptedDocumentException, IOException, InterruptedException
		{
	
//			    driver = new ChromeDriver();
//			    driver.get("https://www.saucedemo.com/");
//			    Thread.sleep(2000);
//			    driver.manage().window().maximize();
//			    Thread.sleep(2000);
//			    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
		   initializebrowser();
		   
		   login = new Swaglabloginpage(driver);
		   home = new Swaglabhomepage(driver);
		   menu = new Swaglabmenupage(driver);
		}
		
		   @BeforeMethod
		   public void opentobrowser() throws InterruptedException, EncryptedDocumentException, IOException
		   {
			  login.inpSwaglabusername(Utilityclass.GetTD(0, 0));
			  Thread.sleep(2000);
			  login.inpSwaglabpassword(Utilityclass.GetTD(0, 1));
			  Thread.sleep(2000);
			  login.clickonlogin();
			  Thread.sleep(3000);
		   }
		  
		   @Test
		   public void verifylogo() throws InterruptedException, EncryptedDocumentException, IOException
		   {
			  boolean result1 = home.inpverifylogo();
			  Assert.assertTrue(result1);
			  Thread.sleep(3000);
			 home.addtocart();
			 Thread.sleep(1000);
			home.remove(Utilityclass.GetTD(0, 2));  
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
