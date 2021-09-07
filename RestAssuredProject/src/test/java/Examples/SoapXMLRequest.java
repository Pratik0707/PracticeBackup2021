package Examples;
import org.testng.Assert;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.internal.util.IOUtils;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import org.apache.commons.io.IOUtils.*
;// here we will test SOAP API with XML response
public class SoapXMLRequest {

	@Test
	public void validateSOAPXml() throws IOException
	{
		File fl = new File("C:/Users/e5624267/add.xml");
		FileInputStream fip = new FileInputStream(fl);
		String requestBody = org.apache.commons.io.IOUtils.toString(fip,"UFT-8");
				RestAssured
				.given()
				.contentType("text/xml")
				.accept(ContentType.XML)
				.body(requestBody)
				.when()
				.post("http://www.dneonline.com/calculator.asmx?op=Add")
				.then()
				.statusCode(200);
	}
}








































