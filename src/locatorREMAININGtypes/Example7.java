package locatorREMAININGtypes;
    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Example7    //partiallinktext	
	{
		public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\sanja\\OneDrive\\Desktop\\Study\\3rd Sept Mrng\\chromedriver_win32 (1)\\chromedriver.exe");                    //diffClassName.methodName();	
			WebDriver driver=new ChromeDriver();
			driver.get("file:///C:/Users/sanja/OneDrive/Desktop/Study/3rd%20Sept%20Mrng/html%20files/linkText_PartialLinkText.html");
			
			Thread.sleep(3000);
			
			//click on facebook link
			driver.findElement(By.partialLinkText("face")).click();
		}

	}
//	<html>
//	<body>
//	<a href="https://www.facebook.com/">facebook</a>
//	</body>
//	</html>