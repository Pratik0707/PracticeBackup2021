package Patterns;
//WAP to print * pyramid
public class Pyramid_stars {
//	*
//	**
//	***
//	****
	public static void main(String[] args) {
		int rows = 5;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
//All pyramid patterns : https://www.programiz.com/java-programming/examples/pyramid-pattern
//https://javaconceptoftheday.com/number-pattern-programs-in-java/
//https://javahungry.blogspot.com/2017/09/25-different-number-pattern-programs-in-java.html