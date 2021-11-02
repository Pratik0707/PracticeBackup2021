package Basics;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import io.restassured.http.ContentType;

public class RegularExpression2 {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("[a-zA-Z]");// pattern/RE we want to search
		Matcher m = p.matcher("given().contentType(ContentType.JSON)\r\n"
				+ "		.auth().oauth2(accessToken)// use the ACCESS-TOKEN we got in above step\r\n");
		ArrayList<String>al = new ArrayList(); 
		while(m.find())
		{
		System.out.println("what matched : "+m.group());//Returns the matched sequence captured
		al.add(m.group());
		}//group gives us the matched elements from string
		System.out.println(al);
		
		
//		Pattern p1 = Pattern.compile("l");//split at l
//		String[] aa = p1.split("Helo al learrn java");
//		for(String s : aa)
//		{
//			System.out.println(s);
//		}
		
//		Matcher m1 = p1.matcher("ababbaba");// Target string where we want to search
//		int count1=0;
//		while(m1.find())
//		{
//			count1++;
//		System.out.println("start index : "+m1.start());//start index of match
//		System.out.println("end index : "+m1.end());//it returns end location+1
//		System.out.println("what matched : "+m1.group());//what string we are searching
//		}
//		System.out.println("number of occurences : "+count1);		
	}
}
