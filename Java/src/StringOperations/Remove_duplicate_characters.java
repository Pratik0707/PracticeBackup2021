package StringOperations;

import java.util.ArrayList;
import java.util.HashSet;
//WAP to remove a duplicate characters from string
public class Remove_duplicate_characters {

	public static void main(String[] args) {
		String str1 = "HelloAll";
		//######### WAY 1 ######### // simply add it to hashset   
		char []arr = str1.toCharArray();
		HashSet hs = new HashSet();
		for(int i=0;i<arr.length;i++)
		{
			hs.add(arr[i]);
		}
		System.out.println("Word without duplicates : "+hs);

		//######### WAY 2 #########  // add to arraylist and use contains 
		ArrayList al = new ArrayList();
		for(int i=0;i<arr.length;i++)
		{
			if(!(al.contains(arr[i])))
			{
				al.add(arr[i]);
			}
		}
		System.out.println("Without duplicates : "+al);
	}
}
