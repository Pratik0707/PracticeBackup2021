package StepDefinitions_Hooks;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksDemo1Steps {

	WebDriver dr = null;

	@Before // Runs before all scenarios available in this file
	public void browserSetup()
	{
		System.out.println("=== Before ===");
		System.setProperty("webdriver.chrome.driver", "C:/Users/e5624267/git/PracticeBackup2021/CucumberJavaSelenium/src/test/resources/Drivers/chromedriver.exe");
		dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://example.testproject.io/web/");
		dr.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);		
	}

	@After("@smoke")  
	//if @smoke tag is mentioned, so this will run only after a scenario with @smoke tag 
	public void closeBrowser()
	{
		System.out.println("=== After ===");
		dr.close();	
		dr.quit();    
	}
	
	@After(value="@smoke", order =1)  
	public void closeBrowser2()
	{
		System.out.println("=== After ===");
		dr.close();	
		dr.quit();
	}
		
	@Before(order = 2) // we can have multiple before and after functions,it will be executed according to alphabetical order if order is not mentioned
	public void testBefore()
	{
		System.out.println("2nd before-scenario");
	}
	
	@After(order = 1)// after : execution order 2 then 1, but for before it is 1 and then 2
	public void testAfter()
	{
		System.out.println("2nd After-scenario");
	}
	
	@BeforeStep // it will run before every step available in this file
	public void beforeStep()
	{
		System.out.println("Inside before step");
	}
	
	@AfterStep // it will run after every step available in this file
	public void afterStep()
	{
		System.out.println("Inside after step");
	}
	
//	*******  Actual step definition of feature file begins here ******** //
	
	@Given("user at login page")
	public void user_at_login_page() {	    
	}

	@When("user enters Uname")
	public void user_enters_uname() {	    
	}

	@And("user enters Pwd")
	public void user_enters_pwd() {
	}

	@Then("user logs in")
	public void user_logs_in() {	    
	}

	@Given("user at home page")
	public void user_at_home_page() {	    
	}

	@When("user clicks on dropdown")
	public void user_clicks_on_dropdown() {	    
	}

	@And("users opens a form")
	public void users_opens_a_form() {	    
	}

	@Then("user fills a form")
	public void user_fills_a_form() {	   
	}	
}
