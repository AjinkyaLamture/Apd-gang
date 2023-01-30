package webelementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1isEnabled1
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anmol\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
		 boolean result=driver.findElement(By.xpath("//button[text()='Log in']")).isEnabled();
		 System.out.println(result);
		 
		 if (result==true)
		 {
			 System.out.println("Element is ENABLED");
		 }
		 else
		 {
			 System.out.println("Element is DISABLED");
		 }
		 
	}
}