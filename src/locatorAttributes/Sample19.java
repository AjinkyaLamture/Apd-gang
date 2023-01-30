package locatorAttributes;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Sample19
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anmol\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver ();
		 driver.get("https://www.facebook.com/");
		 Thread.sleep(4000);
		 driver.manage().window().maximize();
		 Thread.sleep(4000);
		 driver.close();
		
	}

}