package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations
{
	@BeforeClass
	public void openbrowser()
	{
		Reporter.log("--running openbrowser--",true);
	}
	
	@BeforeMethod
	public void logintoapp()
	{
		Reporter.log("--running logintoapp--",true);
	}
	
	@Test
	public void verifylogo1()
	{
		Reporter.log("--running verifylogo1 testscript--",true);
	}
	
	@Test
	public void verifylogo2()
	{
		Reporter.log("--running verifylogo2 testscript--",true);
	}
	
	@AfterMethod
	public void logoutfrmapp()
	{
		Reporter.log("--running logoutfrmapp--",true);
	}
	
	@AfterClass
	public void closebrowser()
	{
		Reporter.log("--running closebrowser--",true);
	}
	
	

}
