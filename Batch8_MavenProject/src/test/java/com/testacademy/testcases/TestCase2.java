package com.testacademy.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utilities.BaseClass;

public class TestCase2 extends BaseClass
{
	//static WebDriver driver;
	//all methods will be inherited here
	//No need to call method to open and close browsers
	//Instead of calling a method we can use Inheritance
	//Using annotations they can be executed before Test methods
	
	@Test(priority=1)
	public void testCase1() throws InterruptedException	
	{
		
		BaseClass rm = new BaseClass();
		
		Thread.sleep(1000);	
		
		String title = rm.getWebPageTitle();
		System.out.println("Title fetched by Selenium: "+title);
		
		if( title.contains("UK Sotheby's International Realty") )
		{
			System.out.println("Website is opened");
		}else {
			System.out.println("Website is not opened");
		}
		

	}
	
	@Test(priority=2)
	public void testCase2() throws InterruptedException	
	{
		
		BaseClass rm = new BaseClass();
		
		Thread.sleep(1000);	
		
		String title = rm.getWebPageTitle();
		System.out.println("Title fetched by Selenium: "+title);
		
		if( title.contains("UK Sotheby's International Realty") )
		{
			System.out.println("Website is opened");
		}else {
			System.out.println("Website is not opened");
		}

	}

}
