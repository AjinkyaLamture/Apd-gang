package locatorINDEX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anmol\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.amazon.com/");
		 
		 driver.findElement(By.xpath("//select[@name='url']")).click();
		 Thread.sleep(4000);
	
		 driver.findElement(By.xpath("//option[text()='Computers']")).click();
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		 
		
		 
		 
		 
		 
		 
		 
}
}