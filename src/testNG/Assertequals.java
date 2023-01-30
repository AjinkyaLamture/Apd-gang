package testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assertequals
{
	@Test
	public void TC1()
	{
		Reporter.log("running TC1",true);
		
		String actResult="hi";
		String expResult="hi";
		Assert.assertEquals(actResult, expResult,"Failed: both results are diff- ");
		
	}
}