package Parallel_Execution;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Parallel_Execution", glue={"Parallel_Execution"},
//plugin={"pretty","json:target/JSONReports/report.json",
plugin = { "pretty", "html:target/HTMLreports",
		"json:target/JSONReports/report.json",
"junit:target/JUNITReports/report.xml"}, 
monochrome=true
		)
public class Runner1p {

}

// *********** parallel execution ************* //

// mention below code in pom.xml to run feature files parallely 
//(features covered in mentioned runner class will run parallely)

//<build>
//<plugins>
//	<plugin>
//		<groupId>org.apache.maven.plugins</groupId>
//		<artifactId>maven-surefire-plugin</artifactId>
//		<version>3.0.0-M5</version>
//		<configuration>
//			<includes>
//				<include>**/*Runner1p.java</include> // mention runner file u want to run parallely 
//													//(features covered in this runner will run parallely)
//			</includes>
//			<parallel>methods</parallel>
//		<!-- 	<threadCount>2</threadCount> -->
//			<useUnlimitedThreads>true</useUnlimitedThreads>
//		</configuration>
//	</plugin>
//</plugins>
//</build>



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


