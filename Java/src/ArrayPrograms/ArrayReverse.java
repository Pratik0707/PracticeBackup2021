package ArrayPrograms;

//WAP to reverse given array
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class ArrayReverse {

	public static void main(String[] args) {
		System.out.println("Enter 5 numbers in array : ");
		Scanner sc = new Scanner(System.in);
		int[]p = new int[5];
		for(int i=0;i<p.length;i++)// read array from console
		{
			p[i]=sc.nextInt();
		}
		System.out.println("Reverse array is : ");
		for(int i=p.length-1;i>=0;i--)
		{
			System.out.print(p[i]);
		}
		
		// Easy way : to reverse string
		
		String[] arrx = {"alpha", "beta", "gamma"};
		Collections.reverse(Arrays.asList(arrx));
		System.out.println(Arrays.toString(arrx));
		
	}
}
