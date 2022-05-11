package examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerExp {

	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//No need to download or set the path of drivers.
		//WebDriver manager will take care of driver setup. 
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	}

}
