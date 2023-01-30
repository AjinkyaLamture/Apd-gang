package locatorAttributes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;             //xpath by attribute
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2
{
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Anmol\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com");
		 driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ajinkya");
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("lamture");
	
		 
	
	}

}
