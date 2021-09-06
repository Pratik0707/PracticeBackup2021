package Examples;

import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class PutPatchDelete {

	@Test
	public void test3()
	{
		//		PUT request (update)
		JSONObject jsn = new JSONObject();
		jsn.put("name", "Pratik");
		jsn.put("job", "Engg");

		given().
		body(jsn.toJSONString()).
		when().
		put("https://reqres.in/api/users/2").
		then().
		statusCode(200);
		
//		PATCH request (partial modification / update)
		JSONObject jsn2 = new JSONObject();
		jsn2.put("name", "Pratik");
		jsn2.put("job", "Engg");

		given().
		body(jsn2.toJSONString()).
		when().
		patch("https://reqres.in/api/users/2").
		then().
		statusCode(200);
		
		// Delete request https://reqres.in/api/users/2
		
		JSONObject jsn3 = new JSONObject();
		jsn3.put("name", "Pratik");
		jsn3.put("job", "Engg");

		when().
		delete("https://reqres.in/api/users/2").
		then().
		statusCode(204);
		
	}
}
