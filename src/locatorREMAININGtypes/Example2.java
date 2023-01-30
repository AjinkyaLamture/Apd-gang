package locatorREMAININGtypes;
    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Example2	  //XPATH BYTAGNAME
	{
		public static void main(String[] args)
		{
			//System.setProperty("webdriver.chrome.driver", 
			//		"C:\\Users\\Anmol\\Downloads\\chromedriver_win32\\chromedriver.exe");                    //diffClassName.methodName();	
			WebDriver driver=new ChromeDriver();
			driver.get("C:\\Users\\Anmol\\Documents\\HTML programs\\Tagname.HTML");
			
			//enter FN
			driver.findElement(By.tagName("input")).sendKeys("abc");

			
			//enter LN
			driver.findElement(By.tagName("input")).sendKeys("xyz");

			
			
		}

	}
