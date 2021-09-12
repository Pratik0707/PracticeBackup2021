package Examples;
import org.testng.Assert;
import org.testng.annotations.Test;

import Mock.MockJSON;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

// here we will use a JSON kept in Mock > MockJSON file as a MOCK json.


/*
 * *********** JsUse below JSON and solve the Queries  *********** *
{

"dashboard": {

"purchaseAmount": 910,

"website": "rahulshettyacademy.com"

},

"courses": [

{

"title": "Selenium Python",

"price": 50,

"copies": 6

},

{

"title": "Cypress",

"price": 40,

"copies": 4

},

{

"title": "RPA",

"price": 45,

"copies": 10

}

]

}



1. Print No of courses returned by API

2. Print Purchase Amount

3. Print Title of the first course

4. Print All course titles and their respective Prices

5. Print no of copies sold by RPA Course

6. Verify if Sum of all Course prices matches with Purchase Amount
 */
public class MockPractice1 {

	@Test
	public static void practice()
	{
		JsonPath js = new JsonPath(MockJSON.course()); // here we have used mocked JSON

		// 1. Print No of courses returned by API
		int count = js.getInt("courses.size()");
		System.out.println(count);

		// 2. Print Purchase Amount
		int amount = js.getInt("dashboard.purchaseAmount"); // find by jsonpathfinder
		System.out.println(amount);

		// 3. Print Title of the first course
		String title = js.getString("courses[0].title");
		System.out.println(title);

		// 4. Print All course titles and their respective Prices
		for(int i=0;i<count;i++)
		{
			System.out.println(js.getString("courses["+i+"].title"));
			System.out.println(js.getString("courses["+i+"].price"));
		}

		// 5. Print no of copies sold by RPA Course		
		for(int i=0;i<count;i++)
		{
			String captured = js.getString("courses["+i+"].title");
			if(captured.equals("RPA"))
			{
				System.out.println(js.getString("courses["+i+"].copies"));
			}
		}

		



	}
}












