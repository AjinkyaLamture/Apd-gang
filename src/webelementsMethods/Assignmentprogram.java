package webelementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmentprogram 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);
		
        boolean Beforeselecting = driver.findElement(By.xpath("(//input[@type='radio'])[1]")).isSelected();
		
		System.out.println(Beforeselecting);
		Thread.sleep(3000);
		if (Beforeselecting==true)
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
		
		boolean Afterselecting = driver.findElement(By.xpath("//input[@value='1']")).isSelected();
		System.out.println(Afterselecting);
		if(Afterselecting==true)
		{
			System.out.println("Radio button is Selected");
		}
		else
		{
			System.out.println("Radio button is De-selected");
		}
		
		
		
	}

}
