package StringOperations;

import java.util.Scanner;

//How do you remove all white spaces from a string in java
public class StringReplaceAll {	
	public static void main(String[] args) {
		System.out.println("Enter a sentence"); // 1st way
		Scanner sc = new Scanner(System.in);
		String ss = sc.nextLine();
		String []p = ss.split(" "); //1st way
		for(String g : p)
		{
			System.out.print(g);	
		}
		System.out.println();
		String newss = ss.replaceAll(" " , ""); // 2nd easy way
		System.out.println(newss);
	}
}
