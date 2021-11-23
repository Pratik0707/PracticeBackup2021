package Patterns;
//1
//22
//333
//4444
//55555
public class Pyramid_1122333 {

	public static void main(String[] args) {
		int numOfRows = 5;
		// Nested loop used here to print the pyramid numbers 
		for (int i = 0; i <= numOfRows; i++) 
		{
			for (int j = 0; j < i; j++) 
			{
				// Note we used print not println here
				System.out.print(i);
			} 
			System.out.println();
		}

	}

}
