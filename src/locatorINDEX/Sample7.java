package locatorINDEX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample7
{

	public static void main(String[] args) throws InterruptedException {
		
      System.setProperty("webdriver.chrome.driver","C:\\Users\\Anmol\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.uber.com/in/en/drive/?ad_id=614857351366&adg_id=142684723151&campaign_id=17952692850&cre=614857351366&dev=c&dev_m=&fi_id=&gclid=Cj0KCQiA37KbBhDgARIsAIzce17CIcoCDgmc-zKPJi3qQUiGDUqwLpLEiNFfivIyw1nrpqcC0DQnOogaAgAsEALw_wcB&gclsrc=aw.ds&kw=uber%20com&kwid=kwd-40874069574&match=e&net=g&placement=&tar=&utm_campaign=CM2197853-search-google-brand_77_-99_IN-National_r_web_acq_cpc_en_T1_Generic_Exact_uber%20com_kwd-40874069574_614857351366_142684723151_e_c&utm_source=AdWords_Brand");
		driver.manage().window().maximize();
		Thread.sleep(4000);
    	driver.findElement(By.xpath("(//button[@data-baseweb='button'])[3]")).click();
		
		
		
		driver.findElement(By.xpath("//div[text()='Home']")).click();
		
		driver.findElement(By.xpath("//input[@name='pickup']")).sendKeys("UDGIR");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='destination']")).sendKeys("LONAVALA");
		
		driver.findElement(By.xpath("//a[text()='Request now']")).click();
		
		driver.close();
	}
	
}
