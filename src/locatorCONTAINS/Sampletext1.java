package locatorCONTAINS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;   // contains by text//
import org.openqa.selenium.chrome.ChromeDriver;

public class Sampletext1
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anmol\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://facebook.com");
		 
		
	
	     driver.findElement(By.xpath("//a[contains(text(),'New ')]")).click();
	     
	     
	     Thread.sleep(10000);
	     driver.close();
		 driver.findElement(By.xpath("//a[contains(text(),'password')]")).click();
		 
			
		 
	     
		
	}

}
