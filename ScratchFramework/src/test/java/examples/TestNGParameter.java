package examples;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameter 
{
	@Test
	@Parameters({"myName"})
	public void test1(String name) //if the parameter is not present in testng.xml then it will take 
												//@Optional value
	{
		System.out.println("Name is: "+name);
	}

}
