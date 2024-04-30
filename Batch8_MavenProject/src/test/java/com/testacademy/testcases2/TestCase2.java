package com.testacademy.testcases2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObjects.HomepageObjects;
import utilities.BaseClass;

public class TestCase2
{

	@Test 												
	public void testCase1() throws InterruptedException		
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://sothebysrealty.co.uk/");
		driver.manage().window().maximize();
		
		WebElement hamburger = driver.findElement(By.xpath("//div[@class='hamburger-react']"));
		hamburger.click();
		
		Thread.sleep(1000);
		
		WebElement contactUs = driver.findElement(By.xpath("//a[text()='Contact Us']"));
		contactUs.click();
		
		Thread.sleep(1000);
		
		WebElement fullName = driver.findElement(By.xpath("//input[@name='fullName']"));
		fullName.click();
		fullName.sendKeys("Hello");
		
		driver.navigate().back();
		
		Thread.sleep(1000);
		
		hamburger = driver.findElement(By.xpath("//div[@class='hamburger-react']"));
		hamburger.click();
		
		Thread.sleep(1000);
		
		contactUs = driver.findElement(By.xpath("//a[text()='Contact Us']"));
		contactUs.click();
		
		Thread.sleep(1000);
	
		fullName = driver.findElement(By.xpath("//input[@name='fullName']"));
		fullName.click();
		fullName.sendKeys("Hello");
		
		driver.quit();
		
	}

}
