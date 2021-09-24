package OAuth_2_0.GrantType_ClientCredentials;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.given;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;
import pojo.Api;
import pojo.GetCourse;
import static org.hamcrest.Matchers.equalTo;
import org.testng.Assert;
import org.testng.annotations.Test;

import OAuth_2_0.GrantType_Authorization.pojo;

import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.RestAssured;

public class OauthC {
	@Test
	public static void main(String[] args) {
		String accessTokenResponse=	
				given()
				.queryParams("client_id","692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
				.queryParams("client_secret","erZOWM9g3UtwNRj340YYaK_W")
				.queryParams("grant_type","client_credentials")
				.when().log().all()
				.post("https://www.googleapis.com/oauth2/v4/token").asString();
		JsonPath js=new JsonPath(accessTokenResponse);
		String accessToken=js.getString("access_token");// fetch ACCESS-TOKEN

		String r2= given().contentType("application/json")
				.queryParams("access_token", accessToken).expect().defaultParser(Parser.JSON)//use fetched ACCESS-TOKEN
				.when()
				.get("https://rahulshettyacademy.com/getCourse.php")
				.asString();
		
		// NOW use the access token for next all requests to authenticate and get the response
		
		String resp = 
		given().contentType(ContentType.JSON)
		.auth().oauth2(accessToken)// use the ACCESS-TOKEN we got in above step
		.queryParam("", "")// pass any query param as required
		.body("PASS JSON BODY")
		.log().all()
		.when()
		.post("URL")
		.then()
		.assertThat()
		.statusCode(200)
		.body("field name", equalTo("Expected value"))
		.extract().response().asPrettyString();
		

		// once the authentication automation is successful, we can use the code like below 
		// to further verify the response body fields.

		// In case of NON-POJO, use below code to verify response body fields
		JsonPath jp = new JsonPath(resp);
		String capturedAdd = jp.getString("address");
		System.out.println(capturedAdd);// we captured the JSON response of GET and we got here the address
		Assert.assertEquals(capturedAdd, ExpectedAddress);//we are aserting whether actual and expected address are same

		// In case of ## pojo, verify like this
		System.out.println(gc.getLinkedIn()); 
		System.out.println(gc.getInstructor());
		System.out.println(gc.getCourses().getApi().get(1).getCourseTitle());

		List<Api> apiCourses=gc.getCourses().getApi();
		for(int i=0;i<apiCourses.size();i++)
		{
			if(apiCourses.get(i).getCourseTitle().equalsIgnoreCase("SoapUI Webservices testing"))
			{
				System.out.println(apiCourses.get(i).getPrice());
			}
		}

		//Get the course names of WebAutomation
		ArrayList<String> a= new ArrayList<String>();


		List<pojo.WebAutomation> w=gc.getCourses().getWebAutomation();

		for(int j=0;j<w.size();j++)
		{
			a.add(w.get(j).getCourseTitle());
		}

		List<String> expectedList=	Arrays.asList(courseTitles);

		Assert.assertTrue(a.equals(expectedList))
	}
}




		












