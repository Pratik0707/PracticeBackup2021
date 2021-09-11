package Post;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class TestOnLocalAPI_POST {

	@Test
	public void PostReq()
	{ // In post > we can directly use put to add new values in json or we can directly give json code in body() method
		// Here we are using PUT, in other test case we have used direct JSON body
		JSONObject jsn = new JSONObject();
		jsn.put("id", "4");
		jsn.put("name", "Pratik");
		jsn.put("lastname", "Lnm");

		given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(jsn.toJSONString())
		.when()
		.post("http://localhost:3000/users")
		.then()
		.statusCode(201);
		
		// 2nd post req.
		jsn.put("id", "5");
		jsn.put("name", "Ima");
		jsn.put("lastname", "Haris");

		given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(jsn.toJSONString())
		.when()
		.post("http://localhost:3000/users")
		.then()
		.statusCode(201);
		
	}
}


























