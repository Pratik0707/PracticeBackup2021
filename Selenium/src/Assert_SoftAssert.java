import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Assert_SoftAssert {

	public static void main(String[] args) {

		// >>> HARD Assert
		//		System.out.println("Execution started");
		//		try
		//		{
		//			Assert.assertTrue(false);
		//			System.out.println("After assert.. .");
		//		}
		//		catch(AssertionError  e)
		//		{
		//			System.out.println("In catch");
		//			System.out.println(e);
		//		}

		// >>> Soft Assert
		SoftAssert sf = new SoftAssert();
		sf.assertTrue(false);
		System.out.println("1st failure");
		sf.assertAll();// prints the execptions generted in code
		// after assertAll(), if you write code, then that code will not be executed
	}
}
