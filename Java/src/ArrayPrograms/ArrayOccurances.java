package ArrayPrograms;

import java.util.ArrayList;
import java.util.LinkedList;

//WAP to find number of occurrences of value 10
public class ArrayOccurances {

	public static void main(String[] args) {
		int[]a = {10,5,9,7,10,0,10,4,3};   
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==10)
			{
				count++;
			}
		}
		System.out.println("Number of occurances of 10 : "+count);

		

	}
}
