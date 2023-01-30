package locatorREMAININGtypes;
    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Example3	 //ID
	{
		public static void main(String[] args)
		{
//			System.setProperty("webdriver.chrome.driver", 
//					"C:\\Users\\Anmol\\Downloads\\chromedriver_win32\\chromedriver.exe");                    //diffClassName.methodName();	
			WebDriver driver=new ChromeDriver();
			driver.get("C:\\Users\\Anmol\\Documents\\HTML programs\\HTML\\ID.HTML");
			
			//enter FN
			driver.findElement(By.id("1234")).sendKeys("abc");
			
			//enter LN
			driver.findElement(By.id("1234")).sendKeys("xyz");	
		}

	}
