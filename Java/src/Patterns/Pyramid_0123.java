package Patterns;

public class Pyramid_0123 {
	//	0
	//	01
	//	012
	//	0123
	public static void main(String[] args) 
	{
		int numOfRows = 5;
		// Nested loop used here to print the pyramid numbers 
		for (int i = 0; i <= numOfRows; i++) 
		{
			for (int j = 0; j < i; j++) 
			{
				// Note we used print not println here
				System.out.print(j);
			} 
			System.out.println();
		}
	}
}
//All pyramid patterns : https://www.programiz.com/java-programming/examples/pyramid-pattern
//https://javaconceptoftheday.com/number-pattern-programs-in-java/
//https://javahungry.blogspot.com/2017/09/25-different-number-pattern-programs-in-java.html
