package Patterns;

public class Pyramid_123_reverse {
//	1 2 3 4 
//	1 2 3 
//	1 2 
//	1 
	public static void main(String[] args) {
		int rows = 4;

		for (int i = rows; i >= 1; --i) {
			for (int j = 1; j <= i; ++j) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
//All pyramid patterns : https://www.programiz.com/java-programming/examples/pyramid-pattern