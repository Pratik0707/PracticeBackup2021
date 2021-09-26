import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class AllBrowsers {

	public static void main(String[] args) {
		//IE
		System.setProperty("webdriver.ie.driver", "D:IE Driver ServerIEDriverServer.exe");
		WebDriver dr = new InternetExplorerDriver();
		
		System.setProperty("webdriver.gecko.driver", "D:FF Driver geckodriver.exe");
		WebDriver drr = new FirefoxDriver();
		
		Assert.assertTrue(false);
			
		Assertion assr = new Assertion(); // HARD ASSERT
		 
		SoftAssert softAssert = new SoftAssert(); // SOFT ASSERT
		softAssert.assertTrue(boolean Condition);
		
		Actions act = new Actions(dr);
		act.moveToElement(el).click().perform();
		
		}

}
