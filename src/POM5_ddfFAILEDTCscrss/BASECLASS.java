package POM5_ddfFAILEDTCscrss;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BASECLASS
{
	WebDriver driver;
	
	public void initializebrowser() throws InterruptedException, IOException
	{
		driver = new ChromeDriver();
	    driver.get(UTILITYCLASS.READdataFrmPF("URL"));
	    Thread.sleep(2000);
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    
	    
	}

}
