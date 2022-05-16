package listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(examples.TestNgListeners.class)
//we can remove this annotation as it is mentioned in testng.xml file
//@Listeners({examples.TestNgListeners1.class},{examples.TestNgListeners2.class})
//use this statement to call listeners from multiple files.
public class ListenersDemo
{
	@Test
	public void test1()
	{
		System.out.println("I am in a Test1");
	}
	@Test
	public void test2()
	{
		System.out.println("I am in a Test2");
		//Assert.assertTrue(false); //OnFailure listener will execute
	}
	@Test
	public void test3()
	{
		System.out.println("I am in a Test3");
	}

}
