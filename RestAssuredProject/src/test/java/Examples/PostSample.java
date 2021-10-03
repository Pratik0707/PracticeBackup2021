package Examples;
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
import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.RestAssured;

public class PostSample {
	@Test
	public void postreq()
	{
		RestAssured.baseURI="https://rahulshettyacademy.com";

				String aa = 
						given()
						.log().all()
						.header("Content-Type", "application/json")
						.queryParam("key", "qaclick123")
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
						.post("/maps/api/place/add/json")
						.then()
						.header("Content-Type", "application/json;charset=UTF-8")
						.header("Server", "Apache/2.4.18 (Ubuntu)")
						.header("Connection", "Keep-Alive")
						.body("scope", equalTo("APP"))
						.assertThat()
						.statusCode(200)
						.extract().response().asString();
		
				System.out.println(aa);


	}

}
