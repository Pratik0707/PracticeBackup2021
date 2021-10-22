package SerializePOJO;
import static io.restassured.RestAssured.given;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import java.util.ArrayList;
import java.util.List;

public class SerializeEx {
	@Test
	public void ser()
	{
		AddPlace p = new AddPlace();
		p.setAccuracy(50);
		p.setAddress("address 123");
		p.setLanguage("Language test");
		p.setName("Test ser name");
		p.setPhone_number("1321564456");
		p.setWebsite("www.abc.com");
		List<String> mylist = new ArrayList<>();// add elements as below to the list
		mylist.add("first");
		mylist.add("Second");
		p.setTypes(mylist);
		Location lc = new Location();// new class we created for location
		lc.setLat(89.35); // values for location class
		lc.setLng(9.55);
		p.setLocation(lc);

		RestAssured.baseURI = "https://rahulshettyacademy.com";
		Response res = 
				given().log().all()
				.queryParam("key", "qaclick123")
				.body(p)//pasing object of addplace class where we have all getter and setter
				.when()
				.post("/maps/api/place/add/json")
				.then().assertThat().statusCode(200)
				.extract().response();

		System.out.println(res);

	}

}

