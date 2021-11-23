package ArrayPrograms;

import java.util.Arrays;

public class Array_Sort_alphanumeric {
// >>>>>>>>> WAY 1
	public static void main(String[] args) {
		String ss= "25$9$90$$##90";
		char[]arr=ss.toCharArray();
		
		for (int i = 0; i < arr.length; i++)   
		{  
			for (int j = i + 1; j < arr.length; j++)   
			{  
				char tmp = 0;  
				if (arr[i] > arr[j])   
				{  
					tmp = arr[i];  
					arr[i] = arr[j];  
					arr[j] = tmp;  
				}  
			}  
			//prints the sorted element of the array  
			System.out.println(arr[i]);  
		} 
		
		// >>>> EASY >>>>> WAY 2 
		String ss2= "25$9$90$$##90";
		char[]arr2=ss.toCharArray();
		Arrays.sort(arr2);
		System.out.println(arr2);
	}
}
