package POM3_DDF_TESTNG;
    import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Swaglabloginpage
	{
		@FindBy(xpath="//input[@placeholder='Username']")private WebElement UN;
		@FindBy(xpath="//input[@placeholder='Password']")private WebElement PWD;
		@FindBy(xpath="//input[@name='login-button']")private WebElement login;
		
		
		public Swaglabloginpage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		public void inpSwaglabusername(String username)
		{
			UN.sendKeys(username);
		}
		public void inpSwaglabpassword(String password)
		{
			PWD.sendKeys(password);
		}
		public void clickonlogin()
		{
			login.click();
		}

	}

