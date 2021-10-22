package Put;

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

public class PlaceIdVerify {
	@Test
	void endtend()
	{
		//Scenario : we will add(POST) a new place > then update(PUT) place with new address > we will Get() place to validate if new 
		//address is present in response (also verify that old address not present in response)
		RestAssured.baseURI = "https://rahulshettyacademy.com"; //we get it in API contract document.
		// 1. Here 1st we will add(POST) a place
		String response = // storing entire response as a string //
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
				.extract().response().asString();// use to extract response as a string
		System.out.println(response);//printing response JSON

		JsonPath js = new JsonPath(response);// class use to parse json response string we captured. it will convert string to JSON
		String placeId = js.get("place_id");// use jsonpath to find a path of a node. here it will return a string value available for place_id field in JSON

		System.out.println("place id- : "+placeId);

		// 2. Now we will update(PUT) place  #################### PUT ######################

		given()  
		.queryParam("key", "qaclick123")
		.header("Content-Type", "application/json")
		.body("{\r\n"
				+ "\"place_id\":\""+placeId+"\",\r\n" //here we use above variable placeid so that the same place address will be updated
				+ "\"address\":\"70 Summer walk, USA\",\r\n" // and here we give different address to update for the same placid we added(POST) earlier
				+ "\"key\":\"qaclick123\"\r\n"
				+ "}\r\n"
				+ "")
		.when()
		.put("/maps/api/place/update/json")		
		.then()
		.assertThat()
		.statusCode(200)
		.body("msg", equalTo("Address successfully updated"));

		// 3. Now we will fetch(GET) updated address and will verify whether address is really updated

		String ExpectedAddress = "70 Summer walk, USA";
		String getResp = 
				given()
				.queryParam("key", "qaclick123")
				.queryParam("place_id", placeId)
				.when()
				.get("/maps/api/place/get/json")
				.then().assertThat().statusCode(200)
				.extract().response().asString();

		JsonPath jp = new JsonPath(getResp);
		String capturedAdd = jp.getString("address");
		System.out.println(capturedAdd);// we captured the JSON response of GET and we got here the address
		Assert.assertEquals(capturedAdd, ExpectedAddress);//we are aserting whether actual and expected address are same

	}
}
























