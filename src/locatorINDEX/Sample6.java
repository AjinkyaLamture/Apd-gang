package locatorINDEX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample6 
  {

		public static void main(String[] args) throws InterruptedException {
			
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anmol\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.olacabs.com/");
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("(//a[text()='Free S1 Test Ride'])[2]")).click();
			
			driver.close();
  }
		
		
		
		
}

