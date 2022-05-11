package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportDemo 
{
	static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException 
	{
		//ExtentHtmlReporter extReport = new ExtentHtmlReporter();
		ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extentReport.html");
		
		ExtentReports extReporter = new ExtentReports();
		extReporter.attachReporter(htmlReporter);
		
		ExtentTest test1 = extReporter.createTest("Google Search Test", "To validate search function");
		
		WebDriverManager.chromedriver().setup();
		test1.log(Status.INFO, "Started browser");
		driver = new ChromeDriver();
		
		test1.log(Status.PASS, "Navigated to Google");
		driver.get("https://google.com");
		
		test1.log(Status.PASS, "Entered in search box");
		driver.findElement(By.name("q")).sendKeys("Automation");
		
//		test1.log(Status.PASS, "Clicked on Search button");
//		Thread.sleep(2000);
//		driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		
		test1.log(Status.INFO, "Test End");
		driver.quit();
		
		test1.log(Status.INFO, "Close the browser");
		
		extReporter.flush();
		
	}

}
