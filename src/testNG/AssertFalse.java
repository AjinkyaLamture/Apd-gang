package testNG;
	import org.testng.Assert;
	import org.testng.annotations.Test;
public class AssertFalse
	{
		@Test
		public void TC1()
		{				
			boolean actResult = true;
			Assert.assertFalse(actResult,"failed- act result is true:  ");
			
		}
	}
