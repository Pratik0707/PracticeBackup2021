package Patterns;

public class Pyramid_star_reverse {
//	* * * * 
//	* * * 
//	* * 
//	* 
	public static void main(String[] args) {
		int rows = 4;

		for (int i = rows; i >= 1; --i) {
			for (int j = 1; j <= i; ++j) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
//All pyramid patterns : https://www.programiz.com/java-programming/examples/pyramid-pattern
//https://javaconceptoftheday.com/number-pattern-programs-in-java/
//https://javahungry.blogspot.com/2017/09/25-different-number-pattern-programs-in-java.html