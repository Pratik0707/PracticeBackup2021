package Examples;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.annotations.Test;
import Mock.MockJSON;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class Json_Path{
	@Test
	public static void param() throws IOException
	{		
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String response = // storing entire response as a string
				given()
				.log().all()// to get a log of all request activities we use this
				.queryParam("key", "qaclick123")// we get it in PI contract document, it will be apended at end of base URL to form a final target URL
				.header("Content-Type", "application/json")// get from api contract: we are telling that body will be in JSON format
				.body(Files.readAllBytes(Paths.get("C:\\Users\\e5624267\\git\\PracticeBackup2021\\Selenium\\All Selenium + Java\\API\\ExternalFile.json")))// JSON file path.
				.when()
				.post("/maps/api/place/add/json")// this is resource field we get from API contract
				.then()
				.assertThat()
				.statusCode(200).body("scope", equalTo("APP"))// got from postman > response > body. We can validate multiple fields we get in response body
				.header("Server", "Apache/2.4.18 (Ubuntu)")// got from postman > response > header. We can validate multiple fields we get in header, this one is IMP to checjk from which server we are getting the response
				.extract().response().asString();// use to extract response as a string
		System.out.println(response);//printing response JSON

		JsonPath js = new JsonPath(response);// class use to parse json response string we captured. it will convert string to JSON
		String placeId = js.get("place_id");// use jsonpathfinde to find a path of a node. here it will return a string value available for place_id field in JSON
		System.out.println("place id- : "+placeId);

	}
}
