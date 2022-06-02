 package com.SauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomePagePOMClass;
import com.SauceDemo.POMClasses.LoginPagePOMClass;

public class TC07LogoutFunctionality extends TestBaseClass
 {
	
  @Test
  public void logoutFunctionalitty()
  {
		
		HomePagePOMClass hp = new HomePagePOMClass(driver);
		hp.clickMenuButton();
		System.out.println("Click on MenuButton");
		hp.clickLogoutButton();
		System.out.println("Click on LogoutButton");
		
		System.out.println("Apply Validation");
		
		String expectedURL = "https://www.saucedemo.com/";
		String actualURL = driver.getCurrentUrl();
		
		if(expectedURL.equals(actualURL))
		{
			System.out.println("Test Case is Passed");
		}
		else
		{
			System.out.println("Test Case is Failed");
		}
		
  }
 }
