package locatorINDEX;
	
 import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.chrome.ChromeDriver;
	public class Sample8
	{
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Anmol\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.olacabs.com/");
			Thread.sleep(3000);
			
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//a[text()='Drive with Ola'])[1]")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//span[text()='English']")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("(//a[contains(text(),'with')])[1]")).click();
			
			driver.quit();
		}
	}
