package StepDefinitions;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import Resources.TestDataBuild;
import Resources.Utils;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojo.AddPlace;
import pojo.Location;

public class PlaceValidationsStepDef extends Utils {
	RequestSpecification res;
	ResponseSpecification resspec;
	Response response;
	TestDataBuild data = new TestDataBuild();

	@Given("AddPlace payload with {string} {string} {string}")
	public void add_place_payload_with(String name, String language, String address) throws IOException
	{	
		res = given().spec(requestSpecification()).body(data.addPlacePayLoad(name,language,address));// directly call requestSpecification we ectended it here it possess request spec and base URI 
		// here data is object of TestDataBuild that contains pojo payload
	}

	@When("user calls {string} with POST http request")
	public void user_calls_with_post_http_request(String string) {

		// ********* Response ********* //
		resspec = new ResponseSpecBuilder()
				.expectStatusCode(200)
				.expectContentType(ContentType.JSON).build();

		response = res
				.when()
				.post("/maps/api/place/add/json")
				.then().spec(resspec).extract().response();
	}

	@Then("the API call is successfull with status code {int}")
	public void the_api_call_is_successfull_with_status_code(Integer int1) {
		assertEquals(response.getStatusCode(),200);

	}

	@Then("{string} in response body is {string}")
	public void in_response_body_is(String keyValue, String Expectedvalue) {
		String resp = response.asString();
		JsonPath js = new JsonPath(resp);
		assertEquals(js.get(keyValue).toString(),Expectedvalue);
	}


}
