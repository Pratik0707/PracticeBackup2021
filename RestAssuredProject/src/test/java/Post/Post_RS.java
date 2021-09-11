package Post;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured.*;


public class Post_RS {
	// In post > we can directly use put to add new values in json or we can directly give json code in body() method
	// Here we are using direct JSON body, in other test case we have used PUT
	@Test
	void testPost()
	{
		RestAssured.baseURI = "https://rahulshettyacademy.com"; //we get it in API contract document.
		
		given()
		.log().all()// to get a log of all request activities we use this
		.queryParam("key", "qaclick123")// we get it in PI contract document, it will be apended at end of base URL to form a final target URL
		.header("Content-Type", "application/json")// get from api contract: we are telling that body will be in JSON format
		.body("{\r\n"
				+ "  \"location\": {\r\n"
				+ "    \"lat\": -38.383494,\r\n"
				+ "    \"lng\": 33.427362\r\n"
				+ "  },\r\n"
				+ "  \"accuracy\": 50,\r\n"
				+ "  \"name\": \"Frontline house\",\r\n"
				+ "  \"phone_number\": \"(+91) 983 893 3937\",\r\n"
				+ "  \"address\": \"29, side layout, cohen 09\",\r\n"
				+ "  \"types\": [\r\n"
				+ "    \"shoe park\",\r\n"
				+ "    \"shop\"\r\n"
				+ "  ],\r\n"
				+ "  \"website\": \"http://google.com\",\r\n"
				+ "  \"language\": \"French-IN\"\r\n"
				+ "}\r\n"
				+ "")
		.when()
		.post("/maps/api/place/add/json")// this is resource field we get from API contract
		.then()
		.assertThat()
		.statusCode(200).body("scope", equalTo("APP"))// got from postman > response > body. We can validate multiple fields we get in response body
		.header("Server", "Apache/2.4.18 (Ubuntu)")// got from postman > response > header. We can validate multiple fields we get in header, this one is IMP to checjk from which server we are getting the response
		.log().all();// to get a log of all response activities we use this		
		
	}
}




















