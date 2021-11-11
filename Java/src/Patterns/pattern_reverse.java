package Patterns;
//Selenium
//Seleniu
//Seleni
//Selen
//Sele
//Sel
//Se
//S
public class pattern_reverse {

	public static void main(String[] args) 
	{
		String ss = "Selenium";
		char[]c = ss.toCharArray();

		for (int i = c.length; i >= 1; i--) {
			for (int j = 0; j <= i-1; j++) {
				System.out.print(c[j]);
			}
			System.out.println();
		}
	}
}
