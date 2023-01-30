package locatorAttributes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;             //xpath by attribute
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample12
{
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Anmol\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.com");
		 
		 driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("xiaomi Redmi 11 pro 5G");
		 driver.findElement(By.xpath("//input[@value='Go']")).click();
	
		 
	}

}

