package Post;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;

@Test
public class PostRequests {
	// PUT request (create)
	public void testCase1()
	{
		JSONObject jsn = new JSONObject();
		jsn.put("name", "Pratik");
		jsn.put("job", "Engg");

		given().
		body(jsn.toJSONString()).
		when().
		post("https://reqres.in/api/users").
		then().
		statusCode(201);
		


	}
}



























