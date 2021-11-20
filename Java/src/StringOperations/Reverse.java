package StringOperations;
import java.util.Scanner;
//WAP to reverse a string

public class Reverse {

	public static void main(String[] args) {
		System.out.println("Enter a string : ");
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		StringBuilder sb = new StringBuilder(st);
		System.out.println(sb.reverse());

		System.out.println("Enter a string : ");
		String st2 = sc.next();
		char []c= st2.toCharArray();
		for(int i=c.length-1;i>=0;i--)
		{
			System.out.print(c[i]);
		}
		System.out.println();

		String aa = "pratik";
		char []cr = aa.toCharArray();
		for(int i=cr.length-1;i>=0;i--)
		{
			System.out.print(cr[i]);
		}

		String ab = "pratik";
		StringBuilder stb = new StringBuilder();
		stb.append(ab);
		String p = stb.reverse().toString();
		System.out.println(p);
	}
}



















