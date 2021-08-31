package StringOperations;
import java.util.ArrayList;
import java.util.HashSet;

// WAP to print the first non-repeated character from a string
public class NonRepeatingChar {

	public static void main(String[] args) {
		String given = "Pratikpr";
		
		char[]givenchar = given.toCharArray();
		int count = 0;
		for(int i=0;i<givenchar.length;i++)
		{
			char temp1 = givenchar[i];
			for(int j=0;j<givenchar.length;j++)
			{
				char temp2 = givenchar[j];
				if(i!=j && temp1==temp2)
				{
					count++;	
					if(count==0)
					{
						System.out.println(givenchar[i]);
					}
				}				
			}			
		}
	}
}
