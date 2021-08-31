package ArrayPrograms;
// WAP to find missing element in ARRAY

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		int []a = {11,12,14,15,16};
		Arrays.sort(a); // sort array first
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]!=(a[i]+1))
				{
					System.out.println("missing element is : "+(a[i]+1));
				}
				break;
			}
		}
	}
}
