package locatorREMAININGtypes;
    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Example6   //link_Text
	{
		public static void main(String[] args)
		{
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\sanja\\OneDrive\\Desktop\\Study\\3rd Sept Mrng\\chromedriver_win32 (1)\\chromedriver.exe");                    //diffClassName.methodName();	
			WebDriver driver=new ChromeDriver();
			driver.get("file:///C:/Users/sanja/OneDrive/Desktop/Study/3rd%20Sept%20Mrng/html%20files/linkText_PartialLinkText.html");
			

			//click on facebook link
			driver.findElement(By.linkText("facebook")).click();
		}

	}
