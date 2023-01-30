package selenium;
    import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebDriver.Options;
	import org.openqa.selenium.WebDriver.Window;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Example6_maximize
	{
		public static void main(String[] args)
		{
			System.setProperty("webdriver.chrome.driver", 
					"C:\\User\\Anmol\\Downloads\\chromedriver_win32\\chromedriver.exe");                    //diffClassName.methodName();	
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
			driver.manage().window().maximize();

//			Options s1 = driver.manage();
//			Window s2 = s1.window();
//			s2.maximize();	
			
		}

	}
