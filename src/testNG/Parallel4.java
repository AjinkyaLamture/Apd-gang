package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel4
{
	 @Test
		public void openOlaApp() throws InterruptedException
		{ 
		WebDriver driver = new ChromeDriver();
	    
		driver.get("https://www.olacabs.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		driver.close();
		
		}
}
