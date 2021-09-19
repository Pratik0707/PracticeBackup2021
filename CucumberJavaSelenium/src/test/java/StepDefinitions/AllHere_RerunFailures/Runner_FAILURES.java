package StepDefinitions.AllHere_RerunFailures;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="@target/failed_scenarios.txt", glue={"StepDefinitions.AllHere_RerunFailures"}, // mention path of failed txt file and mention the path in features with @
//plugin={"pretty","json:target/JSONReports/report.json",
plugin = { "pretty", "html:target/HTMLreports",
		"json:target/JSONReports/report.json",
"junit:target/JUNITReports/report.xml"}, 
monochrome=true
		)
public class Runner_FAILURES {

}

//@RunWith(Cucumber.class)
//@CucumberOptions(
//		features = {"C:\\Users\\ankur.jain\\eclipse-workspace\\Cucumber_Test\\src\\main\\java\\com\\qa\\FeatuerFile\\Login.feature",
//		}, //the path of the feature files
//		//format= {"html:target/site/cucumber-pretty;json:target/cucumber.json&quot"},
//		glue={"com.qa.StepDefinition"}, //the path of the step definition files
//		plugin= {"pretty","html:target/site/cucmber-pretty", "json:target/cucumber/cucumber.json","rerun:rerun/failed_scenarios.txt"}, //to generate different types of reporting
//		monochrome = true, //display the console output in a proper readable format
//		strict = true, //it will check if any step is not defined in step definition file
//		dryRun = false//to check the mapping is proper between feature file and step def file
//		
//		//tags = {"@all"}			
//		)


