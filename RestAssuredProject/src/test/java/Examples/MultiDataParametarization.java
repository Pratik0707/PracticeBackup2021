package Examples;

import static io.restassured.RestAssured.given;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Mock.MockJSON;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class MultiDataParametarization {

	@Test(dataProvider="BookData")
	public static void param(String isbn, String aisle)
	{
		RestAssured.baseURI="http://216.10.245.166";
		String resp = 	given()
				.header("Content-Type", "application/json")
				.body(MockJSON.PayloadP(isbn,aisle))// parametarizing payload(JSON)
				.when()
				.post("Library/Addbook.php")
				.then().assertThat().statusCode(200)
				.log().all()
				.extract().response().asString();
		System.out.println(resp);

		JsonPath js1 = new JsonPath(resp);
		String id=js1.get("ID");
		System.out.println(id);	
	}

	@DataProvider(name="BookData")
	public Object[][] getData()
	{
		return new Object[][] {{"dasas","599"},{"trty","2323"},{"tna","9174"}};// we are creating 3 arrays to pass data
		// so here above method will be invoked 3 times since it has 3 data fields and it will execute with 3 data sets 
	}
}
