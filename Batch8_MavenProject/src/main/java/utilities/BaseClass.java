package utilities;

import java.io.IOException;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.Status;
import com.sun.tools.sjavac.Log;

public class BaseClass 
{
	
	public static WebDriver driver;
	
	@BeforeClass
	public void openBrowser()
	{
		driver = new ChromeDriver();
		BaseClass.log().info("Chrome browser opened");
		
		driver.get("https://sothebysrealty.co.uk/");
		BaseClass.log().info("Entered Sotheby's URL");
		
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
		BaseClass.log().info("Browser closed");
	}
	
	@BeforeSuite
	public void reportGenerate() throws IOException
	{
		ExtentManager.setExtent();
	}
	
	@AfterSuite
	public void endReport()
	{
		ExtentManager.endReport();
	}
	
	//to generate logs
	public static Logger log()
	{
		return LogManager.getLogger(Thread.currentThread().getStackTrace()[2].getClassName());
	}
	
	public String getWebPageTitle()
	{
		String title = driver.getTitle();
		return title;
	}
	
	
	public boolean checkElementVisibility(WebElement element, String msg)
	{
		boolean result = false;
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.visibilityOf(element));
			
			if(element.isDisplayed())
			{
//				System.out.println("Element is displayed");
				BaseClass.log().info(msg);
				ExtentManager.test.log(Status.PASS, msg);
				
				result = true;
			}else {
//				System.out.println("Element is not displayed");
				BaseClass.log().error("Failed: "+msg);
				ExtentManager.test.log(Status.FAIL, msg);
				
				result = false;
			}
		}catch(Exception e)
		{
//			System.out.println("Exception generated: "+e);
			BaseClass.log().error("Exception generated: "+e);
			result = false;
		}
		
		return result;
	}
	
	public boolean clickElement(WebElement element, String msg)
	{
		boolean result = false;
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.elementToBeClickable(element));
				
			element.click();
//			System.out.println("Clicked on Element");
			BaseClass.log().info(msg);
			
			result = true;
			
		}catch(Exception e)
		{
//			System.out.println("Exception generated: "+e);
			BaseClass.log().error("Exception generated: "+e);
			result = false;
		}
		
		return result;
	}
	
	public boolean enterData(WebElement element, String name)
	{
		boolean result = false;
		try {
			if(element.isEnabled())
			{
				element.sendKeys(name);
//				System.out.println("Element is enable");
				BaseClass.log().info("Element is enable");
				
				result = true;
			}else {
//				System.out.println("element is disable");
				BaseClass.log().error("element is disable");
				result = false;
			}
			
		}catch(Exception e)
		{
//			System.out.println("Exception generated: "+e);
			BaseClass.log().error("Exception generated: "+e);
			result = false;
		}
		
		return result;
	}

}
