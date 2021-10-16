package Schema_Validation;
import org.testng.Assert;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.json.simple.JSONObject;
// here we will verify json response against json schema
// for this, generally we get json schema from developers, but here we have created a json schema file n : target>class folder (via folder explorer). 
//here add a text filr and add schema in the file
//to get schema : copy json and pest in : https://www.liquid-technologies.com/online-json-to-schema-converter. 
//get schema and pest in the above file
public class JsonSchemaValidator {

	@Test
	public void schemaValidator()
	{
		given()
		.get("https://reqres.in/api/users?page=2")
		.then()
		.assertThat().body(matchesJsonSchemaInClasspath("Schema_.json"))
		.statusCode(200);
	}
}

