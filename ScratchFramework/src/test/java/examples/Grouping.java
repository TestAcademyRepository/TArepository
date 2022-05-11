package examples;

import org.testng.annotations.Test;

public class Grouping 
{
	@Test (groups = {"g1.group"})
	public void test1()
	{
		System.out.println("Test1");
	}
	
	@Test (groups = {"g2.group"})
	public void test2()
	{
		System.out.println("Test2");
	}
	
	@Test (groups = {"g1.group", "g3.group"})
	public void test3()
	{
		System.out.println("Test3");
	}

}
