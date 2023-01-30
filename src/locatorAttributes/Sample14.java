package locatorAttributes;


import org.openqa.selenium.WebDriver;             //xpath by attribute
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample14
{
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Anmol\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.instagram.com");
		 
		 
	}

}


