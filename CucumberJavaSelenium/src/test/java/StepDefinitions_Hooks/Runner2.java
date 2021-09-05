package StepDefinitions_Hooks;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features_Hooks", glue= {"StepDefinitions_Hooks"},
plugin= {"pretty", "html:target/HTMLreports",
		"json:target/JSONReports/report.json",
		"junit:target/JUNITReports/report.xml"},
monochrome=true
		)
public class Runner2 {

}
