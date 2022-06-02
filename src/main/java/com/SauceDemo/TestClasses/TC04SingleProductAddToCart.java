 package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomePagePOMClass;
import com.SauceDemo.POMClasses.LoginPagePOMClass;

public class TC04SingleProductAddToCart extends TestBaseClass
 {
		
		@Test
		public void singleProductAddToCart()
		{
			
		HomePagePOMClass hp = new HomePagePOMClass(driver);
		hp.clickBagButton();
		System.out.println("Product is added to Cart");
		
		System.out.println("Apply the Validation");
		
		String actualResult = hp.getTextfromCartButton();
		String expectedResult = "1" ;
		
		if (expectedResult.equals(actualResult))
		{
			System.out.println("Test Case is Passed");
		}
		else
		{
			System.out.println("Test Case is Failed");
		}
		
		hp.clickMenuButton();
		System.out.println("Click on MenuButton");
		hp.clickLogoutButton();
		System.out.println("Click on LogoutButton");
		
		}
		
		
 }
