package Background;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Background_stepDef {

	@Given("^user at login page$")
	public void user_at_login_page() {
		System.out.println("background : 1. user at login page");
	}

	@When("^user enters Uname$")
	public void user_enters_uname()  {
		System.out.println("background : 2. user enters Uname");
	}

	@And("^user enters Pwd$")
	public void user_enters_pwd()  {
		System.out.println("background : 3. user enters Pwd");
	}

	@Then("^user logs in$")
	public void user_logs_in()  {
		System.out.println("background : 4. user  logs in");
	}

	@When("^user selects fill form$")
	public void user_selects_fill_form()  {
		System.out.println("Scenario 1 : 1. user selects fill form");
	}

	@Then("^a blank form opens$")
	public void a_blank_form_opens()  {
		System.out.println("Scenario 1 : 2. a blank form opens");
	}

	@When("^user submits a form$")
	public void user_submits_a_form() {
		System.out.println("Scenario 2 : 1. user submits a form");
	}	

	@Then("^success message is displayed$")
	public void success_message_is_displayed() {
		System.out.println("Scenario 2 : 2. success message is displayed");
	}




}
