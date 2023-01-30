package testNG;
    import org.testng.Assert;
	import org.testng.annotations.Test;
public class AssertTrue 
	{
		@Test
		public void TC1()
		{				
			boolean actResult = false;
			Assert.assertTrue(actResult,"Failed- exp result is false:  ");
			
		}
	}

