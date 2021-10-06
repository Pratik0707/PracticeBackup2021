package DataTable;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {


	WebDriver dr = null;

	@Given("I am on login page of the application") public void
	i_am_on_login_page_of_the_application() {
//		System.setProperty("webdriver.chrome.driver",
//				"C:/Users/e5624267/git/PracticeBackup2021/CucumberJavaSelenium/src/test/resources/Drivers/chromedriver.exe"
//				); dr = new ChromeDriver(); dr.manage().window().maximize();
//				dr.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//				dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//				dr.get("https://example.testproject.io/web/");
		System.out.println("at I am on login page of the application");

	}

	
	@When("^I Enter credentials$")
	public void i_enter_credentials(DataTable dataTable) {

		List<List<String>> cell =dataTable.cells(); 
			System.out.println("1st Uname : "+cell.get(0).get(0));//0th row 0th element
			System.out.println("1st Pwd : "+cell.get(0).get(1));//0th row 1st element
			
			System.out.println("2nd Uname : "+cell.get(1).get(0));//1st row 0th element
			System.out.println("2nd Pwd : "+cell.get(1).get(1));//1st row 1nd element
		}
	// >>>>>> Another way to access data-table values : 
	

	@And("I click on Login button") public void i_click_on_login_button() throws
	InterruptedException { Thread.sleep(1500);
	//dr.findElement(By.id("login")).click(); 
	System.out.println("I click on Login button");
	}

	@Then("I Successfully login to the application") public void
	i_successfully_login_to_the_application() throws InterruptedException {
	//	dr.findElement(By.id("pageProfile")); Thread.sleep(1000); dr.close();
		System.out.println("I Successfully login to the application");		
		}

}

