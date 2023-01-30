package POM_DDF_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Swaglabhomepage 
{
	@FindBy(xpath="//div[@class='app_logo']")private WebElement verifylogo;
	@FindBy(xpath="//button[text()='Open Menu']")private WebElement openmenu;
	
	
	public Swaglabhomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean inpSwaglabverifylogo()
	{
        boolean result = verifylogo.isDisplayed();
        return result;
	}
	public void inpSwaglabopenmenu()
	{
		openmenu.click();
	}
	
	

}
