package POM_DDF_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Swaglablogintest
{
	@FindBy(xpath="//input[@placeholder='Username']")private WebElement UN;
	@FindBy(xpath="//input[@placeholder='Password']")private WebElement PWD;
	@FindBy(xpath="//input[@name='login-button']")private WebElement login;
	
	
	public Swaglablogintest(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inpSwaglabUsername(String UNvalue)
	{
	    UN.sendKeys(UNvalue);
	}
	public void inpSwaglabpassword(String PWDvalue)
	{
		PWD.sendKeys(PWDvalue);
	}
	public void inpSwaglablogin()
	{
		login.click();
	}

}
