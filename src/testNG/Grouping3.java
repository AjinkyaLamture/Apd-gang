package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouping3 
{
	@Test(groups="login")
	public void TC1()
	{
		Reporter.log("Running TC1",true);
	}
	@Test(groups="logout")
	public void TC2()
	{
		Reporter.log("Running TC2",true);
	}
	@Test(groups="Setting")
	public void TC3()
	{
		Reporter.log("Running TC3",true);
	}
}
