 package com.SauceDemo.POMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePagePOMClass 
 {
 private WebDriver driver;
 
 @FindBy(xpath = "//button[@id='react-burger-menu-btn']")
 private WebElement menubutton;
 
 public void clickMenuButton()
 {
	 menubutton.click();
 }
	
 @FindBy(xpath = "//a[@id='logout_sidebar_link']")
 private WebElement logoutbutton;
 
 public void clickLogoutButton()
 {
	 logoutbutton.click();
 }	
	
 public HomePagePOMClass(WebDriver driver)
 {
	 this.driver = driver;
	 
	 PageFactory.initElements(driver, this);
	 
	 s = new Select(filterbutton);
	 
 }
 
// Single Product Select
 
 @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
 private WebElement bagbutton;
 
 public void clickBagButton()
 {
	 bagbutton.click();
 }
	
 @FindBy(xpath = "//div[@id='shopping_cart_container']")
 private WebElement addtocartbutton;
 
 public String getTextfromCartButton()
 {     
	 String totalProducts = addtocartbutton.getText();
	 return totalProducts;
 }
	
 // Multiple Product Select

	@FindBy(xpath = "//button[text()='Add to cart'] ")
	private List<WebElement> multipleaddtocart;
	
	public void addAllProducts()
	{
		for (WebElement m : multipleaddtocart)
		{
			m.click();
		}
			
	}
	
	private Select s ;
	
	@FindBy(xpath = "//select[@class='product_sort_container']")
	private WebElement filterbutton;
	
	public void clickonFilterButton()
	{
		filterbutton.click();
		s.selectByVisibleText("Name (A to Z)");
	}
	
	
	
	
	
	
	
	
	
}
