package examples;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Annotations 
{
	
	//String myName = "Automation";
	@BeforeSuite
	public void before()
	{
		System.out.println("Before");
		//set browser path
	}
	
	//@Test (priority = 1)
	@Test
	@Parameters({"name"})
	public void test1(@Optional("Selenium") String name)
	{
		System.out.println("Name is: "+name);
	}
	
	@Test (priority = 0)
	public void test2()
	{
		System.out.println("Test 2");
	}
	
	@AfterSuite
	public void after()
	{
		System.out.println("After");
		//close the browser
	}

}
