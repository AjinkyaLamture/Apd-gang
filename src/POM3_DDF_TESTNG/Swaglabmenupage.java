package POM3_DDF_TESTNG;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

public class Swaglabmenupage
	{
		@FindBy(xpath="//a[text()='Logout']")private WebElement logout;
		
		public Swaglabmenupage(WebDriver driver)
		{
		  PageFactory.initElements(driver, this);
		}
		
		public void logout()
		{
			logout.click();
		}

	}
