package com.testacademy.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ContactUsObjects;
import pageObjects.HomepageObjects;
import utilities.BaseClass;

public class Test_Homepage extends BaseClass
{

	//put all the reusable code and driver related code into BaseClass
	//put all the elements and their actions in Page object class
	//call the actions in the Test Case to automate

	@Test(priority=1, description="Test_Homepage")
	public void testCase1() throws InterruptedException	
	{
		HomepageObjects hp = new HomepageObjects();
		
		boolean isHamburgerVisible = hp.checkHamburgerMenu();

		//Assertions are used to compare two values
		//Here we will return a boolean value from a method
		//and compare that returned value with our expected value
		Assert.assertEquals(isHamburgerVisible, false, "Hamurger menu is not visible");
		
		boolean isHamburgerClicked = hp.clickHamburgerMenu();
		Assert.assertEquals(isHamburgerClicked, true, "Failed to click Hamburger menu");

		boolean isContactLink = hp.checkContactUsLink();
		Assert.assertEquals(isContactLink, true, "Contact Us link is not visible");
		
		boolean isContactLinkCLicked= hp.clickContactUsLink();
		Assert.assertEquals(isContactLinkCLicked, true, "Failed to click Contact Us link");
		
		ContactUsObjects cu = new ContactUsObjects();
		
//		boolean isFullname = cu.checkFullNameField();
//		Assert.assertEquals(isFullname, true, "Full name field is not visible");
		
		boolean isFullNameClicked = cu.clickFullNameField();
		Assert.assertEquals(isFullNameClicked, true, "Failed to click in Full name field");
		
		boolean isEntered = cu.enterFullName("Hello");
		Assert.assertEquals(isEntered, true, "Failed to enter data into Full name field");
		
	}

}
