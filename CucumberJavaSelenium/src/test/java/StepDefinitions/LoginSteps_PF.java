package StepDefinitions;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageFactory.LoginPage_PF;
import PageObjectModel.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps_PF {

	WebDriver dr=null;
	LoginPage_PF pf;
	@Given("I am on login page of the application")
	public void i_am_on_login_page_of_the_application() {
		System.out.println("=== Page Factory ===");
		System.setProperty("webdriver.chrome.driver", "C:/Users/e5624267/git/PracticeBackup2021/CucumberJavaSelenium/src/test/resources/Drivers/chromedriver.exe");
		dr=new ChromeDriver();
		dr.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		dr.manage().window().maximize();
		dr.get("https://example.testproject.io/web/");
	}

	@When("^I Enter a valid (.*)$")
	public void i_enter_a_valid_username(String username) {
		pf = new LoginPage_PF(dr);
		pf.setUserName(username);
	}

	@And("^I enter a valid (.*)$")
	public void i_enter_a_valid_password(String password) {
		pf.setPassword(password);
	}

	@And("I click on Login button")
	public void i_click_on_login_button() {
		pf.clickLoginButton();
	}

	@Then("I Successfully login to the application")
	public void i_successfully_login_to_the_application() {
		dr.close();
	}
}
