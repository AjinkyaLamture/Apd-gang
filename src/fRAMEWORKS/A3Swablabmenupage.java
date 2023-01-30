package fRAMEWORKS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A3Swablabmenupage
{
	@FindBy(xpath="//a[text()='Logout']")private WebElement logout;
	
	public A3Swablabmenupage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void logout()
	{
		logout.click();
	}

}
