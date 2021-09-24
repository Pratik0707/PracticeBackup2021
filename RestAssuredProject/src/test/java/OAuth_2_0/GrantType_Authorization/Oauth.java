package OAuth_2_0.GrantType_Authorization;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.given;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;
import pojo.Api;
import pojo.GetCourse;
import static org.hamcrest.Matchers.equalTo;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured.*;
import io.restassured.path.json.JsonPath;
import io.restassured.RestAssured;

public class Oauth {
	@Test
	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Pictures\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(options);

// To login to application by selenium and after login, get the URL and fetch CODE from URL
		driver.get("https://accounts.google.com/o/oauth2/v2/auth?scope=https://www.googleapis.com/auth/userinfo.email&auth_url=https://accounts.google.com/o/oauth2/v2/auth&client_id=692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com&response_type=code&redirect_uri=https://rahulshettyacademy.com/getCourse.php&state=verifyfjdss");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("srinath19830@gmail.com");
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys(Keys.ENTER);
		String url = driver.getCurrentUrl();
		String url ="https://rahulshettyacademy.com/getCourse.php?state=verifyfjdss&code=4%2FuwHwSwjuJWi4OqB4h1aPxFt25B92HCYT_cMwllKg5VmXASkJ7Wczma4OkW53xxhwNSE3QyM4wgvOkYS1DNnAHos&scope=email+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email+openid&authuser=1&session_state=dc2d5c1602dcfa5f73882f98510761055ee744e7..8dd9&prompt=none#";
		String partialcode=url.split("code=")[1]; // split URL to get CODE
		String code=partialcode.split("&scope")[0];// Final CODE


		String accessTokenResponse=	
		given().urlEncodingEnabled(false)// CODE possess special characters, Rest assured performs Encoding operation on special characters. If we use urlEncodingEnabled(false) then it will not decode values from our CODE
		.queryParams("code",code)
		.queryParams("client_id","692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
		.queryParams("client_secret","erZOWM9g3UtwNRj340YYaK_W")
		.queryParams("redirect_uri","https://rahulshettyacademy.com/getCourse.php")
		.queryParams("grant_type","authorization_code")
		.when().log().all()
		.post("https://www.googleapis.com/oauth2/v4/token").asString();
		JsonPath js=new JsonPath(accessTokenResponse);
		String accessToken=js.getString("access_token");// fetch ACCESS-TOKEN

		String r2= given().contentType("application/json")
		.queryParams("access_token", accessToken).expect().defaultParser(Parser.JSON)//use fetched ACCESS-TOKEN
		.when()
		.get("https://rahulshettyacademy.com/getCourse.php")
		.asString();
		
		// In case of NON-POJO, use below code to verify response body fields
		JsonPath jp = new JsonPath(getResp);
		String capturedAdd = jp.getString("address");
		System.out.println(capturedAdd);// we captured the JSON response of GET and we got here the address
		Assert.assertEquals(capturedAdd, ExpectedAddress);//we are aserting whether actual and expected address are same
	
		// once the authentication automation is successful, we can use the code like below 
		// to further verify the response body fields.
		// In case of ## pojo, verify like this
		System.out.println(gc.getLinkedIn()); 
		System.out.println(gc.getInstructor());
		System.out.println(gc.getCourses().getApi().get(1).getCourseTitle());

		List<Api> apiCourses=gc.getCourses().getApi();
		for(int i=0;i<apiCourses.size();i++)
		{
			if(apiCourses.get(i).getCourseTitle().equalsIgnoreCase("SoapUI Webservices testing"))
			{
				System.out.println(apiCourses.get(i).getPrice());
			}
		}

		//Get the course names of WebAutomation
		ArrayList<String> a= new ArrayList<String>();


		List<pojo.WebAutomation> w=gc.getCourses().getWebAutomation();

		for(int j=0;j<w.size();j++)
		{
			a.add(w.get(j).getCourseTitle());
		}

		List<String> expectedList=	Arrays.asList(courseTitles);

		Assert.assertTrue(a.equals(expectedList))
	}
}
}
























