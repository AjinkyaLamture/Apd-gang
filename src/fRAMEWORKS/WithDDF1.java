package fRAMEWORKS;

	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.time.Duration;

	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.WorkbookFactory;
	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class WithDDF1 
	{
		public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
		{
			FileInputStream file = new FileInputStream("C:\\Users\\Anmol\\Documents\\frameworks xl sheet\\AJ@.xlsx");
		    Sheet sh = WorkbookFactory.create(file).getSheet("AJ");
		    
		    ChromeDriver driver = new ChromeDriver();
		    driver.get("https://www.saucedemo.com/");
		    Thread.sleep(2000);
		    driver.manage().window().maximize();
		    
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		    
		    //enter username
		    driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(sh.getRow(0).getCell(0).getStringCellValue());
		    Thread.sleep(2000);
		    
		    //enter password
		    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(sh.getRow(0).getCell(1).getStringCellValue());
		    Thread.sleep(2000);
		    
		    //click on login btn
		    driver.findElement(By.xpath("//input[@name='login-button']")).click();
		    Thread.sleep(2000);
		    
		    boolean result = driver.findElement(By.xpath("//div[@class='app_logo']")).isDisplayed();
		    if(result==true)
		    {
		    	System.out.println("logo found--Pass");
		    }
		    else
		    {
		    	System.out.println("logo not found--Fail");
		    }
		    Thread.sleep(2000);
		    
		    //click on open menu option
		    driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
		    Thread.sleep(2000);
		    
		    //click on logout btn
		    driver.findElement(By.xpath("//a[text()='Logout']")).click();
		    Thread.sleep(2000);
		    
		    driver.close();
		}
		

	}

