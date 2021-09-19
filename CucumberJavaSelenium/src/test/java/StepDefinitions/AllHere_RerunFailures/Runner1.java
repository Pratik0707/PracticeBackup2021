package StepDefinitions.AllHere_RerunFailures;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/StepDefinitions/AllHere_RerunFailures/Login.feature",glue={"StepDefinitions.AllHere_RerunFailures"},
//plugin={"pretty","json:target/JSONReports/report.json",
plugin = { "pretty", "html:target/HTMLreports",
		"json:target/JSONReports/report.json",
		"rerun:target/failed_scenarios.txt", // It generates failed_scenarios.txt file for failed scenarion in target folder
"junit:target/JUNITReports/report.xml"}, 
monochrome=true,tags="@Regression or @smoke"
		)
public class Runner1 {

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


