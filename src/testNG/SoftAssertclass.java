package testNG;
   
	import org.testng.annotations.Test;
	import org.testng.asserts.SoftAssert;
	public class SoftAssertclass
	{
		@Test
		public void TC1()
		{		
			SoftAssert soft=new SoftAssert();
			
			String actResult="hi";
			String expResult="hello";
			soft.assertEquals(actResult, expResult,"Failed1: both results are diff- ");
			
			boolean actResult1 = false;
			soft.assertTrue(actResult1,"Failed2- exp result is false:  ");
			
			soft.assertAll();
		}
	}

