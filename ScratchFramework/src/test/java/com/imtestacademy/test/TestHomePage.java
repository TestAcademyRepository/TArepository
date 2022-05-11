package com.imtestacademy.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.imtestacademy.pages.TAHomePage;


public class TestHomePage 
{
	static WebDriver driver=null;
	static
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://imtestacademy.com");
	}

	public static void main(String[] args) 
	{
		testHomePage();
	}
	
	public static void testHomePage()
	{
		TAHomePage thp = new TAHomePage();
		thp.header_links(driver).click();
		
		driver.quit();
	}
	
	

}
