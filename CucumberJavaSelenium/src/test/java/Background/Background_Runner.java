package Background;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Background/Login.feature", glue= {"Background"},
plugin= {"pretty", "html:target/HTMLreports",
		"json:target/JSONReports/report.json",
		"junit:target/JUNITReports/report.xml"},
monochrome=true)
public class Background_Runner {

}
