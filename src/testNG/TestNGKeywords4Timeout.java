package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGKeywords4Timeout
{
	@Test(timeOut=5000)
	public void TC1() throws InterruptedException
	{
		Thread.sleep(6000);
		Reporter.log("-running TC1-",true);
	}

}
