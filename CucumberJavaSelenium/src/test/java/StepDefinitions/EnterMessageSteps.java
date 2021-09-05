package StepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EnterMessageSteps {

	@Given("I am on home page")
	public void i_am_on_home_page() {
		System.out.println("1. I am on home page");
	}

	@When("I click on Input form dorpdown")
	public void i_click_on_input_form_dorpdown() {
		System.out.println("2. I click on Input form dorpdown");
	}

	@And("I select Simple form demo option")
	public void i_select_simple_form_demo_option() {
		System.out.println("3. I select Simple form demo option");
	}

	@And("I enter a message in Enter message text box")
	public void i_enter_a_message_in_enter_message_text_box() {
		System.out.println("4. I enter a message in Enter message text box");
	}

	@And("I click on Show message button")
	public void i_click_on_show_message_button() {
		System.out.println("5. I click on Show message button");
	}

	@Then("Entered message is displayed as Your Message")
	public void entered_message_is_displayed_as_your_message() {
		System.out.println("6. Entered message is displayed as Your Message");
	}


}
