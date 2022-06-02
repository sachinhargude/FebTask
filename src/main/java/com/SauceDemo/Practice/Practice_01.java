 package com.SauceDemo.Practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice_01 
 {
	 @Test
	 public void loginTestCase()
	 {
		 System.out.println("login test case");
	 }
	 
	 @BeforeMethod
	 public void beforemethod()
	 {
		 System.out.println("before method");
	 }
	 
	 @AfterMethod
	 public void aftermethod()
	 {
		 System.out.println("after method");
	 }
	 
	 
	 
 }
