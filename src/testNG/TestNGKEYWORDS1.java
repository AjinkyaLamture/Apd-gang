package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGKEYWORDS1 
{
	@BeforeClass
	public void TC3()
	{
		Reporter.log("--running open testscript--",true);
	}
	
	@BeforeMethod
	public void TC5()
	{
		Reporter.log("--running open app--",true);
	}
	
	@Test(invocationCount=2) // invocation given for running TC multiple times
	public void TC1()
	{
		Reporter.log("--running verifylogo1 testscript--",true);
	}
	
	@Test(priority=-1)   //priority given to execute TC at first
	public void TC2()
	{
		Reporter.log("--running verifylogo2 testscript--",true);
	}
	
	@Test(enabled=false)    //used to disable the testcase
	public void TC7()
	{
		Reporter.log("--running verifylogo3 testscript--",true);
	}
	
	@AfterMethod
	public void TC6()
	{
		Reporter.log("--running close app--",true);
	}
	@AfterClass
	public void TC4()
	{
		Reporter.log("--running close testscript--",true);
	}

}
