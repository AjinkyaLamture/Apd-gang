package webelementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1isDisplayed1 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anmol\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
		 boolean is = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
		 System.out.println(is);
		 
		 if(is==true)
		 {
			 System.out.println("logo is displayed");
		 }
		 else
		 {
			 System.out.println("logo is not displayed");
		 }
	
	}
}
