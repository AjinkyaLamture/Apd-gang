package locatorCONTAINS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;   // contains by attributes//
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anmol\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://facebook.com");
		 
		 driver.findElement(By.xpath("//input[contains(@placeholder,'phone number')]")).sendKeys("xyz");
		 
		 driver.findElement(By.xpath("//input[contains(@class,'6luy _9npi')]")).sendKeys("rty");
		 
		 driver.findElement(By.xpath("//button[contains(@class,'4jy6 _4jy1 ')]")).click();
	    
			
		 
	     
		
	}

}
