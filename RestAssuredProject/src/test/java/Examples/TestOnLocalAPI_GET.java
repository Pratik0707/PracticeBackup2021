package Examples;
import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import org.testng.Assert;

import org.testng.annotations.Test;

public class TestOnLocalAPI_GET {

	@Test
	public void get()
	{
		given().
		get("http://localhost:3000/posts").
		then().
		statusCode(200);
		
		given().get("http://localhost:3000/posts").
		then().body("[0].id", equalto("1"));
	}
}






































