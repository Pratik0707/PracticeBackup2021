package StringOperations;
import java.util.HashSet;
//WAP to find first duplicate character in a string
public class FirstDuplicateChar {

	public static void main(String[] args) {
		String str = "pratipkp";
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
	}
}
