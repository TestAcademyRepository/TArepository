package com.testacademy.testcases;

import org.testng.annotations.Test;

import utilities.BaseClass;

public class TestCase1		//Test case / Test class
{

//	public static void main(String[] args) throws InterruptedException 
//	{
	
	//In TestNG, main() is not required
	//@TestNG - annotation is require for a method to execute
	//TestNG will execute only those methods which have @Test
	

	
	@Test(priority=1)
	public void testCase2() throws InterruptedException		//Test method
	{
		
		BaseClass rm = new BaseClass();
		
		rm.openBrowser();
		
		Thread.sleep(1000);	
		
		String title = rm.getWebPageTitle();
		System.out.println("Title fetched by Selenium: "+title);
		
		if( title.contains("UK Sotheby's International Realty") )
		{
			System.out.println("Website is opened");
		}else {
			System.out.println("Website is not opened");
		}
		
		
		rm.closeBrowser();

	}
	
	@Test(priority=2)											//Test Annotation
	public void testCase1() throws InterruptedException		//Test method
	{
		//Call the reusable methods in the test method
		BaseClass rm = new BaseClass();
		
		rm.openBrowser();
		
		Thread.sleep(1000);	
		
		String title = rm.getWebPageTitle();
		System.out.println("Title fetched by Selenium: "+title);
		
		if( title.contains("UK Sotheby's International Realty") )
		{
			System.out.println("Website is opened");
		}else {
			System.out.println("Website is not opened");
		}
		
		
		rm.closeBrowser();

	}

}
