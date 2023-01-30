package selenium;
    import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebDriver.Options;
	import org.openqa.selenium.WebDriver.Window;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Example7_minimize	{
		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\Anmol\\Downloads\\chromedriver_win32\\chromedriver.exe");                    //diffClassName.methodName();	
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
			Thread.sleep(4000);
			
			driver.manage().window().minimize();
			
//			Options s1 = driver.manage();
//			Window s2 = s1.window();
//			s2.minimize();
			
		}

	}
