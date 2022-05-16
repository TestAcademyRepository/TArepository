package examples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); //open the browser
		driver.get("https://imtestacademy.com/"); //Enter URL
		driver.manage().window().maximize(); //Maximize window
		
//		Thread.sleep(3000); //It is a waiting time.
//		driver.findElement(By.xpath("//div[@data-id='1213f093']//a")).click();
		
		//Implicit wait
		//Explicit wait

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//div[@data-id='1213f093']//a")).click();
		
		Thread.sleep(2000);
		driver.quit();

	}

}
