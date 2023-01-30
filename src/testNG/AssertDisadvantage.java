package testNG;
	import org.testng.Assert;

	import org.testng.annotations.Test;

	public class AssertDisadvantage
	{
		@Test
		public void TC1()
		{
			
			String actResult="hi";
			String expResult="hello";
			Assert.assertEquals(actResult, expResult,"Failed1: both results are diff- ");
			
			boolean actResult1 = false;
			Assert.assertTrue(actResult1,"Failed2- exp result is false:  ");
			
		}
	}
