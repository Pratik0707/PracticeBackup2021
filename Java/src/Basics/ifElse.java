package Basics;

import java.util.Scanner;

public class ifElse {

	public static void main(String[] args) {
		System.out.println("Enter a 1 or 2 : ");
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();

		if(inp == 1)
		{
			System.out.println("You entered 1");
		}

		else if(inp == 2)
		{
			System.out.println("You entered 2 ");
		}

		else {
			System.out.println("You entered different number ");

		}

	}

}
