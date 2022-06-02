 package com.SauceDemo.Practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice_02 
 {
	 
 @BeforeMethod
 public void setUpMethod()    // pre-condition
 {
	System.out.println("Browser, URL, Login");
 }

 @Test    
 public void verifyLoginFunctionality() //main test case
 {
		System.out.println("Login functionality is verified");
 }
 
 @Test    
 public void singleProductAddToCart() 
 {
		System.out.println("single product addtocart is verified");
 }
 
 @AfterMethod                 //post condition
 public void tearDown()
 {
	 System.out.println("browser close");
 }
 
 
 }

 