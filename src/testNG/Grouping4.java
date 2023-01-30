package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouping4 
{
	@Test(groups="login")
	public void TC4()
	{
		Reporter.log("Running TC4",true);
	}
	@Test(groups="logout")
	public void TC5()
	{
		Reporter.log("Running TC5",true);
	}
	@Test(groups="Setting")
	public void TC6()
	{
		Reporter.log("Running TC6",true);
	}


}
