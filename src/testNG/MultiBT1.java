package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBT1 
{
	@Parameters("xyz")
	@Test
	public void name(String xyz) throws InterruptedException
	{
	    WebDriver driver = null;
	    if(xyz.equals("chrome"))
	    {
	    	driver = new ChromeDriver();
	    }
	    else if(xyz.equals("firefox"))
	    {
	    	driver = new FirefoxDriver();
	    }
	    else if(xyz.equals("edge"))
	    {
	    	driver = new EdgeDriver();
	    }
	    
	    driver.get("https://www.instagram.com/");
	    Thread.sleep(2000);
	    driver.quit();

}
}