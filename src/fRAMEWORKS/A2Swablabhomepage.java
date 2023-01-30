package fRAMEWORKS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A2Swablabhomepage
{
	//step 1: declaration
	@FindBy(xpath="//div[@class='app_logo']")private WebElement verifylogo;
	@FindBy(xpath="//button[text()='Open Menu']")private WebElement openmenu;
	
	//step2: initialization
	public A2Swablabhomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//step3: usage
	
	public void verifylogo()
	{
		boolean result = verifylogo.isDisplayed();
		if(result==true)
		{
			System.out.println("logo is displayed--pass");
		}
		else
		{
			System.out.println("logo is not displayed--fail");
		}
	}
	
	public void openmenu()
	{
		openmenu.click();
	}
		
}
	