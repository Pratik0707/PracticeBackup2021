package Basics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
//		Pattern p = Pattern.compile("ab");// pattern/RE we want to search
//		Matcher m = p.matcher("ababbaba");// Target string where we want to search
//		int count=0;
//		while(m.find())
//		{
//			count++;
//		System.out.println("start index : "+m.start());//start index of match
//		System.out.println("end index : "+m.end());//it returns end location+1 //a7b@2#9
//		System.out.println("what matched : "+m.group());//what string we are searching
//		}
//		System.out.println("number of occurences : "+count);
//		
		Pattern p1 = Pattern.compile("l");//split at l
		String[] aa = p1.split("Helo al learrn java");
		for(String s : aa)
		{
			System.out.println(s);
		}
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
