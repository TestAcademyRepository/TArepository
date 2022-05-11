package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLink 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); //open the browser
		driver.get("https://imtestacademy.com/"); //Enter URL
		driver.manage().window().maximize(); //Maximize window
		Thread.sleep(3000); //It is a waiting time.
		
		//driver.findElement(By.xpath("//a[text()='My account']")).click(); //Click
		//Thread.sleep(3000); //3 sec
		
		String href = driver.findElement(By.xpath("//div[@data-id='1213f093']//a")).getAttribute("href");
		
		if(href == null || href.isEmpty())
		{
			System.out.println("Link is broken");
		}else {
			System.out.println("Link is fine");
		}
		
		driver.quit();

	}

}
