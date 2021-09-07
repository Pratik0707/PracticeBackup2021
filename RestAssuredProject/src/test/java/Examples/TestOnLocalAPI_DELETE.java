package Examples;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.json.simple.JSONObject;
public class TestOnLocalAPI_DELETE {

	@Test
	public void PostThenDelete()
	{// will post a new record and then will delete posted record 
		JSONObject jsn = new JSONObject();
		jsn.put("id", "06");
		jsn.put("name", "ToDelete");
		jsn.put("lastname", "Del");
		
		given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(jsn.toJSONString())
		.when()
		.post("http://localhost:3000/users")
		.then()
		.statusCode(201);

		//Delete
		when()
		.delete("http://localhost:3000/users/06")
		.then()
		.statusCode(200);
		

	}

}




























