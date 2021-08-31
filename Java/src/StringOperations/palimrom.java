package StringOperations;

import java.util.Scanner;

// WAP to check palimrom

public class palimrom {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		String ss = sc.nextLine();
		String snew="";
		for(int i=ss.length()-1;i>=0;i--)
		{
			snew = snew + ss.charAt(i);
		}
		System.out.println(snew);
		System.out.println(ss);
		if(ss.equals(snew))
		{
			System.out.println("Palimrom");
		}
		else
		{
			System.out.println("Not a palimrom");
		}

	}

}
