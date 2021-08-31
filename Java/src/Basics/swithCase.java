package Basics;

import java.util.Scanner;

public class swithCase {

	public static void main(String[] args) {
		System.out.println("Enter a nuber from 1 to 4 : ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		switch(input)
		{
		case 1 : System.out.println("One");break;
		case 2 : System.out.println("two");break;
		default : System.out.println("You have netered : "+input+". This is other than 1 to 5 ");break;
		case 3 : System.out.println("three");break;
		case 4 : System.out.println("foure");break;
		case 5 : System.out.println("Five");break;
		//default : System.out.println("You have netered : "+input+". This is other than 1 to 5 ");
		}

	}

}
