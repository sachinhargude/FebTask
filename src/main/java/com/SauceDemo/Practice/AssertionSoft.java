 package com.SauceDemo.Practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionSoft 
 {
	 @Test
		public void loginTest()
		{
			//title check
			String expectedTitle ="Swag Labs";
			String actualTitle = "Swag Labs";
			
			//hard assert
			Assert.assertEquals(actualTitle, expectedTitle);
		
			
			//url check
			String expectedUrl = "www.sauceDemo.com";
			String actualUrl   = "www.sauceDemo.com";
			
			Assert.assertEquals(actualUrl, expectedUrl);
		}

 }
		
		
		

 
