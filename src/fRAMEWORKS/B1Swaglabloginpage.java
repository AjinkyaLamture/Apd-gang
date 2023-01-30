package fRAMEWORKS;

	//pom class 1

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class B1Swaglabloginpage
	{
		//step1: declaration
		@FindBy(xpath="//input[@placeholder='Username']") private WebElement UN;            // private WebElement UN= driver.finElement(By.xpath(""));
		@FindBy(xpath="//input[@placeholder='Password']") private WebElement PWD;			 // private WebElement PWD= driver.finElement(By.xpath(""));
		@FindBy(xpath = "//input[@name='login-button']") private WebElement login;			 // private WebElement Login= driver.finElement(By.xpath(""));
		WebDriver driver1;
		
		//step2: initialization
		public B1Swaglabloginpage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);          //className.methodName(webDriverObject, thisKeyword);
			driver1=driver;
		}
			
		//step3: usage	
		//enter UN
		public void inpSwagLabLoginPageUsername() 
		{
			UN.sendKeys("standard_user");
		}
		
		public void inpSwagLabLoginPagePassword() 
		{
			PWD.sendKeys("secret_sauce");
		}
		
		public void clickSwagLabLoginPageLoginBtn() 
		{
			login.click();
		}
	}
