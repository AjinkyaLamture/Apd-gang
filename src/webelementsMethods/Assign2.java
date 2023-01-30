package webelementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign2 
{
	public static void main(String[] args) throws InterruptedException
		{
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://facebook.com");
			
			driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
			Thread.sleep(2000);
			
	        boolean result = driver.findElement(By.xpath("(//input[@type='radio'])[1]")).isSelected();
			
			System.out.println(result);
			Thread.sleep(3000);
			if (result==true)
			{
				System.out.println("Radio button is Selected");
			}
			else
			{
				System.out.println("Radio button is De-selected");
			}
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@type='radio']")).click();
			Thread.sleep(2000);
			
			result = driver.findElement(By.xpath("//input[@value='1']")).isSelected();
			System.out.println(result);
			if(result==true)
			{
				System.out.println("Radio button is Selected");
			}
			else
			{
				System.out.println("Radio button is De-selected");
			}
			Thread.sleep(2000);
			
			result=driver.findElement(By.xpath("//input[@value='1']")).isDisplayed();
			System.out.println(result);
			if(result==true)
			{
				System.out.println("radio element clicking function is displayed");
			}
			else
			{
				System.out.println("radio element clicking function is not displayed");
			}
			
		}

	}

