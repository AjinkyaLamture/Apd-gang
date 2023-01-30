package selenium;
    import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Example4_gettitle
	{
		public static void main(String[] args)
		{
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\Anmol\\Downloads\\chromedriver_win32\\chromedriver.exe");                    //diffClassName.methodName();	
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
			String title = driver.getTitle();
			System.out.println(title);
			
			System.out.println(driver.getTitle());
			
		
			
			
		}

	}
