package fRAMEWORKS;
	//pom class2

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class B2Swaglabhomepage
	{
		//step1: declaration
		@FindBy(xpath="//div[@class='app_logo']") private WebElement logo;
		@FindBy(xpath="//button[text()='Open Menu']") private WebElement openMenu;

		//step2: initialization
		public B2Swaglabhomepage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//step3: usage
		
		public void verifySwagLabHomePageLogo()
		{
			boolean result = logo.isDisplayed();
			if(result==true)
			{
				System.out.println("Logo found--> Pass");
			}
			else
			{
				System.out.println("Logo not found--> Fail");
			}		
		}
		
		
			public void clickSwagLabHomePageOpenMenu() 
			{
				openMenu.click();
			}
		
	}