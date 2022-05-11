package examples;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecution 
{
	@BeforeTest
	@Parameters("browserName")
	public void setup(String browser)
	{
		System.out.println("Browser is: "+browser);
		
	}
	
	@Test
	public void test()
	{
		
	}
	
	@AfterTest
	public void tearDown()
	{
		
	}

}
