package SpecBuilderTest;
import static io.restassured.RestAssured.given;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
public class SpecBuilder_Response {
	@Test
	public void specRes()
	{
		// Request : 
		RequestSpecification req = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
				.addQueryParam("key", "qaclick123")
				.setContentType(ContentType.JSON)
				.build();

		// ********* Response ********* //
		ResponseSpecification resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();


		Response rrs = 
				given()
				.spec(req)// we have used REQUEST-spec builder here
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
				.then().spec(resspec)// we have used RESPONSE-spec builder here)
				.extract().response();

		String rs = rrs.asString(); //convert response to string
		System.out.println(rs);

	}
}
