package webelementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1Click1
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anmol\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
		 
		 driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("(//input[@class='_8esa'])[1]")).click();
			 
		 
		 
		 
		 
		 
		
		
	}

}

