package Background_With_DataTable;

import java.util.List;

import io.cucumber.datatable.DataTable;
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
	public void user_enters_uname(DataTable dataTable)  {		
		System.out.println("background : 2. user enters Uname");
		List<List<String>> cell =dataTable.cells(); 
		System.out.println("1st Uname : "+cell.get(0).get(0));//0th row 0th element
		System.out.println("1st Uname : "+cell.get(1).get(0));//1st row 0th element
	}

	@And("^user enters Pwd$")
	public void user_enters_pwd(DataTable dataTable)  {
		System.out.println("background : 3. user enters Pwd");
		List<List<String>> cell2 =dataTable.cells(); 		
		System.out.println("1st Uname : "+cell2.get(0).get(0));//0th row 0th element
		System.out.println("1st Uname : "+cell2.get(1).get(0));//1st row 0th element
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
