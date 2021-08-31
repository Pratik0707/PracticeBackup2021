package StringOperations;

import java.util.Scanner;
//Write a java program to reverse each word in string
public class ReverseEachWord {

	public static void main(String[] args) {
		System.out.println("Enter a sentence : ");
		Scanner sc = new Scanner(System.in);
		String old = sc.nextLine();
		String word[] = old.split(" ");
		for(String ss : word)
		{
			StringBuilder sb = new StringBuilder(ss);
			System.out.println(sb.reverse());			
		}
	}
}
