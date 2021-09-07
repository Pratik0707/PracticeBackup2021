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

public class TestOnLocalAPI_PUT_PATCH {

	//@Test
//	public void PutReq()
//	{
//		//POST req
//		JSONObject jsn = new JSONObject();
//		jsn.put("id", "4");
//		jsn.put("name", "Pratik-byPost");
//		jsn.put("lastname", "Lnm-byPost");
//
//		given()
//		.contentType(ContentType.JSON)
//		.accept(ContentType.JSON)
//		.body(jsn.toJSONString())
//		.when()
//		.put("http://localhost:3000/users/4") //for put : give specific URL of specific nod / jsone entry whi u want to update. Here I want to update user-4
//		.then()
//		.statusCode(200);
//
//	}
	
	@Test
	public void patchReq()
	{
		//PUT req
		JSONObject jsn = new JSONObject();
		jsn.put("id", "40");

		given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(jsn.toJSONString())
		.when()
		.patch("http://localhost:3000/users/4") //for put : give specific URL of specific nod / jsone entry whi u want to update. Here I want to update user-4
		.then()
		.statusCode(200);

	}
}	

//}











































