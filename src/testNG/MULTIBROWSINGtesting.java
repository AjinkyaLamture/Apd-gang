package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MULTIBROWSINGtesting
{
	@Parameters("browsername")
	@Test
	public void name(String browsername) throws InterruptedException
	{
		WebDriver driver = null;
	
		if(browsername.equals("chrome"))
		{
		    driver = new ChromeDriver();
		}
		else if (browsername.equals("firefox"))    //it will not runn due to firefox app not installed
		{
			driver = new FirefoxDriver();
		}
		else if(browsername.equals("edge"))
		{
			driver = new EdgeDriver();
		}
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();
		 Thread.sleep(3000);
		 
		 driver.quit();
		
	}
}
		
		
		


