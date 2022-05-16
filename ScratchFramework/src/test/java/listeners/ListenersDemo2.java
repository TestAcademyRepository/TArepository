package listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(examples.TestNgListeners.class)
//we can remove this annotation as it is mentioned in testng.xml file
//@Listeners({examples.TestNgListeners1.class},{examples.TestNgListeners2.class})
//use this statement to call listeners from multiple files.
public class ListenersDemo2 
{
	@Test
	public void test4()
	{
		System.out.println("I am in a Test4");
	}
	@Test
	public void test5()
	{
		System.out.println("I am in a Test5");
		//Assert.assertTrue(false); //OnFailure listener will execute
	}
	@Test
	public void test6()
	{
		System.out.println("I am in a Test6");
	}

}
