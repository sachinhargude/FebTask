 package com.SauceDemo.Utility;

 import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
 import org.testng.ITestResult;

 public class Listener implements ITestListener 
  {
	 public void onStart(ITestResult result)
	 {
		 System.out.println("Test Case start");
	 }
	 
	 public void onFinish(ITestResult result)
	 {
		 System.out.println("Test Case end");
	 }
	 
	 public void onTestSuccess(ITestResult result)
	 {
		 System.out.println("Test Case successfully passed");
	 }
	 
	 public void onTestFailure(ITestResult result)
	 {
		 System.out.println("Test Case failed & taking screenshot");
		 
	 }
	 
	 public void onTestStart(ITestResult result)
	 {
		 System.out.println("Sanity test started");
	 }
  }

 
 
 