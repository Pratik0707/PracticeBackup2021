package cucumber.Options;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Features", glue= {"StepDefinitions"}, monochrome=true,
plugin={"json:target/JSONReports/report.json"}
		)
public class TestRunner {

}
