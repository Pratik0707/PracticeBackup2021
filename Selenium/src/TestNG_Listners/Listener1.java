package TestNG_Listners;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener1 implements ITestListener //Listener is used in selenium by implementing Listeners Interface.
{// below overridden methods are methods of interface and here we have provided implementation to all.
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("*** Test started : "+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("*** Test Success : "+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("*** Test failed (take screenshot code to add here) : "+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("*** Test skipped : "+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("*** Test fail success % : "+result.getName());
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("*** Test failed timout : "+result.getName());
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("*** Test On start : "+context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("*** Test On finish : "+context.getName());
	}
}
