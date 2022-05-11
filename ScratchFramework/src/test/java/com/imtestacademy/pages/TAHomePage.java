package com.imtestacademy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class TAHomePage 
{	
	//Traditional way
	static WebDriver driver;
	
	static WebElement headerAboutUs;
	static WebElement allCoursesBtn;
	
	public WebElement header_links(WebDriver driver)
	{
		headerAboutUs= driver.findElement(By.xpath("//li[@id='menu-item-25308']"));
		return headerAboutUs;
	}
	
	public WebElement viewAllCourseBtn(WebDriver driver)
	{
		allCoursesBtn = driver.findElement(By.xpath("//div[@data-id='1213f093']"));
		return allCoursesBtn;
	}

}
