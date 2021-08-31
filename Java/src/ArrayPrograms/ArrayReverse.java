package ArrayPrograms;

//WAP to reverse given array
import java.util.Scanner;
public class ArrayReverse {

	public static void main(String[] args) {
		System.out.println("Enter 5 numbers in array : ");
		Scanner sc = new Scanner(System.in);
		int[]p = new int[5];
		for(int i=0;i<p.length;i++)
		{
			p[i]=sc.nextInt();
		}
		System.out.println("Reverse array is : ");
		for(int i=p.length-1;i>=0;i--)
		{
			System.out.print(p[i]);
		}
	}
}
