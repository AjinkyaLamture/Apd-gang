package locatorAttributes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample20 
{
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Anmol\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com");
		 
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ajinkya");
	     driver.findElement(By.xpath("//input[@type='password']")).sendKeys("lamture");
	     driver.findElement(By.xpath("//button[@value='1']")).click();

}
}