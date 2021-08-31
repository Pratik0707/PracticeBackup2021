package StringOperations;

import java.util.HashSet;

public class charEqual {

	public static void main(String[] args) {
		char a1='p';
		char a2='p';
		if(a1==a2)
		{
			System.out.println("Equal");
		}

		String s1= "pp";
		String s2= "pp";
		if(s1==s2)
		{
			System.out.println("string equal with ==");
		}
		else
		{
			System.out.println("== not working fro string compare");
		}
		if(s1.equals(s2))
		{
			System.out.println("String equal with .equal");
		}
		else
		{
			System.out.println(".equal doesnt compare string");
		}

		if(s1.charAt(0)==s2.charAt(1))
		{
			System.out.println("successful char compare");
		}
		else
		{
			System.out.println("no char compare");	
		}

		String str = "pratipkpl";
		HashSet hs = new HashSet();
		for(int i=0;i<str.length();i++)
		{
			if(hs.add(str.charAt(i)))
			{
			}
			else
			{
				System.out.println("Duplicate char : "+str.charAt(i));
			}			
		}
		System.out.println(hs);










	}
}
