package com.imtestacademy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TAContactPage 
{
	//POM
	
	WebDriver driver;
	
	By firstName = By.xpath("//input[@id='wpforms-159-field_5']");
	By lastName = By.xpath("//input[@id='wpforms-159-field_5-last']");
	By email = By.xpath("//input[@id='wpforms-159-field_8']");
	
	public TAContactPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void contactFirstName()
	{	
		driver.findElement(firstName).sendKeys("First Name");
	}
	
	public void contactLastName()
	{
		driver.findElement(lastName).sendKeys("Last Name");
	}
	
	public void contactEmail()
	{
		driver.findElement(email).sendKeys("test@test.com");
	}
	

}
