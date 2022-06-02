 package com.SauceDemo.Practice;

 import org.testng.Assert;
 import org.testng.annotations.Listeners;
 import org.testng.annotations.Test;

 @Listeners(com.SauceDemo.Utility.Listener.class)
 public class SampleClassListener 
 {
   @Test
   public void verifyLoginUrl()
   {
	   Assert.assertTrue(true);
	   //System.out.println("URL test is passed");
   }
   
   @Test
   public void verifyLoginTiyle()
   {
	   Assert.assertTrue(false);
	   //System.out.println("Title test is passed");
	   
   }
 }

 