package locatorREMAININGtypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example5      //NAME
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Anmol\\Downloads\\chromedriver_win32\\chromedriver.exe");                    //diffClassName.methodName();	
		WebDriver driver=new ChromeDriver();
		driver.get("");
		
		//enter FN
		driver.findElement(By.name("xyz123")).sendKeys("abc");
		
		//enter LN
		driver.findElement(By.name("xyz456")).sendKeys("xyz");	
	}

}
//<html>
//<body>
//	FN<input type='text' id='1234' class='abc123' name='xyz123'> <br>
//	LN<input type='text' id='1234' class='abc123' name='xyz123'>
//</body>
//</html>