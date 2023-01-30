package fRAMEWORKS;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A4Swablablogintest
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		A1Swablabloginpage login = new A1Swablabloginpage(driver);
		login.enterUN();
		login.enterPWD();
		login.clickonlogin();
		
		Thread.sleep(2000);
		
		A2Swablabhomepage home = new A2Swablabhomepage(driver);
		home.verifylogo();
		home.openmenu();
		
		Thread.sleep(2000);
		
		A3Swablabmenupage menu = new A3Swablabmenupage(driver);
		menu.logout();
		
		Thread.sleep(2000);
		
		driver.close();
				
		
		
	}

}
