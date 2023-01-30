package fRAMEWORKS;
    import java.time.Duration;
    import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class B4Swaglablogintest 
	{
		public static void main(String[] args) throws InterruptedException {
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

			B1Swaglabloginpage login=new B1Swaglabloginpage(driver);      //basic or early initialization
			login.inpSwagLabLoginPageUsername();
			login.inpSwagLabLoginPagePassword();
			login.clickSwagLabLoginPageLoginBtn();
			
			Thread.sleep(3000);
			
			B2Swaglabhomepage home=new B2Swaglabhomepage(driver);
			home.verifySwagLabHomePageLogo();
			home.clickSwagLabHomePageOpenMenu();
			
			Thread.sleep(3000);
			
			B3Swaglabmenupage menu=new B3Swaglabmenupage(driver);
			menu.clickSwagLabMenuPageLogout();
			
			Thread.sleep(3000);
			
			driver.close();
			
		}

	}