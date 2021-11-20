package StringOperations;
import java.util.Scanner;
// WAP to replace characters in string

public class Replace {

	public static void main(String[] args) {
		System.out.println("Enter a sentence"); // 1st way
		Scanner sc = new Scanner(System.in);
		String ss = sc.next();
		char[]c = ss.toCharArray();
		for(int i=0; i<c.length;i++)
		{
			if(c[i]=='t')
			{
				c[i]='P';
			}
			System.out.print(c[i]); 
		}
		System.out.println();
		String s1 = "Hello Java Hii";  // 2nd EASY way
		String newS = s1.replace('H', 'T');
		System.out.println(newS);

	}
}
