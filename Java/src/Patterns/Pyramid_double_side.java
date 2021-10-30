package Patterns;

public class Pyramid_double_side {
//     1 
//   2 3 2 
// 3 4 5 4 3 
//4 5 6 7 6 5 4 
	public static void main(String[] args) {
		int rows = 4, k = 0, count = 0, count1 = 0;

		for (int i = 1; i <= rows; ++i) {
			for (int space = 1; space <= rows - i; ++space) {
				System.out.print("  ");
				++count;
			}

			while (k != 2 * i - 1) {
				if (count <= rows - 1) {
					System.out.print((i + k) + " ");
					++count;
				} else {
					++count1;
					System.out.print((i + k - 2 * count1) + " ");
				}

				++k;
			}
			count1 = count = k = 0;

			System.out.println();
		}
	}
}
//All pyramid patterns : https://www.programiz.com/java-programming/examples/pyramid-pattern
//https://javaconceptoftheday.com/number-pattern-programs-in-java/
//https://javahungry.blogspot.com/2017/09/25-different-number-pattern-programs-in-java.html