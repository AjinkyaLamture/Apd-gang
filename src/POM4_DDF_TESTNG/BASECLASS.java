package POM4_DDF_TESTNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BASECLASS
{
	WebDriver driver;
	
	public void initializebrowser() throws InterruptedException
	{
		driver = new ChromeDriver();
	    driver.get("https://www.saucedemo.com/");
	    Thread.sleep(2000);
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    
	    
	}

}
