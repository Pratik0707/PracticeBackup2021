package StringOperations;
import java.util.Scanner;

//Write a java program to tOGGLE each word in string
public class toggleWord {

	public static void main(String[] args) {
		System.out.println("Enter a sentence"); // 1st way
		Scanner sc = new Scanner(System.in);
		String ss = sc.nextLine();
		String [] word = ss.split(" ");
		for(String st : word)
		{
			String s1 = st.substring(0, 1);
			String s2 = st.substring(1);
			String s3 = s1+s2.toUpperCase();
			System.out.println(s3);			
		}
	}
}
