package Examples;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import Mock.MockJSON;
import io.restassured.RestAssured;

public class NonParametarizedPayloadPost {

	@Test
	public static void nonPar()
	{
		RestAssured.baseURI="http://216.10.245.166";
		String resp = 	given()
				.header("Content-Type", "application/json")
				.body(MockJSON.BookAPI())
				.when()
				.post("Library/Addbook.php")
				.then().assertThat().statusCode(200)
				.extract().response().asString();
		System.out.println(resp);
	}
}
