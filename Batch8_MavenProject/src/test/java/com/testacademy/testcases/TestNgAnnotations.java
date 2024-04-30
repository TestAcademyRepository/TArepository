package com.testacademy.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.BaseClass;

public class TestNgAnnotations		
{

	@Test
	public void testCase1() throws InterruptedException		
	{
		
		//Annotations
		
		//@BeforeSuite
			//@BeforeTest
				//@BeforeClass
					//@BeforeMethod
						//@Test
					//@AfterMethod
				//@AfterClass
			//@AfterTest
		//@AfterSuite
		
		System.out.println("Test method 1");

	}
	
	@Test
	public void testCase2() throws InterruptedException		
	{
		System.out.println("Test method 2");

	}
	
	
	@BeforeMethod			//Execute before every Test method
	public void abc1()
	{
		System.out.println("Before Method");
	}
	
	@AfterMethod			//Execute after every Test method
	public void abc2()
	{
		System.out.println("After Method");
	}
	
	@BeforeClass
	public void abc3()
	{
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void abc4()
	{
		System.out.println("After Class");
	}
	
	

}
