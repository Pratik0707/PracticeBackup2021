package StepDefinitions.AllHere_RerunFailures;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {


	WebDriver dr = null;

	@Given("I am on login page of the application") public void
	i_am_on_login_page_of_the_application() {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/e5624267/git/PracticeBackup2021/CucumberJavaSelenium/src/test/resources/Drivers/chromedriver.exe"
				); dr = new ChromeDriver(); dr.manage().window().maximize();
				dr.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
				dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				dr.get("https://example.testproject.io/web/");

	}

	@When("^I Enter a valid (.*)$") public void i_enter_a_valid_username(String username) 
	{ 
		dr.findElement(By.id("name")).sendKeys(username); 
	}

	@And("^I enter a valid (.*)$") public void i_enter_a_valid_password(String
			password) { dr.findElement(By.id("password")).sendKeys(password); }

	@And("I click on Login button") public void i_click_on_login_button() throws
	InterruptedException { Thread.sleep(1500);
	dr.findElement(By.id("login")).click(); }

	@Then("I Successfully login to the application") public void
	i_successfully_login_to_the_application() throws InterruptedException {
		dr.findElement(By.id("pageProfilep")); Thread.sleep(1000); dr.close(); }

}
