package Get;
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
import io.restassured.path.json.JsonPath;
import io.restassured.RestAssured;
public class GetSample {

	@Test
	public void getOne()
	{
		RestAssured.baseURI="https://rahulshettyacademy.com";
		String res = 
				given()
				.header("Content-Type", "application/json")//Not required since we do not have a body.
				.queryParam("key", "qaclick123")
				.queryParam("place_id", "7964bbd7eb1bad60d5b5b12bb3ad716e")
				.when()
				.get("/maps/api/place/get/json")
				.then()
				.contentType(ContentType.JSON)
				.body("accuracy", equalTo("50"))
				.body("location.longitude", equalTo("33.427362"))
				.assertThat()
				.statusCode(200)
				.extract().response().asPrettyString();

		System.out.println("Response = "+res);

	}
}
