package webelementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1isSelected1 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		Thread.sleep(2000);
		
		boolean result = driver.findElement(By.xpath("(//input[@type='radio'])[1]")).isSelected();
		
		System.out.println(result);
		Thread.sleep(3000);
		if (result==true)
		{
			System.out.println("radio btn is selected");
		}
		else
		{
			System.out.println("radio btn is de-selected");
		}
		
	}

}
