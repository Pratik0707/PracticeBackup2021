package Jira;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;
// 1. Login to JIRA 
// 2. Add comment in a bug
// 3. Get() the same issue
public class AddComment_sessionFilter {
	@Test
	public void add()
	{
		RestAssured.baseURI="http://localhost:8080";
		SessionFilter ss = new SessionFilter(); // create object of session filter
		//Login
		//		String StrRes = 
		given()
		.header("Content-Type", "application/json")
		.body("{ \"username\": \"Pratik.toke07\", \"password\": \"Admin@123\" }")
		.log().all()
		.filter(ss)// use it after Body so that the same logged in session will be continue and it can be used in multiple tests. So login once and use the same session id everywhere
		.when()
		.post("/rest/auth/1/session")
		.then()
		.assertThat().statusCode(200);

		//		.extract().response().asString();		
		//		JsonPath js = new JsonPath(StrRes);
		//		String sessionId = js.get("value");



		//Add comment in Bug
		given()
		.pathParam("key","10001")// key of issue for which comment needs to be added and use this variable below
		.header("Content-Type","application/json")//.header("Cookie",sessionId) no need of this now since we are maintaining session by session object
		.body("{\r\n"
				+ "    \"body\": \"My comment 132.\",\r\n"
				+ "    \"visibility\": {\r\n"
				+ "        \"type\": \"role\",\r\n"
				+ "        \"value\": \"Administrators\"\r\n"
				+ "    }\r\n"
				+ "}")
		.filter(ss)//use sessionfilter object to continue the earlier logged-in session
		.when()
		.post("/rest/api/2/issue/{key}/comment")// this is a path parameter we are using, on line#18 we have mentioned key - 10001, we use same key parameter here
		.then()
		.assertThat()
		.statusCode(201);

		// GET 
		String respn = given().relaxedHTTPSValidation()// this bypasses https authentication like required certificates etc.
				.filter(ss)
				.pathParam("key","10001")
				.queryParam("fields", "comment")//parameter field is mentioned in contract document, menas how to refer a field, and what field to refer is : comment field. So only that field is retrieved by GET()
				.when()
				.get("/rest/api/2/issue/{key}")
				.then()
				.extract().response().asString();

		System.out.println(respn);// it will print entire huge JSON response. but I want to see just if my comment is added or not
		// for that we use query parameter on line#61


	}

}
