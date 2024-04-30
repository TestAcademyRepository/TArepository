package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import utilities.BaseClass;
import utilities.ExtentManager;

public class HomepageObjects extends BaseClass
{
	//Locate all the elements to automate

	//Old process to find element
	//WebElement hamburgerMenu = driver.findElement(By.xpath(""));
	
	//New process to find element
	@FindBy(xpath = "//div[@class='hamburger-react']")
	WebElement hamburgerMenu;
	
	@FindBy(xpath = "//a[text()='Contact Us']")
	WebElement contactUsLink;
	
	//PageFactory.initElements to initialize all the elements located by @FindBy
	public HomepageObjects()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Public method for each element to perform action
	public boolean checkHamburgerMenu()
	{
		return checkElementVisibility(hamburgerMenu, "Hamnurger menu is displayed");
	}
	
	public boolean clickHamburgerMenu()
	{
//		hamburgerMenu.click();
		
		return clickElement(hamburgerMenu, "Clicked on Hamburger menu");
	}
	
	public boolean checkContactUsLink()
	{
		return checkElementVisibility(contactUsLink, "Contact Us link is displayed");
	}

	public boolean clickContactUsLink()
	{
		return clickElement(contactUsLink, "Clicked on Contact Us link");
	}

}
