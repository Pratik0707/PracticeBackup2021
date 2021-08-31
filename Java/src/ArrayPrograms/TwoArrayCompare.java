package ArrayPrograms;

import java.util.Arrays;

// WAP to compare 2 different array if both same or different
public class TwoArrayCompare {

	public static void main(String[] args) {
		int[]a = {10,5,8,3,14};
		int[]b = {88,63,14,78,56,9,3,7,5,4};
		int[]c = {10,5,8,3,14};
		
		if(Arrays.equals(a, b))
		{
			System.out.println("Array A and B are same");
		}
		if(Arrays.equals(a, c))
		{
			System.out.println("Array A and C are same");
		}
		
	
	}

}
