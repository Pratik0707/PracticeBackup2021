package StringOperations;
import java.util.ArrayList;
//How do you remove a given character from String?
import java.util.Scanner;
//WAP to remove specific character from string
public class RemoveCharacter {

	public static void main(String[] args) {
		System.out.println("Enter a string : ");
		Scanner sc = new Scanner(System.in);
		String ss = sc.next();
		System.out.println("Enter a character to remove : ");
		String rpls = sc.next();
		String finalStr = ss.replaceAll(rpls,""); // 1st way : EASY
		System.out.println(finalStr);

		// Another way : 
		char[]a = ss.toCharArray();
		char b = rpls.charAt(0);
		char[]ar = new char[a.length];
		for(int i=0;i<a.length;i++)
		{
			if(!(a[i]==b))
			{
				ar[i]=a[i];
			}
		}

		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
	}
}
