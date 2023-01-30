package fRAMEWORKS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutDDF
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// enter Username
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
		Thread.sleep(2000);
		
		//enter Password
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		
		//click on login btn
		driver.findElement(By.xpath("//input[@name='login-button']")).click();
		Thread.sleep(2000);
		
		boolean result = driver.findElement(By.xpath("//div[@class='app_logo']")).isDisplayed();
		if(result==true)
		{
			System.out.println("Logo found--Pass");
		}
		else
		{
		    System.out.println("Logo not found--Fail");
		}
		Thread.sleep(2000);
		
		//click on open menu option
		driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
		Thread.sleep(2000);
		
		// click on logout btn
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
		
		
		
	}
	
}