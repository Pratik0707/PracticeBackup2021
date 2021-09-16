package Resources;
import io.restassured.filter.log.ResponseLoggingFilter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;
import io.restassured.specification.*;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class Utils {
	public static RequestSpecification req;
	public RequestSpecification requestSpecification() throws IOException
	{
		// RestAssured.baseURI = "https://rahulshettyacademy.com"; removing frome here and adding to global.properties file
		// Request : 
		if(req==null)
		{
			PrintStream log = new PrintStream(new FileOutputStream("logging.txt"));// create file logging.txt runtime and store all logs in it
			req = new RequestSpecBuilder().setBaseUri(getGlobalValue("baseURl")) // accessing baseURl from properties file. check below function
					.addQueryParam("key", "qaclick123")
					.addFilter(RequestLoggingFilter.logRequestTo(log))// to log all logs for request to logging.txt
					.addFilter(ResponseLoggingFilter.logResponseTo(log))// to log all logs for request logging.txt
					.setContentType(ContentType.JSON)
					.build();

			return req;
		}
		return req;

		// aftre running runner file, and after successful execution, refresh project > will get logging.txt file in project that posses all logs of request and response
	}

	public static String getGlobalValue(String baseURl) throws IOException
	{
		Properties prop = new Properties(); //this class in java allowes us to scan any file with .properties extension
		FileInputStream fis = new FileInputStream("C:\\Users\\e5624267\\eclipse-workspace\\APIFramework\\src\\test\\java\\Resources\\global.properties");//reafing file values of global.properties
		prop.load(fis);//loads file
		prop.get(baseURl);//get baseURl from property file. it is parameter we send. what we want from property file
		return prop.getProperty(baseURl);
	}

}



















