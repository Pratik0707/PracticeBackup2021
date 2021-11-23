package ArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;
// WAP to find max / Min value of array / 1st / 2nd / 3rd highest number

public class MaxArrayValue {
	public static void main(String[] args) {
//		System.out.println("Enter 5 numbers in array : ");
//		Scanner sc = new Scanner(System.in);
//		int []a = new int[4];
//		for(int i=0;i<5;i++)
//		{
//			a[i] =sc.nextInt();
//		}
		int []a = {40,99,0,5,1};
		for(int j=0;j<a.length;j++) // One way : for loop to sort array
		{
			for(int k=j+1;k<a.length;k++)
			{
				if(a[j]>a[k])
				{
					int temp = a[j];
					a[j]=a[k];
					a[k]=temp;
				}
			}
		}
		for(int q=0;q<a.length;q++)
		{
			System.out.println(a[q]);
		}
		System.out.println("Max element of array is : "+a[a.length-1]);

		int[]p = {10,5,7,9,11,0,2};
		Arrays.sort(p); // Second way : use Arrays.sort and print last element (i.e. highest) OR 1st = smalest
		System.out.println("Sorted array : ");
		for(int w=0;w<p.length;w++)
		{
			System.out.println(p[w]);
		}
	}
}
