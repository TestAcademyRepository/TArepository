package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class ContactUsObjects extends BaseClass
{
	@FindBy(xpath = "//input[@name='fullName']")
	WebElement fullName;
	
	public ContactUsObjects()
	{
		PageFactory.initElements(driver, this);
	}
	
//	public boolean checkFullNameField()
//	{
//		return checkElementVisibility(fullName);
//	}
	
	public boolean clickFullNameField()
	{
		return clickElement(fullName, "Clicked in Full name field");
	}
	
	public boolean enterFullName(String name)
	{
		return enterData(fullName, name);
	}

}
