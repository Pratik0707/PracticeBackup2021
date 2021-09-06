package Examples;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class GetRequests {

	@Test
	public void testEx()
	{
		Response res = get("https://reqres.in/api/users?page=2");		
		System.out.println("Status code : "+res.getStatusCode());
		System.out.println("Response time : "+res.getTime());
		System.out.println("Response : "+res.getBody());
		int statusCode = res.getStatusCode();
		Assert.assertEquals(statusCode, 200);		
	}

	public void test2()
	{
		given().
		get("https://reqres.in/api/users?page=2").
		then().
		statusCode(200);

		given().get("https://reqres.in/api/users?page=2").then().body("data[1].id",equalTo(8));
		// goto json path finder tool : https://jsonpathfinder.com, and paste your json response there, then click on required field and a json path will be displayed. Take that path and use it in above statement  : data[2].id and then use equalTo : to validate with expected value  
		given().get("https://reqres.in/api/users?page=2").then().body("data[1].email", equalTo("lindsay.ferguson@reqres.in"));		
		given().get("https://reqres.in/api/users?page=2").then().body("data[1].first_name", equalTo("Lpppindsay"));
		given().get("https://reqres.in/api/users?page=2").then().body("data[1].last_name", equalTo("FergusonR"));
		given().get("https://reqres.in/api/users?page=2").then().body("data[1].avatar", equalTo("https://reqres.in/img/faces/8-image.jpg"));
// Has element > 
		given().get("https://reqres.in/api/users?page=2").then().body("data[].first_name", hasItems("Michael","Lindsay","Tobias"));
	
	}

}



















