package StepDefinitions;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue={"StepDefinitions"},
//plugin={"pretty","json:target/JSONReports/report.json",
plugin = { "pretty", "html:target/HTMLreports",
		"json:target/JSONReports/report.json",
		"junit:target/JUNITReports/report.xml"}, 
monochrome=true,tags="@Regression"
		)
public class Runner1 {

}
