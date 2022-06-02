 package com.SauceDemo.Practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionHard 
 {
	 @Test
		public void loginTest()
		{
			//title check
			String expectedTitle = "Labs";
			String actualTitle = "Swag Labs";
			
			//soft assert
			SoftAssert soft = new SoftAssert();
			soft.assertEquals(actualTitle, expectedTitle);
		
			
			//url check
			String expectedUrl = "www.sauceDemo.com";
			String actualUrl   = "www.sauceDemo.com";
			
			soft.assertEquals(actualTitle, expectedTitle);
			
			soft.assertAll();    //accurate result so compulsory
		}
	 
	      
	 
	 @Test
		public void logOutTest()
	    {
			Assert.assertTrue(true);
		}


 }
		
		
		

 
