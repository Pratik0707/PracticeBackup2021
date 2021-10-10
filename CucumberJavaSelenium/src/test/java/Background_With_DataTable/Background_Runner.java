package Background_With_DataTable;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Background_With_DataTable/Login.feature", glue= {"Background_With_DataTable"},
plugin= {"pretty", "html:target/HTMLreports",
		"json:target/JSONReports/report.json",
		"junit:target/JUNITReports/report.xml"},
monochrome=true, dryRun = true)
public class Background_Runner {

}
