package Examples;
import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;
import Mock.MockJSON;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class ParametarizedPayloadPost {
	@Test
	public static void param()
	{
		RestAssured.baseURI="http://216.10.245.166";
		String resp = 	given()
				.header("Content-Type", "application/json")
				.body(MockJSON.PayloadP("ppp","1p7"))// parametarizing payload(JSON)
				.when()
				.post("Library/Addbook.php")
				.then().assertThat().statusCode(200)
				.log().all()
				.extract().response().asString();
		System.out.println(resp);

		JsonPath js1 = new JsonPath(resp);
		String id = js1.get("ID");
		System.out.println(id);
	}
}
