package ArrayPrograms;

import java.util.Arrays;

public class ARRAYSoperations {

	public static void main(String[] args) {
		int[]a = {10,5,8,3,14};
		int[]b = {88,63,14,78,56,9,3,7,5,4};
		int[]c = {10,5,8,3,14};
		char []d= {'d','r'};

		Arrays.sort(b); //Sorts array
		for(int i : b)
		{
			System.out.println(i);
		}
		Arrays.toString(a); // converts int array to string array
		Arrays.toString(d); // converts char array to string array

		Arrays.sort(b); // sorts array

	}

}
