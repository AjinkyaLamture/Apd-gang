package locatorINDEX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample3 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anmol\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.com/");
		 
		 driver.findElement(By.xpath("//option[@value='search-alias=stripbooks-intl-ship']")).click();
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
