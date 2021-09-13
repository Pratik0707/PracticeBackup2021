package Jira;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured.*;
import io.restassured.path.json.JsonPath;
import io.restassured.RestAssured;
public class LoginToJira {
//1.Login to Jira using API request  :Here we will get ID in "value" section we will use the same session ID for all tests 
//as a session cookie
	/*
	 * we got below response aftre runing this test { "session": { "name":
	 * "JSESSIONID", "value": "CCCD96118BD91E7C50BA5765022BA6DE"  // this is our session cookie ID
	 */
	@Test
	public void LogIn()
	{		
		given()
		.header("Content-Type", "application/json")
		.body("{ \"username\": \"Pratik.toke07\", \"password\": \"Admin@123\" }")
		.when()
		.post("http://localhost:8080/rest/auth/1/session")
		.then()
		.log().all()
		.statusCode(200);
		
		
	}
}
