package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel3
{
    @Test
	public void openUberApp() throws InterruptedException
	{ 
	WebDriver driver = new ChromeDriver();
    
	driver.get("https://www.uber.com/in/en/");
	driver.manage().window().maximize();
	
	Thread.sleep(4000);
	
	driver.close();
	
    }

}
