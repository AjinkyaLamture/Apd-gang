package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel1
{
	@Test
	public void openGoogleapp() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
