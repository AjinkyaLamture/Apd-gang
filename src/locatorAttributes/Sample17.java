package locatorAttributes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;             //xpath by attribute
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample17
{
	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Anmol\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.uber.com");
		 Thread.sleep(4000);
		 
		driver.findElement(By.xpath("//input[@name='pickup']")).sendKeys("LONAVALA");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='destination']")).sendKeys("UDGIR");
		driver.findElement(By.xpath("//a[@text='Request now']")).click();
		 
	}

}


