package locatorAttributes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;             //xpath by attribute
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample10
{
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Anmol\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.com");
		 
		 driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("Oneplus Nord 2T");
		 driver.findElement(By.xpath("//input[@value='Go']")).click();
		 driver.findElement(By.xpath("//img[@class='s-image']")).click();
		 driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		 
	}

}


