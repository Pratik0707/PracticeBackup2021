package StringOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//WAP to find addition of all numbers of string = nd%67sb)nd76<k6>g23p
public class alphanumeric_string_number_addition {

	public static void main(String[] args) {
		String ss = "nd%67sb)nd76<k6>g23p";
		
		Pattern p = Pattern.compile("[0-9]");
		Matcher m = p.matcher("nd%67sb)nd76<k6>g23p");
		//code to extract int values from string
		List ll = new ArrayList();
		while(m.find())
		{
			int a = Integer.parseInt(m.group());
			//System.out.println(m.group()); // it shows all matches 
			ll.add(a);
		}
		System.out.println(ll);
		//code for addition : 
		int sum=0;
		for(int k=0;k<ll.size();k++)
		{
			int a = (int) ll.get(k);
			sum=sum+a;
		}
		System.out.println("Sum of all integers present in list is : "+sum);
	}
}

// another approach >>>>>>>>>>>>>>>>>> 


//String ss = "nd%67sb)nd76<k6>g23p";
//char[]aa = ss.toCharArray();
//System.out.println(aa);
//ArrayList al = new ArrayList();
//for(int i=0;i<aa.length;i++)
//{
//	try
//	{
//		int  r = Integer.parseInt(String.valueOf(aa[i]));
//		Integer a = r;
//		if(a instanceof Integer)
//		{					
//			al.add(a);
//		}
//	}
//	catch(Exception E)
//	{
//		continue;
//	}
//}
//System.out.println("numbers from given string : "+al);
//}

