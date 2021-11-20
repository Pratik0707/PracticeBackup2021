package StringOperations;

import java.util.ArrayList;
import java.util.HashSet;

// WAP to remove a duplicate sub-string from sentence
public class Remove_duplicate_substring {

	public static void main(String[] args) {
		String str1 = "hello all to java all you all java";
		//######### WAY 1 #########   // simply add to hashset
		String []arr = str1.split(" ");
		HashSet hs = new HashSet();
		for(int i=0;i<arr.length;i++)
		{
			hs.add(arr[i]);
		}
		System.out.println("Sentence without duplicates : "+hs);

		//######### WAY 2 #########  
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