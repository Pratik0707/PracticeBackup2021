package StringOperations;
import java.util.Scanner;

public class allConversions {

	public static void main(String[] args) {
		System.out.println("Enter a string : ");
		Scanner sc = new Scanner(System.in);
		
		String old = sc.nextLine();
		
		// String to Char
		char[]cc=old.toCharArray();
		
		//String to Char - fetch single char from string 
		char a = old.charAt(6);
		System.out.println(a);
		
		//fetch single char from string as a string
		String c = String.valueOf(cc[2]);
		System.out.println(c);		
		
		//fetch single char from char array
		char b = cc[2];
		System.out.println(b);
		
		// Char to String - 1
		char cp = 'p';
		String sp = String.valueOf(cp);
		System.out.println(sp);
		
		// Char to String - 2
		String sp2 = Character.toString(cp);
		System.out.println(sp2);
		
		//Int to String - 1
		int i1 = 10;
		String istr = Integer.toString(i1);
		System.out.println(istr);
		
		//Int to String - 2
		String itsr2 = String.valueOf(i1);
		System.out.println(itsr2);
		
		//String to Int 
		String st = "2";
		int sti = Integer.parseInt(st);
		
		// Int to CHAR
		int p1 = 10;
		char p1c = (char) p1;
		System.out.println(p1c);
		
		// CHAR to int - 1
		char ci = '1';
		int sci = Integer.parseInt(String.valueOf(ci));
		System.out.println(sci);
		
		// CHAR to int - 2
		int sci2 = Character.getNumericValue(ci);
		System.out.println(sci2);
		
		// REVERSE string 
		StringBuilder sb = new StringBuilder(old); // has LOT of string methods
		sb.reverse();
		System.out.println(sb);
		String rev = sb.reverse().toString();
		
		
	}

}

