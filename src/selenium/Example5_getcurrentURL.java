package selenium;
    import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Example5_getcurrentURL	{
		public static void main(String[] args)
		{
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\Anmol\\Downloads\\chromedriver_win32\\chromedriver.exe");                    //diffClassName.methodName();	
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
			String url = driver.getCurrentUrl();
			System.out.println(url);
			
			System.out.println(driver.getCurrentUrl());
				
		
			
			
		}

	}