package Basics;

import java.util.Arrays;

public class array {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		System.out.println(a);

		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
//IMP  :
		String aa = a.toString();
		Arrays.sort(a);
		Arrays.toString(a);
		
		
	}

}
