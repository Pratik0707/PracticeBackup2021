package StepDefinitions;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckBoxSteps {
	WebDriver dr = null;
	@Given("I am on the home page")
	public void i_am_on_the_home_page() {
		System.setProperty("webdriver.chrome.driver","C:/Users/e5624267/git/PracticeBackup2021/CucumberJavaSelenium/src/test/resources/Drivers/chromedriver.exe");
		dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dr.get("https://www.seleniumeasy.com/test/");
	}

	@When("I click on Input forms dropdown")
	public void i_click_on_input_forms_dropdown() {
		dr.findElement(By.xpath("//a[contains(text(),'Input Forms')]")).click();

	}

	@And("I select CheckBox demo option")
	public void i_select_check_box_demo_option() {
		WebDriverWait wt = new WebDriverWait(dr, 10);
		WebElement chkBoxDemo = wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Checkbox Demo')]")));
		chkBoxDemo.click(); 
	}

	@And("I click on Click on this check box")
	public void i_click_on_click_on_this_check_box() {
		dr.findElement(By.id("isAgeSelected")).click();
	}

	@Then("I can see a Success message")
	public void i_can_see_a_success_message() {
		dr.findElement(By.id("txtAge"));
		dr.close();
	}

}
