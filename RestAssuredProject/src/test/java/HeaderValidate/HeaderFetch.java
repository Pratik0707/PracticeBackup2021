package HeaderValidate;
import java.util.List;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import junit.framework.Assert;

public class HeaderFetch {

public void getALlHeadersFromResponse()
	{
		Response response= 
				RestAssured
					.given()
					.get("https://restful-booker.herokuapp.com/booking/1")
					.then()
					.extract()
					.response();
		
		System.out.println("All Headers of response are :- ");
		Headers allHeaders = response.getHeaders();
		for(Header header : allHeaders)      // PRINT HEADERS
		{
			System.out.print(header.getName() +" : ");
			System.out.println(header.getValue());
		}
		
		System.out.println("Value of Header Content-Type : "+response.getHeader("Content-Type"));
		
		
		// ASSERT HEADERS
		
		String v1 = response.getHeaders().get("Content-Type").getValue();
		String v2 = response.getHeaders().getValue("Content-Type");
		String Expected = "dsad";
		
		Assert.assertEquals(v2, Expected);
		
		
		// PRINT HEADERS
		
		List<Header> allValue = response.getHeaders().getList("Content-Type");
		for(Header header : allValue)
		{
			System.out.print(header.getName() +" : ");
			System.out.println(header.getValue());
		}
				
		
	}	
	
}