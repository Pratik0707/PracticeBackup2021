package Hooks_all;
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

public class Hooks_StepDef {

	WebDriver dr = null;

	@Before // Runs before all scenarios available in this file
	public void browserSetup()
	{
		System.out.println("=== Before ===");
				
	}

	@After 
	//if @smoke tag is mentioned, so this will run only after a scenario with @smoke tag 
	public void closeBrowser()
	{
		System.out.println("=== After ===");  
	}

	@After(value="@smoke", order =1)  
	public void closeBrowser2()
	{
		System.out.println("=== After >>>>> smoke ===");
	}

//	@Before(order = 2) // we can have multiple before and after functions,it will be executed according to alphabetical order if order is not mentioned
//	public void testBefore()
//	{
//		System.out.println("2nd before-scenario");
//	}
//
//	@After(order = 1)// after : execution order 2 then 1, but for before it is 1 and then 2
//	public void testAfter()
//	{
//		System.out.println("2nd After-scenario");
//	}

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

	@Given("^user at hooks 1$")
	public void user_at_hooks_1()   {

	}

	@When("^user hooks 1$")
	public void user_hooks_1()  {

	}

	@And("^user hook hooks 1$")
	public void user_hook_hooks_1() {

	}
	@Given("^user at hooks 2$")
	public void user_at_hooks_2()   {

	}

	@When("^user hooks 2$")
	public void user_hooks_2()  {

	}

	@And("^user hook hooks 2$")
	public void user_hook_hooks_2() {

	}

	@Given("^user at hooks 3$")
	public void user_at_hooks_3()   {

	}

	@When("^user hooks 3$")
	public void user_hooks_3()  {

	}

	@And("^user hook hooks 3$")
	public void user_hook_hooks_3() {

	}
}
