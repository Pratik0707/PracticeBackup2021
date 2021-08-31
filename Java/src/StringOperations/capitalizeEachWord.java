package StringOperations;
import java.util.Scanner;

//Write a java program to capitalize each word in string
public class capitalizeEachWord {

	public static void main(String[] args) {
		System.out.println("Enter a sentence : ");
		Scanner sc = new Scanner(System.in);
		String old = sc.nextLine();
		String []words = old.split(" "); //split at space
		for(String s1 : words)
		{	
			String sr1 = s1.substring(0, 1);
			String sr2 = s1.substring(1);
			String finalStr = sr1.toUpperCase() + sr2;	
			System.out.println(finalStr);
		}

		String p = "pratik Java";
		System.out.println("1  "+p.substring(1, 3));
		System.out.println("2  "+p.substring(2));
		System.out.println("3  "+p.split(" "));

	}
}
