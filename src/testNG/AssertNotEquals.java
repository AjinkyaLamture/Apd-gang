package testNG;

	import org.testng.Assert;
	import org.testng.Reporter;
	import org.testng.annotations.Test;

public class AssertNotEquals
	{
		@Test
		public void TC1()
		{
			Reporter.log("running TC1",true);
			
			String actResult="hi";
			String expResult="hello";
			Assert.assertNotEquals(actResult, expResult,"Failed-both results are same: ");
			
		}
	}
