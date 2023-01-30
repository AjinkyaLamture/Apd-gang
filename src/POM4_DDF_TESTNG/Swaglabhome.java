package POM4_DDF_TESTNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Swaglabhome
{
	@FindBy(xpath="//div[@class='app_logo']")WebElement logo;
	@FindBy(xpath="//button[text()='Open Menu']")WebElement openmenu;
	@FindBy(xpath="(//button[@class='btn btn_primary btn_small btn_inventory'])[1]")WebElement addtocart;
	@FindBy(xpath="//button[@class='btn btn_secondary btn_small btn_inventory']")WebElement remove;
	
	public Swaglabhome(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean inpverifylogo()
	{
		boolean result = logo.isDisplayed();
		return result;
	}
	
	public void addtocart()
	{
		addtocart.click();
	}
	
	public void remove(String expText)
	{
	   String actText = remove.getText();
	   if(actText.equals(expText))
	   {
		   System.out.println("Pass");
		   }
	   else
	   {
		   System.out.println("Fail");
	   }
	}
	public void inpopenmenu()
	{
		openmenu.click();
	}

}


