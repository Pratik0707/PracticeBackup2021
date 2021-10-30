package Patterns;
//10 9 8 7 
//6 5 4 
//3 2 
//1 
public class Pyramid_1098_reverse_bottomUp {

	public static void main(String[] args) {
		int a = 10;
        for (int i = 4; i > 0; i--) 
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(a-- + " ");
            }
            System.out.println();
        }
	}
}
