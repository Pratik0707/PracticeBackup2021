package Basics;

import java.util.Scanner;

public class whIle {

	public static void main(String[] args) {
		System.out.println("Enter a number less than 10");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		while(a>0)
		{
			System.out.println(a);
			a--;
		}
		do
		{
			System.out.println("in do while "+a);
			a++;
		}while(a<0);
	}

}
