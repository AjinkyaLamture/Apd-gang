package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openbrowser 
{
   public static void main(String[] args) throws InterruptedException
   {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Anmol\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.flipkart.com/");
	 
	Thread.sleep(4000);
	 driver.close();
	
}

}
