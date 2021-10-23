package ArrayPrograms;

public class Array_Sort {

	public static void main(String[] args) {
		
		int arr[]= {10,0,5,0,8,9,55,7,0,78};
		
		for (int i = 0; i < arr.length; i++)   
		{  
			for (int j = i + 1; j < arr.length; j++)   
			{  
				int tmp = 0;  
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
	}
}
