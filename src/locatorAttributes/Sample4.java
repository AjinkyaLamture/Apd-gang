package locatorAttributes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;             //xpath by attribute
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample4
{
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Anmol\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.flipkart.com/");
		 
		 driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Iphone mini");
		 driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		 
	
	}

}


