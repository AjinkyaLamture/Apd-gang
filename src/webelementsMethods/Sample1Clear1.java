package webelementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1Clear1
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anmol\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
		 
		 WebElement UN= driver.findElement(By.xpath("//input[@id='email']"));
		 UN.sendKeys("abc");
		 Thread.sleep(3000);
		 UN.clear();
		 Thread.sleep(4000);
		 UN.sendKeys("xyz");
			 
		 
		 
		 
		 
		 
		
		
	}

}

