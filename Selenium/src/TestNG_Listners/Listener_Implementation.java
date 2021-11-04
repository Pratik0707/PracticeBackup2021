package TestNG_Listners;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(TestNG_Listners.Listener1.class) //provide it incase not mentioned in test.xml file
//In case of multiple listeners : give comma seperated values : @Listeners({ com.example.MyListener.class, com.example.MyMethodInterceptor.class })
public class Listener_Implementation {

	@Test
	public void test1()
	{
		System.out.println("In test 1");	
	}

	@Test
	public void test2()
	{
		System.out.println("In test 2");
		Assert.assertTrue(false);
	}

	@Test
	public void test3()
	{
		System.out.println("In test 3");
		throw new SkipException("This test#3 is skipped");
	}
}
