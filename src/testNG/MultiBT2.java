package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBT2 
{
	@Parameters("Ajinkya")
	@Test
	public void name(String Ajinkya) throws InterruptedException
	{
		WebDriver driver = null;
		
		if(Ajinkya.equals("edge"))
		{
			driver= new ChromeDriver();
		}
		else if(Ajinkya.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(Ajinkya.equals("chrome"))
		{
			driver = new EdgeDriver();
		}
		driver.get("https://www.instagram.com/");
	    Thread.sleep(2000);
	    driver.quit();	}

}
